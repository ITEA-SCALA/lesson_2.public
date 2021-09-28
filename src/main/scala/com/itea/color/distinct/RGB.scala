package com.itea.color.distinct

/**
 * sealed trait - это способ сообщить компилятору, что не будет классов или других признаков, наследующих этот класс, кроме тех, которые находятся в одном файле
 * Классы-sealed (или признаки) могут наследоваться в том же исходном файле
 * ( Классы-final не могут быть унаследованы вообще )
 */
sealed trait RGB extends Color {
  override def value: (Int, Int, Int)
}

object RGB {
  object RED extends RGB {
    val name = "Red"
    val value = (255, 0, 0)
  }
  object ORANGE extends RGB {
    val name = "Orange"
    val value = (255, 165, 0)
  }
  object YELLOW extends RGB {
    val name = "Yellow"
    val value = (255, 255, 0)
  }
  object GREEN extends RGB {
    val name = "Green"
    val value = (0 ,128, 0)
  }
  object BLUE extends RGB {
    val name = "Blue"
    val value = (0, 0, 255)
  }
  object INDIGO extends RGB {
    val name = "Indigo"
    val value = (75, 0, 130)
  }
  object VIOLET extends RGB {
    val name = "Violet"
    val value = (238, 130, 238)
  }
}
