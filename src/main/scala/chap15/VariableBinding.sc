abstract class Expr
case class Var(name : String) extends  Expr
case class Number(num : Double) extends Expr
case class UnOp(operator : String , arg : Expr) extends Expr
case class BinOp(operator : String , left : Expr, right : Expr) extends Expr

// 변수 바인딩
// 변수 이름 다음에 @ 기호를 넣고 패턴을 쓰면된다.
def variableBing(expr : Any) = expr match {
	case UnOp("abs", e @ UnOp("abs", _)) => e
	case _ =>
}

// 패턴 가드
def simplifyAdd(e : Expr) = e match {

	// 스칼라가 패턴을 선형 패턴으로 제한하기 때문에
	// 변수는 패턴 안에 한번만 나와야 함
	//case BinOp("+", x, x) => BinOp("*", x, Number(2))
	case BinOp("+", x, y) if x == y => BinOp("*", x, Number(2)) // 패턴 가드 사용
	case _ => e
}

// 패턴 겹침
def simplifyAll(expr : Expr) : Expr = expr match {
	case UnOp("-", UnOp("-", e)) =>
		simplifyAll(e) // - 를 두번 적용하는 경우
	case BinOp("+", e, Number(0)) =>
		simplifyAll(e) // 0은 + 연산의 항등원
	case BinOp("*", e, Number(1)) =>
		simplifyAll(e) // 1은 * 연산의 항등원
	case UnOp(op ,e) =>
		UnOp(op, simplifyAll(e))
	case BinOp(op, l, r) =>
		BinOp(op, simplifyAll(l), simplifyAll(r))
	case _ => expr
}
