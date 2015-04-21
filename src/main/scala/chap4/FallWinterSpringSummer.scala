package chap4

import ChecksumAccumulator.calculate


/**
 * App 트레이트를 통한 어플리케이션 생성
 * Created by Real on 2015-01-11.
 */
object FallWinterSpringSummer extends App{
  for(season <- List("fall", "Winter", "spring"))
    println(season + " : " + calculate(season))
}
