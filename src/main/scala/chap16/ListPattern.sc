val fruit = "apple" :: ("Orange" :: ("pears" :: Nil))

val List(a, b, c) = fruit

val x :: y :: rest = fruit


// 패턴 매치를 사용한 insertion sort

def isort(xs: List[Int]): List[Int] = xs match {
	case List() => List()
	case x :: xsl => insert(x, isort(xsl))
}

def insert(x: Int, xs: List[Int]): List[Int] = xs match {
	case List() => List(x)
	case y :: ys => if (x <= y) x :: xs
	else y :: insert(x, ys)
}


