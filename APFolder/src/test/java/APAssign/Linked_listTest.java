package APAssign;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Linked_listTest {

	Linked_list container=new Linked_list();//Creating linkedlist object
	@Test
	public void testpushFront() {
		container.pushFront(99);//Adding 99 in front of linkedlist
		container.pushFront(39);//Adding 39 in front of linkedlist
		container.pushFront(29);//Adding 29 in front of linkedlist
		container.pushFront(59);//Adding 59 in front of linkedlist
		container.pushFront(89);//Adding 89 in front of linkedlist
		
		Linked_list temp=container.headPointer;//Getting head of linked list
		assertEquals(89,temp.data);//89 at top

	}

	@Test
	public void testpushBack_topBack() {
		container.pushBack(9);//Adding 9 in back of linkedlist
		try {
		assertEquals(9,container.topBack());//9 at end 

		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

	@Test
	public void testadd() {
		container.add(1);//Adding 99 in front of linkedlist
		container.add(3);//Adding 39 in front of linkedlist
		container.add(2);//Adding 29 in front of linkedlist
		container.add(5);//Adding 59 in front of linkedlist
		container.add(8);//Adding 89 in front of linkedlist
		
		Linked_list temp=container.headPointer;//Getting head of linked list
		
		assertEquals(89,temp.data);//89 at top
		try {
		assertEquals(8,container.topBack());//
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@Test
	public void testtopFront() {
		try {
		container.pushFront(99);//Adding 99 in front of linkedlist
		container.pushFront(39);//Adding 39 in front of linkedlist
		container.pushFront(29);//Adding 29 in front of linkedlist
		container.pushFront(59);//Adding 59 in front of linkedlist
		container.pushFront(89);//Adding 89 in front of linkedlist
		
		assertEquals(89,container.topFront());//89 at top
		}
		catch(Exception e){
			System.out.println(e);
		}
			
	}
	
	@Test
	public void testpopFront() {
		try {
		container.popFront();
		assertEquals(59,container.topFront());//59 at top
		}
		catch(Exception e){
			System.out.println(e);
		}
			
	}

}
