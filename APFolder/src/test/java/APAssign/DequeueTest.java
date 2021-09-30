package APAssign;

import static org.junit.Assert.*;

import org.junit.Test;

public class DequeueTest {

	@Test
	public void testaddLeft() {
		Dequeue queue=new Dequeue(10);
		//Adding values in Queue using addLeft function
		for(int i=0; i<10; i++)
			queue.addLeft(i*2);//Storing 1st 10 even numbers in Ascending order 0 to 18
		int [] Exp_array= {0,2,4,6,8,10,12,14,16,18};
		assertArrayEquals(Exp_array,queue.array);
	}
	@Test
	public void testaddRight() {
		Dequeue queue=new Dequeue(10);
		//Adding values in Queue using addRight function
		for(int i=0; i<10; i++)
			queue.addRight(i*2);//Storing 1st 10 even numbers in Descending order 0 to 18
		int [] Exp_array= {18,16,14,12,10,8,6,4,2,0};
		assertArrayEquals(Exp_array,queue.array);
	}
	@Test
	public void testaddRight_addLeft() {
		Dequeue queue=new Dequeue(5);
		//Adding values in Queue using addLeft and right functions
		queue.addRight(5);//Adding 5 at End
		queue.addLeft(23);
		queue.addRight(55);
		int [] Exp_array= {23,0,0,55,5};
		assertArrayEquals(Exp_array,queue.array);
	}
}
