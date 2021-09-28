>> (12 ошибок при построении архитектуры ПО) https://dou.ua/lenta/articles/architecture-mistakes/

(scala case class dto)
 --------------------
>>> (Чому case-класи називаються case? Тому що їх можна використовувати в match/case операторі) https://dou.ua/lenta/columns/java8-vs-scala/
    (Java 8/Scala — різниця в підходах та взаємні інновації)
>>  (Scala: классы case и сопутствующие объекты * Хочу выделить copy метод) http://fruzenshtein.com/scala-case-class-companion-object/

>>  https://stackoverflow.com/questions/40019089/scala-convert-model-object-to-dto
    https://www.titanwolf.org/Network/q/c4e303b1-67d1-4522-bae1-ff938a6674bc/y
    https://coderoad.ru/40019089/Scala-преобразование-объекта-модели-в-DTO
>>  https://medium.com/beingprofessional/use-of-implicit-to-transform-case-classes-in-scala-47a72dfa9450
    http://allaboutscala.com/tutorials/chapter-2-learning-basics-scala-programming/enum-algebraic-data-types/


(scala enum data type)
 --------------------
>>> (Scala Enumerations * Проблемы с scala.Enumeration) https://pedrorijo.com/blog/scala-enums/
                                                        https://www.scala-lang.org/api/current/scala/Enumeration.html
>> http://allaboutscala.com/tutorials/chapter-2-learning-basics-scala-programming/learn-to-create-use-enumerations/
   https://www.geeksforgeeks.org/enumeration-in-scala/#:~:text=Java%20or%20C.-,Scala%20provides%20an%20Enumeration%20class%20which%20we%20can%20extend%20in,lot%20of%20functions%20get%20inherited.
>> (Scala 3 Enumerations) https://dotty.epfl.ch/docs/reference/enums/enums.html

(java пакет distinct enum)
 -----------------------
>>  https://overcoder.net/q/2673625/java-8-streams-api-работа-с-list
```scala
List<String> cities = ...
int sum = cities.stream()
    .map(CityEnum::valueOf)
    .distinct()
    .mapToInt(CityEnum::ordinal)
    .sum();
```

(scala package object)
 --------------------
>>> (docs — Scala 2 * ОБЪЕКТЫ ПАКЕТА) https://docs.scala-lang.org/ru/tour/package-objects.html
>>  https://www.geeksforgeeks.org/scala-package-objects/
```scala
//File Path: ../src/language/GFG/package.scala
package language
package object GFG
{
  val fees = "fees"
  val tax = "tax"
}
```
>>  https://www.baeldung.com/scala/package-import

(scala sealed что это)
 --------------------
>>  (В чем разница между final class и sealed class в Scala?) https://question-it.com/questions/2300312/v-chem-raznitsa-mezhdu-final-class-i-sealed-class-v-scala
    https://overcoder.net/q/505675/класс-объект-черта-запечатанная-черта-в-скале

(scala implicit что это)
 ----------------------
>>  https://habr.com/ru/post/451358/
     https://habr.com/ru/post/354028/

>>> (Учусь playframework) https://riptutorial.com/Download/playframework-ru.pdf
>>  (Каковы основные различия между Play Framework 1.0 и 2.0) https://www.it-swarm.com.ru/ru/playframework/kakovy-osnovnye-razlichiya-mezhdu-play-framework-1.0-i-2.0/941317481/