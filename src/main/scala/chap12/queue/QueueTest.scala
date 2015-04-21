package chap12.queue

import chap12.queue.Incrementing

/**
 * Created by john.p on 15. 3. 5..
 */
object QueueTest extends App{
	/*
	val queue = new BasicIntQueue

	queue.put(10)

	queue.put(20)

	println(queue.get())

	println(queue.get())
	*/

	/*
	class MyQueue extends BasicIntQueue with Doubling
	val queue = new MyQueue
	queue.put(10)
	println(queue.get())
	*/

	/*
	val queue = new BasicIntQueue with Doubling
	queue.put(10)
	println(queue.get())
	*/

	/*
	val queue = (new BasicIntQueue with Incrementing with Filtering)
	queue.put(-1); queue.put(0); queue.put(1)
	println(queue.get())
	println(queue.get())
	*/

	/*
	val queue = (new BasicIntQueue with  Filtering with Incrementing)
	queue.put(-1); queue.put(0); queue.put(1)
	println(queue.get())
	println(queue.get())
	*/

	// 다중 상속에 대한 사고 실험
	val q = new BasicIntQueue with Incrementing with Doubling
	q.put(42) // 어떤 put을 호출할까?
	println(q.get())


}
