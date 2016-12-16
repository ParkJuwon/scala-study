List(1,2,3).length

val abcde = List('a', 'b', 'c', 'd', 'e')
abcde.head // 첫번째 원소만
abcde.last // 마지막 원소만
abcde.init // 마지막 원소를 제외한 나머지
abcde.tail // 첫번째 원소를 제외한 나머지

abcde.reverse

def rev[T] (xs : List[T]) : List[T] = xs match {
	case List() => xs
	case x :: xsl => rev(xsl) ::: List(x)
}

abcde take 2

abcde drop 2

abcde splitAt 2

abcde.indices
