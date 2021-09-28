package com.itea.color

import com.itea.color.distinct._
import com.itea.color.dto._

package object service {

  def convertColor(color: Color): (String, AnyRef) = color match {
    case rgb: RGB =>
      val (r, g, b) = rgb.value
      (rgb.name, RGBDto(red = r, green = g, blue = b))
    case cmyk: CMYK =>
      val (cyan, magenta, yellow, black) = cmyk.value
      (cmyk.name, CMYKDto(cyan = cyan, magenta = magenta, yellow = yellow, black = black))
    case _ => ??? // Nothing
  }

  def convertToRgb(name: String): (String, (Int, Int, Int)) = (RGBEnum.withName(name).name, RGBEnum.withName(name).value)

  def convertToCmyk(name: String): (String, (Int, Int, Int, Int)) = (CMYKEnum.withName(name).name, CMYKEnum.withName(name).value)

  def rgbToCmyk(dto: RGBDto): CMYKDto = {
    def rgbToCmyk(red: Int, green: Int, blue: Int): CMYKDto = {
      val _black = Math.min( Math.min(255 - red, 255 - green), 255 - blue)
      if (_black != 255) {
        val _cyan = (255 - red - _black) / (255 - _black)
        val _magenta = (255 - green - _black) / (255 - _black)
        val _yellow  = (255 - blue - _black) / (255 - _black)
        CMYKDto(cyan = _cyan, magenta = _magenta, yellow = _yellow, black = _black)
      } else {
        val _cyan = 255 - red
        val _magenta = 255 - green
        val _yellow = 255 - blue
        CMYKDto(cyan = _cyan, magenta = _magenta, yellow = _yellow, black = _black)
      }
    }
    rgbToCmyk(red = dto.red, green = dto.green, blue = dto.blue)
  }

  def cmykToRgb(dto: CMYKDto): RGBDto = {
    def cmykToRgb(cyan: Int, magenta: Int, yellow: Int, black: Int): RGBDto = {
      if (black != 255) {
        val _red: Int = ((255 - cyan) * (255 - black)) / 255
        val _green: Int = ((255 - magenta) * (255 - black)) / 255
        val _blue: Int = ((255 - yellow) * (255 - black)) / 255
        RGBDto(red = _red, green = _green, blue = _blue)
      } else {
        val _red: Int = 255 - cyan
        val _green: Int = 255 - magenta
        val _blue: Int = 255 - yellow
        RGBDto(red = _red, green = _green, blue = _blue)
      }
    }
    cmykToRgb(cyan = dto.cyan, magenta = dto.magenta, yellow = dto.yellow, black = dto.black)
  }

}
