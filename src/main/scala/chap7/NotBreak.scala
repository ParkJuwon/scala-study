package chap7

import java.io.{InputStreamReader, BufferedReader}

import scala.annotation.tailrec
import scala.util.control.Breaks._
/**
 * break와 continue문 없이 살기
 * Created by Real on 2015-02-02.
 */
object NotBreak extends App {

  override val args: Array[String] = Array("1", "2", "3", "ok.scala")

  def notBreakFunc() = {
    var i = 0
    var foundIt = false

    while (i < args.length && !foundIt) {
      if (!args(i).startsWith("-")) {
        if (args(i).endsWith(".scala"))
          foundIt = true
      }

      i = i + 1
    }
  }

  // 꼬리 재귀
  @tailrec
  def searchFrom(i: Int): Int =
    if (i >= args.length) -1
    else if (args(i).startsWith("-")) searchFrom(i + 1)
    else if (args(i).endsWith(".scala")) i
    else searchFrom(i + 1)
  val i = searchFrom(0)

  val in = new BufferedReader(new InputStreamReader(System.in))

  breakable {
      while(true) {
        println(" ? ")
        if(in.readLine() == "" ) break
      }
  }


}
