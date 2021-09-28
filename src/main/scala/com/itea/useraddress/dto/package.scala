package com.itea.useraddress

import java.time.LocalDate

package object dto {

  case class Address(state: String = "", city: String = "", street: String = "", buildingNumber: Int = 0, flatNumber: Int = 0, zipCode: Int= 0) {
    override def toString: String =
      s"""
        |State: $state
        |City: $city
        |Street: '$street'
        |Building number: $buildingNumber
        |Flat number: $flatNumber
        |Zip code: '$zipCode'
        """.stripMargin
  }

  case class User(name: String = "", surname: String = "", dateOfBirth: LocalDate = LocalDate.now, sex: Char = ' ', age: Int = 0, business: String = "") {
    override def toString: String =
      s"""
        |MR: '$name $surname'
        |Date Of Birth: ${dateOfBirth.minusYears(age)}
        |Sex: ($sex)
        |Age: $age-years
        |Business: '$business'
        """.stripMargin
  }

}
