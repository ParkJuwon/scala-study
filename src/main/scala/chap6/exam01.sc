import chap6.Rational

new Rational(1, 2)
val x = new Rational(1, 3)
val y = new Rational(5, 7)

//new Rational(5, 0)
val oneHalf = new Rational(1, 2)
val twoThirds = new Rational(2, 3)

oneHalf add twoThirds

val z = new Rational(3)

new Rational(66, 42)

x + y

x * y

x * 2

/**
 * 암시적 타입 변환
 * @param x
 * @return
 */
implicit def intToRational(x : Int) = new Rational(x)