def containsNeg1(nums : List[Int]) : Boolean = {
  var exists = false
  for ( num <- nums )
    if( num < 0 )
      exists = true
  exists
}

containsNeg1(List(1, 2, 3, 4))
containsNeg1(List(1, 2, -3, 4))

def containsNeg2(nums : List[Int]) = nums.exists(_ < 0)

containsNeg2(Nil)
containsNeg2(List(0, -1, -2))

def containsOdd1(nums : List[Int]) : Boolean = {
  var exists = false
  for( num <- nums )
    if(num % 2 == 1)
      exists = true
  exists
}

def containsOdd2(nums : List[Int]) = nums.exists(_ % 2 == 1)
