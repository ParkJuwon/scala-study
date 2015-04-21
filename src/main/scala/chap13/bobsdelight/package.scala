package chap13

//import bobsdelights.Fruit

/**
 * Created by Real on 2015-03-29.
 */
package object bobsdelight {
  def showFruit(fruit : Fruit): Unit = {
    import fruit._
    println(name + "s are " + color)
  }
}
