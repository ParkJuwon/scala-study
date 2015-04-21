package chap12

import chap12.ractangle.{Rectangle, Rational}

/**
 * Created by john.p on 15. 2. 27..
 */
object TraitTest extends App{
  val frog = new Frog
  frog.philosopize()

  val phil : Philosophical = frog
  phil.philosopize()

  val rect = new Rectangle(new Point(1, 1), new Point(10, 10))
  println(rect.left)
  println(rect.right)
  println(rect.width)


  val half = new Rational(1, 2)
  val third = new Rational(1, 3)

  println(half < third)
  println(half > third)
}
