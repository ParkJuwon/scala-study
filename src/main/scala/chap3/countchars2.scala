package chap3

/**
 * 어떤 파일의 모든 줄의 문자 개수를 줄을 잘 맞춰 출력
 * Created by Real on 2015-01-11.
 */
import scala.io.Source

object countchars2 extends App {
  if(args.length > 0) {
    def widthOfLength(s : String) = s.length.toString.length
    val lines = Source.fromFile(args(0)).getLines().toList
    val longesLine = lines.reduceLeft(
      (a, b) => if (a.length > b.length) a else b
    )
    val maxWidth = widthOfLength(longesLine)

    for(line <- lines) {
      val numSpace = maxWidth - widthOfLength(line)
      val padding = " " * numSpace
      println(padding + line.length + " | " + line)
    }
  }
  else
    Console.err.println("Please enter filename")

}
