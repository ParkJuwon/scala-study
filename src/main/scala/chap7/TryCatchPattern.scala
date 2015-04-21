package chap7

import java.io.{IOException, FileNotFoundException, FileReader}
import java.net.{MalformedURLException, URL}

/**
 * try 표현식으로 예외 다루기
 * Created by Real on 2015-02-02.
 */
object TryCatchPattern extends App {
  def fileTest {
    try {
      val f = new FileReader("input.txt")
      // 파일을 사용하고 닫는다
    } catch {
      case ex: FileNotFoundException => // 파일을 못 찾는 경우 처리
      case ex: IOException => // 그 밖에 IO 오류 처리
    }
  }

  def urlFor(path : String) =
  try {
    new URL(path)
  } catch {
    case e : MalformedURLException =>
      new URL("http://www.scala-lang.org")
  }


  def f() : Int = try { return 1} finally { return 2}
  def g() : Int = try { 1 } finally {2}

  println(f)
  println(g)
}
