package chap12

/**
 * Created by john.p on 15. 2. 27..
 */
class Animal
trait HashLegs

class Frog extends Animal with Philosophical with HashLegs{
  override def toString = "green"

  override def philosopize(): Unit = {
    println("It ain't easy being " + toString + " ! ")
  }
}
