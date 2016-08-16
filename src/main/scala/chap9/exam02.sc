/**
 * 커링
 */
def plainOldSum(x : Int, y : Int) = x + y
plainOldSum(1, 2)

def curriedSum(x : Int)(y : Int)= x + y
curriedSum(1)(2)

def first(x : Int) = (y : Int) => x + y
val second = first(2)
second(3)

val onePlus = curriedSum(1)_
onePlus(2)

val twoPlus = curriedSum(2)_
twoPlus(2)

def curriedMinus(x : Int)(y : Int)(z : Int)= y - x
val oneM = curriedMinus(1)_
oneM(2)

val twoM = curriedMinus(2)_
twoM(2)
