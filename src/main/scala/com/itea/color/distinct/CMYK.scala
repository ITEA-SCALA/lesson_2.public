package com.itea.color.distinct

/**
 * sealed trait - это способ сообщить компилятору, что не будет классов или других признаков, наследующих этот класс, кроме тех, которые находятся в одном файле
 * Классы-sealed (или признаки) могут наследоваться в том же исходном файле
 * ( Классы-final не могут быть унаследованы вообще )
 */
sealed trait CMYK extends Color {
  override def value: (Int, Int, Int, Int)
}

object CMYK {
  object RED extends CMYK {
    val name = "Red"
    val value = (0, 100, 100, 0)
  }
  object ORANGE extends CMYK {
    val name = "Orange"
    val value = (0, 35, 100, 0)
  }
  object YELLOW extends CMYK {
    val name = "Yellow"
    val value = (0, 0, 100, 0)
  }
  object GREEN extends CMYK {
    val name = "Green"
    val value = (100, 0, 100, 50)
  }
  object BLUE extends CMYK {
    val name = "Blue"
    val value = (100, 100, 0, 0)
  }
  object INDIGO extends CMYK {
    val name = "Indigo"
    val value = (42, 100, 0, 49)
  }
  object VIOLET extends CMYK {
    val name = "Violet"
    val value = (0, 45, 0, 7)
  }
}
