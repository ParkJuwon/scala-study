package chap3

import scala.io.Source

/**
 * 파일의 내용을 줄 단위로 읽는 방법
 */
object countchars1 extends App {
  if(args.length > 0) {
    for (line <- Source.fromFile(args(0)).getLines())
      println(line.length() + " " + line)

  } else
    Console.err.println("Please enter filename")

}
