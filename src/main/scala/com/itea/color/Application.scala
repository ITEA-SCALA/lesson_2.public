package com.itea.color

import com.itea.color.distinct._
import com.itea.color.dto._
import com.itea.color.service._

object Application extends App {

  // Default convert color (1)
  val (rgbName1, rgbValue1) = convertToRgb("RED")
  println( s"RGB$rgbValue1 => $rgbName1" ) // RGBEnum(255,0,0) => Red

  val (cmykName2, cmykValue2) = convertToCmyk("RED")
  println( s"CMYK$cmykValue2 => $cmykName2" ) // CMYKEnum(0,100,100,0) => Red

  // Default convert color (2)
  var (rgbName, rgbValue) = convertColor(RGB.RED)
  val rgbDto: RGBDto = castRGBDto(rgbValue)
  println( s"$rgbName => $rgbDto" ) // Red => RGBDto(255,0,0)

  var (cmykName, cmykValue) = convertColor(CMYK.RED)
  val cmykDto: CMYKDto = castCMYKDto(cmykValue)
  println( s"$cmykName => $cmykDto" ) // Red => CMYKDto(0,100,100,0)

  // Custom convert color
  println( s"$rgbName => " + rgbToCmyk(rgbDto) )
  println( s"$cmykName => " + cmykToRgb(cmykDto) )

}
