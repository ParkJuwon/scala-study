sealed abstract class Expr

case class Var(name: String) extends Expr

case class Number(num: Double) extends Expr

case class UnOp(operator: String, arg: Expr) extends Expr

case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

def describe(e: Expr): String = e match {
	case Number(_) => "a number"
	case Var(_) => "a variable"
	// 봉인 클래스에서 가능한 패턴을 제외 하고 사용 시
	// warning 이 보기 싫을때
	case _ => throw new RuntimeException // 일어나서는 안 될 일이다.
}


// 단지 컴파일러를 조용하게 하기 위해 실행되지 않는 코드를 추가하는 건 그다지 좋은일이 아니다
def describe2(e: Expr): String = (e : @unchecked) match {
	case Number(_) => "a number"
	case Var(_) => "a variable"
}
// @unchecked 애노테이션은 패턴 매치 시 특별한 의미를 가진다
// 어떤 match 문의 셀렉터에 이 애노테이션이 붙으면,
// 해당 match 문의 case 문이 모든 패턴을 다 다루는지 검사하는 것을 생략한다
