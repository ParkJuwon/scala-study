package chap10

import chap10._
/**
 * Created by john.p on 15. 2. 16..
 */
object Test extends App{

//  val ae = new ArrayElement(Array("hello", "world"))
//  println(ae.width)
//  val e : Element = new ArrayElement(Array("hello"))

//  val e1 : Element = new ArrayElement(Array("hello", "world"))
//  val ae : ArrayElement = new LineElement("hello")
//  val e2 : Element = ae
//  val e3 : Element = new UniformElement('x',2 ,3)
//
//  e1.contents.foreach(println)
//  ae.contents.foreach(println)
//  e2.contents.foreach(println)
//  e3.contents.foreach(println)

  def invokeDemo (e : Element) {
    e.demo()
  }

//  invokeDemo(new ArrayElement)
//  invokeDemo(new LineElement)
//  invokeDemo(new UniformElement)


  import chap10.Element._

  println(elem(Array("hello")) above elem(Array("world!")))

  println(elem(Array("one", "two")) beside elem(Array("one")))

}
