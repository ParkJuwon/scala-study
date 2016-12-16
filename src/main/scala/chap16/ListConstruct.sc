
// 모든 리스트는 두가지 건축 블록 Nil과 ::(콘즈 Cons라고 부름)를 가지고 만들 수 있다.
val fruit = "apple" :: ("Orange" :: ("pears" :: Nil))
val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
val diag3 = (1 :: (0 :: ( 0:: Nil))) ::
		(0 :: (1 :: (0 :: Nil))) ::
		(0:: (0 :: (1 :: Nil))) :: Nil

// Insertion sort
def isort(xs : List[Int]) : List[Int] =
	if(xs.isEmpty) Nil
	else insert(xs.head, isort(xs.tail))
def insert(x : Int, xs : List[Int]) : List[Int] =
	if(xs.isEmpty || x <= xs.head) x :: xs
	else xs.head :: insert(x, xs.tail)