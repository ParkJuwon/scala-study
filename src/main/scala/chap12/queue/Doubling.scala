package chap12.queue

/**
 * Created by john.p on 15. 3. 5..
 * 쌓을 수 있는 변경을 나타내는 Doubling 트레이트
 */
trait Doubling extends IntQueue{
	abstract override def put(x : Int) { super.put(2 * x) }
}
