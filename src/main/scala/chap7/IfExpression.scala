package chap7

/**
 * IF 표현식
 * Created by Real on 2015-02-01.
 */
object IfExpression extends App {

    val filename = if(!args.isEmpty) args(0) else "default.txt"
    println( if (!args.isEmpty ) args(0) else "default.txt")
}
