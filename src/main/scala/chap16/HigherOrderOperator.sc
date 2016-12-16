List(1,2,3) map (_ + 1)

val words = List("the", "quick", "brown", "fox")
words map (_.length)
words map (_.toList.reverse.mkString)

words map (_.toList)
// flatMap은 리스트의 원소에 함수 f를 적용해서 나온 모든 리스트를 연결한 단일 리스트를 반환한다.
// faltMap은 결과 리스트를 서로 연결한 하나의 리스트를 반
words flatMap (_.toList)

List.range(1, 5) flatMap (
		i => List.range(1, i) map (j => (i, j))
)
for (i <- List.range(1, 5); j <- List.range(1, i)) yield (i, j)

var sum = 0
List(1, 2, 3, 4, 5) foreach (sum += _)
sum



