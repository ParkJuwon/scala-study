package chap12.ractangle

/**
 * Created by Real on 2015-01-19.
 */
class Rational(n : Int, d : Int) extends Ordered[Rational]{ // 컴파일할 수 없다
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer : Int = n /g
  val denom : Int = d /g

  def this(n : Int) = this(n, 1) // 보조 생성자

  override def toString = numer + "/" + denom

  def + (that : Rational) : Rational = {
    new Rational(numer * that.denom + that.numer * denom,
      denom * that.denom)
  }
  def + (i : Int) :Rational = new Rational(numer + i * denom, denom)

  def - (that : Rational) : Rational = new Rational(numer * that.denom - that.numer * denom, denom * that.denom)
  def - (i : Int) : Rational = new Rational(numer - i * denom, denom)

  def * (that : Rational) : Rational = {
    new Rational(numer * that.numer, denom * that.denom)
  }
  def * (i : Int) : Rational = new Rational(numer * i , denom)

  def / (that : Rational) : Rational = new Rational(numer * that.denom, denom * that.numer)
  def / (i : Int) : Rational = new Rational(numer, denom * i)

  def add(that : Rational) : Rational = {
    new Rational(numer * that.denom + that.numer * denom,
      denom * that.denom)
  }

  def lessThan(that : Rational) = this.numer * that.denom < that.numer * this.denom

  def max(that : Rational) = if (this.lessThan(that)) that else this

  private def gcd(a : Int, b : Int) : Int = if(b == 0) a else gcd(b, a % b)

/*
  def < (that : Rational) = this.numer * that.denom > that.numer * this.denom
  def > (that : Rational) = that < this
  def <= (that : Rational) = (this < that) || (this == that)
  def >= (that : Rational) = (this > that) || (this == that)
*/
  override def compare(that: Rational): Int = (this.numer * that.denom) - (that.numer * this.denom)
}

