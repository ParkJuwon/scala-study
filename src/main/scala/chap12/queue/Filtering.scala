package chap12.queue

/**
 * Created by john.p on 15. 3. 5..
 */
trait Filtering extends IntQueue{
	abstract override def put(x : Int) {
		if(x >= 0) super.put(x)
	}
}
