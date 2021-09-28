package com.itea.color.dto

// case-классы называются `case` потому что их можно использовать в `match/case` операциях
case class RGBDto(red: Int = 255, green: Int = 255, blue: Int = 255) {
  override def toString: String =
    s"""RGB:
       |red = $red
       |green = $green
       |blue = $blue
       |""".stripMargin
}
