package APAssign;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {

	@Test
	public void testpush() {
		MyStack stack = new MyStack(10); //create stack of size = 5
		try{
			stack.pop();//Exception comes
			stack.push(107); //push num=107
			stack.push(126); //push num=126
			stack.push(145); //push num=145
			stack.push(164); //push num=164
			stack.push(183); //push num=183
			
			assertEquals(183,stack.pop());//remove topmost element
			assertEquals(164,stack.pop());//remove topmost element
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	@Test
	public void testpop() {
		MyStack stack = new MyStack(3); //create stack of size = 5
		try{
			stack.pop();//Exception comes
			stack.push(107); //push num=10
			assertEquals(107,stack.pop());//Only num in stack is 107		
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	@Test
	public void testtop() {
		MyStack stack = new MyStack(3); //create stack of size = 5
		try{
			stack.push(107); //push num=10
			assertEquals(107,stack.top());//Only num in stack is 107		
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	@Test
	public void testsize() {
		MyStack stack = new MyStack(15); //create stack of size = 5
		try{
			stack.push(107); //push num=10
			assertEquals(1,stack.size());//Size is 1	
			stack.push(109); //push num=10
			stack.push(126); //push num=12
			stack.push(145); //push num=14
			stack.push(164); //push num=16
			assertEquals(5,stack.size());//Size is 1	
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
