val words = List("the", "quick", "brown", "fox")

// fold 연산
def sum(xs : List[Int]) : Int = (0 /: xs) (_ + _)
def product(xs : List[Int]) : Int = ( 1 /: xs) (_ * _)

("" /: words) (_ + " " + _)
(words.head /: words.tail) (_ + " " + _)

def flattenLeft[T](xss : List[List[T]]) = (List[T]() /: xss) (_ ::: _)
def flattenRight[T](xss : List[List[T]]) = (xss :\ List[T]()) (_ ::: _)

/**
  * 폴드를 사용해 리스트 뒤집기
  * def reverseLeft[T] (xs : List[T]) = (startvalue /: xs) (operation)
  */
def reverseLeft[T](xs : List[T]) =
	(List[T]() /: xs) ((ys, y) => y :: ys)
reverseLeft(words)
