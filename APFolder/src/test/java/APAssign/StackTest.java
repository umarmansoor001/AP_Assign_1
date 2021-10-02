package APAssign;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void testpush() {
		Stack stack = new Stack();//making Stack object namely stack
		stack.push(999);//use push member function to insert value in stack
		//check that value was inserted successfully or not using top function
		assertEquals(999,stack.top());//value at top is 999
		stack.push(434);
		stack.push(553);
		stack.push(122);//now this value is at top of stack
		assertEquals(122,stack.top());
	}

	@Test
	public void testpop() {
		Stack stack = new Stack();//making Stack object namely stack
		assertEquals(-1,stack.pop());//at first stack is empty
		stack.push(99);//use push member function to insert value in stack
		//check that value was inserted successfully or not using pop function
		assertEquals(99,stack.pop());//value at top is 999
		stack.push(84);
		stack.push(23);
		stack.push(12);//now this value is at top of stack and will be pop out
		assertEquals(12,stack.pop());
	}
	
	@Test
	public void testtop() {
		Stack stack = new Stack();//making Stack object namely stack
		assertEquals(-1,stack.pop());//at first stack is empty and function returns -1
		stack.push(999);//use push member function to insert value in stack
		//check that value was inserted successfully or not using top function
		assertEquals(999,stack.top());//value at top is 999
		stack.push(434);
		stack.push(553);
		stack.push(122);//now this value is at top of stack
		assertEquals(122,stack.top());
	}
	
	@Test
	public void testgetSize() {
		Stack stack = new Stack();//making Stack object namely stack
		assertEquals(0,stack.getSize());//at first stack is empty and size = 0
		stack.push(9);//use push member function to insert value in stack
		stack.push(434);
		stack.push(553);
		stack.push(122);//now this value is at top of stack
		assertEquals(4,stack.getSize());
	}
}
