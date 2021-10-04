package APAssign;

import static org.junit.Assert.*;

import org.junit.Test;

public class Stack_ArrayTest {

	@Test
	public void testpush() {
		Stack_Array stack = new Stack_Array(); //create stack of size = 5
			stack.push(107); //push num=107
			stack.push(126); //push num=126
			stack.push(145); //push num=145
			stack.push(164); //push num=164
			stack.push(183); //push num=183
			
			assertEquals(183,stack.pop());//remove topmost element
			assertEquals(164,stack.pop());//remove topmost element
		
	}
	@Test
	public void testpop() {
		Stack_Array stack = new Stack_Array(); //create stack of size = 5
			stack.push(107); //push num=107
			stack.push(126); //push num=126
			stack.push(183); //push num=183
			
			assertEquals(183,stack.pop());//remove topmost element
			assertEquals(126,stack.pop());//remove topmost element
			assertEquals(107,stack.pop());//remove topmost element
			//now stack is empty
			assertEquals(-1,stack.pop());
		
	}

}
