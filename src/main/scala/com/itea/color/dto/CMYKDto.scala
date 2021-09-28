package com.itea.color.dto

// case-классы называются `case` потому что их можно использовать в `match/case` операциях
case class CMYKDto(cyan: Int = 100, magenta: Int = 100, yellow: Int = 100, black: Int = 1) {
  override def toString: String =
    s"""CMYK:
       |cyan = $cyan
       |magenta = $magenta
       |yellow = $yellow
       |black = $black
       |""".stripMargin
}
