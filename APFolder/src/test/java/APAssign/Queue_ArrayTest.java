package APAssign;

import static org.junit.Assert.*;

import org.junit.Test;

public class Queue_ArrayTest {

	@Test
	public void testenqueue_dequeue() {
		Queue_Array queue = new Queue_Array(3);//Making Queue object
		//Adding 4 values in queue using enqueue function
			queue.enqueue(69);
			queue.enqueue(96);
			queue.enqueue(79);
			//Dequeue all enqueued numbers from queue to check whether they
			//were inserted successfully or not
			assertEquals(69,queue.dequeue());//first number in queue is 69
			assertEquals(96,queue.dequeue());//now first number in queue is 96
			assertEquals(79,queue.dequeue());//now 79
	}

}
