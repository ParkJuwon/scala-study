def msort[T](less: (T, T) => Boolean)
            (xs: List[T]): List[T] = {
	def merge(xs: List[T], ys: List[T]): List[T] =
		(xs, ys) match {
			case (Nil, _) => ys
			case (_, Nil) => xs
			case (x :: xsl, y :: ysl) =>
				if (less(x, y)) x :: merge(xsl, ys)
				else y :: merge(xs, ysl)
		}

	val n = xs.length / 2
	if( n == 0 ) xs
	else {
		val (ys, zs) = xs splitAt n
		merge(msort(less)(ys), msort(less)(zs))
	}
}

msort((x : Char, y : Char) => x > y) ("abcde".toList)
"abcde".toList sortWith(_ > _)

// 알지 못하는 T 타입에 대해 (T, T) => Boolean 타입의 인자를 받아서 List[T]에서 List[T]로 가는 함수를 반환 하는 커링한 다형성 메소드
// 타입 인자를 초기화 할 필요가 있다. 왜나하면 첫 번째 적용 부분에서 정확한 인스턴스 타입을 알수 없기 떄문이다.
//msort(_ > _)("abcde".toList)

// 타입 인자 전달
msort[Char](_ > _)("abcde".toList)

// 인자를 알수 있게 메소드 변경
def msortSwapped[T](xs: List[T]) (less: (T, T) => Boolean) : List[T] = {
	def merge(xs: List[T], ys: List[T]): List[T] =
		(xs, ys) match {
			case (Nil, _) => ys
			case (_, Nil) => xs
			case (x :: xsl, y :: ysl) =>
				if (less(x, y)) x :: merge(xsl, ys)
				else y :: merge(xs, ysl)
		}

	val n = xs.length / 2
	if( n == 0 ) xs
	else {
		val (ys, zs) = xs splitAt n
		merge(msort(less)(ys), msort(less)(zs))
	}
}
// 타입 추론 로직이 msortSwapped의 타입 파라미터를 결정하기 위해 이미 알려진 "abcde".toList 인자의 타입을 사용
msortSwapped("abcde".toList)(_ > _)


