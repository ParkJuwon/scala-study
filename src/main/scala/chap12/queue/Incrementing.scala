package chap12.queue

/**
 * Created by john.p on 15. 3. 5..
 */
trait Incrementing extends IntQueue{
	abstract override def put(x : Int) { super.put(x + 1) }
}

