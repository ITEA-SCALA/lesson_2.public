package com.itea.color.distinct

object CMYKEnum extends Enumeration {
  /**
   * абстрактный класс `Value` является наследником от класса Val(i, name)
   * а внутренний метод `Value`, класса `Enumeration` вызывает его
   * элементы созданные методом `Value` добавляются в класс `ValueSet` - как список...
   * ***
   * класс `ColorVal` является наследником от класса Val(i, name)
   * еще класс `ColorVal` является case-классом, который возвращает поля что проинициализированы в параметрах
   */
  protected case class ColorVal(name: String, value: (Int, Int, Int, Int)) extends super.Val()
  /**
   * implicit позволяют избежать вызывания методов или явных ссылок на переменные, и взамен этого позволяют компилятору самому найти нужные неявные данные
   *
   * Неявный параметр — это параметр функции, которому предшествует ключевое слово implicit
   * Оно значит, что, если не передано никакого значения при вызове функции, то компилятор собственноручно будет искать неявный параметр и передаст его за нас
   *
   * Неявные параметры (implicit parameters, values) они являются автоматически переданными компилятором значениями, объявленными через `implicit`
   *
   * Неявное преобразование (implicit conversion)
   * При несовпадении типа ожидаемого параметра с входящим параметром компилятор ищет любой метод в области видимости, отмеченный implicit и с нужными в данной ситуации ожидаемым параметром и входящим параметром и автоматически его передаёт
   * ***
   * Каждый раз, перед вызовом элемента объекта `Enumeration`, выполняется приведение типов `value.asInstanceOf[ColorVal]` ... и возвращаемый неявный параметр передаст его за нас
   */
  implicit def convert(value: Value): ColorVal = value.asInstanceOf[ColorVal]

  val RED = ColorVal("Red", (0, 100, 100, 0))
  val ORANGE = ColorVal("Orange", (0, 35, 100, 0))
  val YELLOW = ColorVal("Yellow", (0, 0, 100, 0))
  val GREEN = ColorVal("Green", (100, 0, 100, 50))
  val BLUE = ColorVal("Blue", (100, 100, 0, 0))
  val INDIGO = ColorVal("Indigo", (42, 100, 0, 49))
  val VIOLET = ColorVal("Violet", (0, 45, 0, 7))
}
