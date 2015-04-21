package chap13

/**
 * Created by Real on 2015-03-29.
 */
// 임포트 준비가 된 밥의 과일 클래스들
abstract class Fruit(
                      val name: String,
                      val color: String
                      )
object Fruit {
  object Apple extends Fruit("apple", "red")
  object Orange extends Fruit("orange", "orange")
  object Pear extends Fruit("Pear", "yellowish")
  val menu = List(Apple, Orange, Pear)
}

