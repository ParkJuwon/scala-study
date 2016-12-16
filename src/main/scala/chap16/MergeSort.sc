// 리스트 병합 정렬 함수
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

msort((x: Int, y: Int) => x < y) (List(5, 7, 1, 3))

// 커링사용
val intSort = msort((x : Int, y : Int) => x < y) _
val reverseIntSort = msort((x : Int, y : Int) => x > y) _

val mixedInts = List(4, 1, 9, 0, 5, 8 ,3 ,6, 2, 7)
intSort(mixedInts)
reverseIntSort(mixedInts)
