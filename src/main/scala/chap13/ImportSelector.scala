package chap13

/**
 * Created by Real on 2015-03-29.
 */
class ImportSelector

// 스칼라 임포트는 맴버를 감추거나 이름을 바꿀 수 있다. 중괄호로 둘러싼 임포트 셀렉터(import selector)를 사용하면 된다
// 이 임포트는 Fruit 객체에 있는 Apple과 Orange만 불러온다
//import bobsdelights.Fruit.{Apple, Orange}

// 이 임포트는 Fruit 객체 내부에 있는 두 맴버 Apple와 Orange를 불러온다
// 그러나 Apple 객체는 Mcintosh로 이름을 바꾼다
//import bobsdelights.Fruit.{Apple => Mcintosh, Orange}

// 여기서는 Fruit 객체의 모든 맴버를 불러오나 Apple 객체는 Mcintosh로 이름을 바꾼다
//import bobsdelights.Fruit.{Apple => Mcintosh, _}

// 여기서는 Fruit에서 Pear를 제외한 모든 맴버를 불러온다
// '<어떤 이름> => _' 절은 불러올 이름 중에서 <어떤 이름> 만 제외하는 효과가 있다
// 왜냐하면 어떤 것의 이름을 _ 로 바꾸면 어떤 면에서 그 이름을 숨긴다는 뜻
// 이런 기능은 모호함을 피하고 싶을 때 유용
//import bobsdelights.Fruit.{Pear => _, _}

