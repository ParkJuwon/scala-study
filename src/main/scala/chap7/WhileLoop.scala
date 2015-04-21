package chap7

import scala.io.StdIn

/**
 * While 루프
 * Created by Real on 2015-02-01.
 */
object WhileLoop extends App{
  def gcdLoop(x : Long, y : Long) : Long = {
    var a = x
    var b = y

    while ( a != 0 ) {
      val temp = a
      a = b % a
      b = temp
    }

    b
  }

  def doWhileExam () = {
    var line = ""
    do {
      line = scala.io.StdIn.readLine()
      println("Read : " + line)
    } while (line != "")
  }

  def whileReadLineExam() = {
    var line = ""
    while ((line = StdIn.readLine()) != "") println("Read : " + line)
  }

  def gcd( x : Long, y : Long) : Long = if (y == 0) x else gcd(y, x % y)

  println(gcdLoop(100, 25))

  println(gcd(100, 25))
}
