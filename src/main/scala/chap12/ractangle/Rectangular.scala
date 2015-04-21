package chap12.ractangle

import chap12.Point

/**
 * Created by john.p on 15. 2. 27..
 */
trait Rectangular {

  def topLeft : Point
  def bottomRight : Point

  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
}
