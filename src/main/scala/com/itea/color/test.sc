/**
 * @see https://habr.com/ru/post/451358/
 *      https://habr.com/ru/post/354028/
 */

//// С переданным явно параметром сработает
//def double1(implicit value: Int): Int = value * 2
//println( double1(3) )  // 6
//
//// С неявным параметром это будет выглядеть так
//def double2(implicit value: Int): Int = value * 3 // double2: (implicit value: Int)Int
//implicit val multiplier = 2 // multiplier: Int = 2
//println( double2 ) // 6

// Пример с передачей в качестве неявного параметра def:
def double3(implicit value: Int): Int = value * 3
val cappucinoLarge: Boolean = false
implicit def cappucinoPrice: Int = if (cappucinoLarge) 200 else 100
println( double3 ) // 200

//def func1(implicit value1: Int)                          // value1 неявно
//def func2(implicit value1: Int, value2: Int)             // value1 и value2 неявны
////def func3(value1: Int, implicit value2: Int)             // ошибка компиляции
//def func4(value1: Int)(implicit value2: Int)             // только value2 неявно
////def func5(implicit value1: Int)(value2: Int)             // ошибка компиляции
////def func6(implicit value1: Int)(implicit value2: Int)    // ошибка компиляции


object MyEnumeration extends Enumeration {
  /**
   * @see https://www.geeksforgeeks.org/enumeration-in-scala
   * абстрактный класс `Value` является наследником от класса Val(i, name)
   * а внутренний метод `Value`, класса `Enumeration` вызывает его
   * элементы созданные методом `Value` добавляются в класс `ValueSet` - как список...
   */
  val one = Value(1, "One")
  val two = Value(2, "Two")
}

MyEnumeration.values // res1: MyEnumeration.ValueSet = MyEnumeration.ValueSet(One, Two)
MyEnumeration.one // res2: MyEnumeration.Value = One
MyEnumeration.withName("One") // res3: MyEnumeration.Value = One

object Abc extends Enumeration {
  case class AbcVal(name: String, value: (Int, Int, Int)) extends super.Val()
  implicit def convert(value: Value): AbcVal = value.asInstanceOf[AbcVal]
  val RED = AbcVal("Red", (255, 0, 0))
  val ORANGE = AbcVal("Orange", (255, 165, 0))
}

Abc.ORANGE // res4: Abc.AbcVal = ORANGE
Abc.values // res5: Abc.ValueSet = Abc.ValueSet(RED, ORANGE)
Abc.withName("RED") // res6: Abc.Value = RED
Abc.withName("RED").name // res7: String = Red
Abc.withName("RED").value // res8: (Int, Int, Int) = (255,0,0)












