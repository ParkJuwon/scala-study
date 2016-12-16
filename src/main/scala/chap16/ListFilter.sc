val words = List("the", "quick", "brown", "fox")

List(1, 2, 3, 4 ,5) filter (_ % 2 == 0)
words filter(_.length == 3)

// partition은 술어가 true인 리스트와 false인 리스트를 반환
List(1, 2, 3, 4, 5) partition (_ % 2 == 0)

// find는 술어를 만족하는 첫번째 원소만 반환
// true가 존재하면 Some(x) 를 반환, false이면 None을 반환
List(1, 2, 3, 4, 5) find (_ % 2 == 0)
List(1, 2, 3, 4 ,5) find (_ <= 0)


// takeWhile, dropWhile
// xs takeWhile p 연산은 xs 리스트에서 술어 p를 만족하는 가장 긴 접두사를 반환
// xs dropWhile p 연산은 xs 리스트에서 술어 p를 만족하는 가장 긴 접두사를 제거
List(1, 2, 3, -4, 5) takeWhile (_ > 0)
List(1, 2, 3, -4, 5) dropWhile (_ > 0)
words takeWhile (_ startsWith "t")
words dropWhile (_ startsWith "t")

// span 메소드는 takeWhile 과 dropWhile 을 하나로 묶은 것
List(1, 2, 3, -4 , 5) span (_ > 0)


// forall , exists
// xs forall p 연산은 리스트 xs와 술어 함수 p를 받는다 모든 원소가 p를 만족할 때 결과가 true
// xs exists p 연산은 리스트 xs 안에 술어 함수 p 원소가 하나라도 존재하면 true
def hasZeroRow(m : List[List[Int]]) = m exists (row => row forall (_ == 0))
// hasZeroRow(diag3)


