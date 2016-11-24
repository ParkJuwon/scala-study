abstract class Expr
case class Var(name : String) extends  Expr
case class Number(num : Double) extends Expr
case class UnOp(operator : String , arg : Expr) extends Expr
case class BinOp(operator : String , left : Expr, right : Expr) extends Expr



def simplifyTop(expr : Expr) : Expr = expr match {
	case UnOp("-", UnOp("-", e)) => e      // 부호를 두 번 반전
	case BinOp("+", e, Number(0)) => e      // 0을 더함
	case BinOp("*", e, Number(1)) => e      // 1을 곱함
	case _ => expr
}

// 와이드카드 패턴
def wildcardPattern(expr : Expr) = expr match {
	case BinOp(_, _, _) => println(expr + " is a binary operation")
	case _ => println("It's something else")
}

// 상수 패턴
def constantPattern(x : Any) = x match {
	case 5 => "five"
	case true => "truth"
	case "hello" => "hi"
	case Nil => "the empty list"
	case _ => "something else"
}

constantPattern(5)
constantPattern(true)
constantPattern("hello")
constantPattern(Nil)
constantPattern(List(1,2,3))

// 변수 패턴 나머지 모든 값을 처리 (와일드카드를 사용하지 않음, 객체를 바인딩)
def variablePattern(expr : Any) = expr match {
	case 0 => "zero"
	case somethingElse => "not zero" + somethingElse
}

// 변수 또는 상수?
import math.{E, Pi}
E match {
	case Pi => "strange math? Pi = " + Pi
	case _ => "OK"
}

// 소문자로 시작하는 간단한 이름은 패턴 변수로 취급, 다른 모든 참조는 상수로 간주
val pi = math.Pi
E match {
	case pi => "strange math? Pi = " +pi
}

// pi 가 변수 패턴이라서 모든 입력과 매치 할수 있기 때문에 와이드카드 케이스에 도달 할 수 없다
E match {
	case pi => "strange math? Pi = " +pi
//	case _ => "OK"
}

// 굳이 소문자 이름을 상수 패턴으로 사용하고 싶으면 두가지 방법이 있다
// 1. 상수 이름을 긴 이름을 사용 => pi 는 변수 패턴이지만 this.pi, obj.pi 는 소문자로 시작한다 하여도 상수
// 2. 역 따옴표를 사용하여 변수 이름을 감싼다 (`pi`는 변수 패턴이 아닌 상수패턴)
E match {
	case `pi` => "strange math? Pi = " +pi
	case _ => "OK"
}

// 생성자 패턴 constructor pattern
/*
깊은 매치를 지원 (어떤 패턴이 제공받은 최상위 객체만을 매치시킬 뿐 아니라,
내포 패턴과 객체의 내용에 대해서도 매치로 지원하는 깊이까지 객체 내부를 검사
 */

def constructorPattern(expr : Expr) : Expr = expr match {
	case BinOp("+", e, Number(0)) => e      // 0을 더함
	case BinOp("*", e, Number(1)) => e      // 1을 곱함
	case _ => expr
}

// 시퀸스 패턴
// 0 으로 시작하는 세 원소를 가진 리스트 검사
def sequencePattern(expr : Any) = expr match {
	case List(0, _, _) => println("found it")
	case List(0, _*) => println("found it") // 길이를 한정하지 않고 시퀸스 매치
	case _ =>
}

// 튜플 패턴
def tuplePattern(expr : Any) = expr match {
	case (a, b, c) => println("matched " + a + b + c)
	case _ =>
}
tuplePattern(("a ", 3, "-tuple"))


// 타입 지정 패턴
def generalSize(x: Any) = x match {
	case s : String => s.length
	case m : Map[_, _] => m.size
	case _ => -1
}
generalSize("abc")
generalSize(Map(1 -> 'a', 2 -> 'b'))
generalSize(math.Pi)
