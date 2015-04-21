var assertionsEnabbled = true
def myAssert(predicate : () => Boolean) = if (assertionsEnabbled && !predicate()) throw new AssertionError
myAssert(() => 5 > 3)

def byNameAssert(predicate : => Boolean) = if (assertionsEnabbled && !predicate) throw new AssertionError
byNameAssert(5 > 3)

def boolAssert(predicate : Boolean) = if (assertionsEnabbled && !predicate) throw new AssertionError
boolAssert(5 > 3)


assertionsEnabbled = false
byNameAssert(100 / 0 == 0) // 부수효과가 생기지 않음 (assertionsEnabbled 플래그 값부터 확인하고 표현식을 계산하므로)
boolAssert(100 / 0 == 0) //표현식을 먼저 계산 하므로