/**
 * Created by Real on 2015-01-11.
 */
package chap4

/**
 * 스칼라 애플리케이션 생성 방법 (main을 통하여)
 */

import ChecksumAccumulator.calculate
object Summer {
  def main(args : Array[String]): Unit = {
    for (arg <- args)
      println(arg + " : " + calculate(arg))
  }
}

