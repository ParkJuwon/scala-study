package chap13

/**
 * Created by Real on 2015-03-29.
 */

// 동반 클래스와 객체의 비공개 맴버 접근
class Rocket {
  import Rocket.fuel
  private def canGoHomeAgain = fuel > 20
}

object Rocket {
  private def fuel = 10
  def chooseStrategy(rocket : Rocket) {
    if (rocket.canGoHomeAgain)
      goHome()
    else
      pickAStar()
  }

  def goHome(){}
  def pickAStar(){}
}
