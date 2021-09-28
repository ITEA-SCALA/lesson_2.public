package com.itea.color

package object dto {

  //  def castRGBDto(value: AnyRef): RGBDto = value.asInstanceOf[RGBDto] // приведение типов с помощью `asInstanceOf`
  def castRGBDto(value: AnyRef): RGBDto = value match { case dto: RGBDto => dto } // приведение типов с помощью `match/case`

//  def castCMYKDto(value: AnyRef): CMYKDto = value.asInstanceOf[CMYKDto] // приведение типов с помощью `asInstanceOf`
  def castCMYKDto(value: AnyRef): CMYKDto = value match { case dto: CMYKDto => dto } // приведение типов с помощью `match/case`

}
