package com.itea.useraddress

import com.itea.useraddress.dto._
import java.time.LocalDate

object Application extends App {

  val address1: Address = Address(state = "Illinois", city = "Chicago", street = "Deer Ridge Drive", buildingNumber = 195, zipCode = 60601)
  val user1: User = User(name = "Ivan", surname = "Ivanov", sex = 'M', age = 25, business = "driver")
  val user2: User = User(name = "Olga", surname = "Sergeevna", sex = 'W', age = 23, business = "teacher")
  val user3: User = User(name = "Vasily", surname = "Petrovith", sex = 'M', age = 8, business = "schoolboy")

  def getPerson(): (String, LocalDate, Char, String, String) = {
    (user1.name + " " + user1.surname, user1.dateOfBirth.minusYears(user1.age), user1.sex, address1.city, address1.street + " " + address1.buildingNumber)
  }

  println( address1 )
  println( user1 )
//  println( user2 )
//  println( user3 )
  val (fullName, dateOfBirth, sex, city, street) = getPerson
  println(s"""
      |Person =>
      |Full Name: '$fullName'
      |Date of Birth: $dateOfBirth
      |Sex ($sex)
      |Address: '$city, $street'
      |""".stripMargin)

//  var person = (String, LocalDate, Char, String, String)
  val person = getPerson
  println(s"Person => $person")

  /*
    State: Illinois
    City: Chicago
    Street: 'Deer Ridge Drive'
    Building number: 195
    Flat number: 0
    Zip code: '60601'


    MR: 'Ivan Ivanov'
    Date Of Birth: 1996-09-28
    Sex: (M)
    Age: 25-years
    Business: 'driver'


    Person =>
    Full Name: 'Ivan Ivanov'
    Date of Birth: 1996-09-28
    Sex (M)
    Address: 'Chicago, Deer Ridge Drive 195'
   */
}
