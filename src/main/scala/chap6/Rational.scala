package chap6

/**
 * Created by Real on 2015-01-19.
 */

/**
 * 함수형 객체
 * 분스 클래스 명세
 * @param n
 * @param d
 */

class Rational(n : Int, d : Int) { // 컴파일할 수 없다
  // 전제 조건 확인
  require(d != 0)

  // 비공개 필드와 메소드
  private val g = gcd(n.abs, d.abs)

  // 필드 추가
  val numer : Int = n /g
  val denom : Int = d /g

  def this(n : Int) = this(n, 1) // 보조 생성자

  // toString 메소드 다시 구현하기
  override def toString = numer + "/" + denom

  // 연산자 정의
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

  // 보조 생성자
  def add(that : Rational) : Rational = {
    new Rational(numer * that.denom + that.numer * denom,
      denom * that.denom)
  }

  // 자기 참조
  def lessThan(that : Rational) = this.numer * that.denom < that.numer * this.denom

  def max(that : Rational) = if (this.lessThan(that)) that else this

  private def gcd(a : Int, b : Int) : Int = if(b == 0) a else gcd(b, a % b)

}

