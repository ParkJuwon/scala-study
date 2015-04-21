package chap8

import scala.io.Source

/**
 * 1. 메소드
 * 2. 지역 함수
 *
 * Created by john.p on 15. 2. 5..
 */
object LongLines {
  /*
  private def processLine(filename: String, width: Int, line: String): Unit = {
    if (line.length > width) {
      println(filename + " : " + line.trim)
    }
  }

  def processFile(filename : String, width : Int) {
    val source = Source.fromFile(filename)
    for(line <- source.getLines())
      processLine(filename, width, line)
  }
  */

  //fix
  def processFile(filename: String, width: Int) {
    //    def processLine(filename : String, width : Int, line : String) {

    // 지역 함수
    def processLine(line: String) {
      if (line.length > width)
        println(filename + " : " + line)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines()) {
//      processLine(filename, width, line)
      processLine(line)
    }
  }

}
