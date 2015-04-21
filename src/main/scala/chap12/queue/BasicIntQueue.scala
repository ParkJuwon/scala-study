package chap12.queue

import scala.collection.mutable.ArrayBuffer

/**
 * Created by john.p on 15. 3. 5..
 */
class BasicIntQueue extends IntQueue{

	private val buf = new ArrayBuffer[Int]

	override def get() = buf.remove(0)

	override def put(x: Int) { buf += x }
}
