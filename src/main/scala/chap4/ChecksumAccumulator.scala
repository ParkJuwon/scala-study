/**
 * Created by Real on 2015-01-11.
 */
package chap4

/**
 * 싱글톤 객체와 companion object(컴패니언 오브젝트 : 동반 객체) 생성 방법
 *
 */

import scala.collection.mutable.Map
class ChecksumAccumulator {
  private var sum = 0
  def add(b : Byte) = sum += b
  def checksum() : Int = ~(sum & 0xFF) + 1
}

object ChecksumAccumulator {
  private val cache = Map[String, Int]()
  def calculate(s: String) : Int =
  if(cache.contains(s))
    cache(s)
  else {
    val acc = new ChecksumAccumulator
    for(c <- s)
      acc.add(c.toByte)
    val cs = acc.checksum()
    cache += (s -> cs)
    cs
  }
}
