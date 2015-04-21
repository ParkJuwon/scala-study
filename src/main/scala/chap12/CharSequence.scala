package chap12

/**
 * Created by john.p on 15. 2. 27..
 */
trait CharSequence {
  def charAt(index : Int) : Char
  def length : Int
  def subSequence(start : Int, end : Int) : CharSequence
  def toString() : String
}
