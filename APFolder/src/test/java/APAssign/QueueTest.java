package APAssign;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void testenqueue() {
		Queue queue=new Queue(8);//Making Queue object
		//Using try and catch because enqueue function may throw exception
		try{
			//Adding 4 values in queue
			queue.enqueue(69);
			queue.enqueue(96);
			queue.enqueue(79);
			queue.enqueue(97);
			int expected_num=69;
			//Dequeue from queue to get first number and match with expected_num
			assertEquals(expected_num,queue.dequeue());
			expected_num=79;
			queue.dequeue();//Eliminating 96
			assertEquals(expected_num,queue.dequeue());//79 == 79
		}
		catch(Exception Excep){
			System.out.println(Excep);
		}
	}
	@Test
	public void testdequeue() {
		Queue queue=new Queue(8);//Making Queue object
		//Using try and catch because enqueue function may throw exception
		try{
			//Adding 4 values in queue
			queue.enqueue(69);
			queue.enqueue(79);
			int expected_num=69;
			//Dequeue from queue to get first number and match with expected_num
			assertEquals(expected_num,queue.dequeue());
			expected_num=79;
			assertEquals(expected_num,queue.dequeue());//79 == 79
			queue.dequeue();//As Queue is already empty and it throw exception
		}
		catch(Exception Excep){
			System.out.println(Excep);
		}
	}
	@Test
	public void testempty(){
		Queue queue=new Queue(3);//Making Queue object
		assertTrue(queue.empty());//Queue is Empty
		try{
			//Adding value in queue
			queue.enqueue(69);
		}
		catch(Exception Excep){
			System.out.println(Excep);
		}
		//After enqueue value, queue shouldn't be empty
		assertFalse(queue.empty());
	}
	@Test
	public void testsize(){
		Queue queue=new Queue(3);//Making Queue object
		assertEquals(0,queue.size());//Queue is Empty size=0
		try{
			//Adding value in queue
			queue.enqueue(20);
			queue.enqueue(30);
		}
		catch(Exception Excep){
			System.out.println(Excep);
		}
		//After enqueue value, queue shouldn't be empty
		assertEquals(2,queue.size());
	}

}
