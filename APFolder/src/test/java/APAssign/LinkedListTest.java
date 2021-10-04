package APAssign;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class LinkedListTest {

	LinkedList container=new LinkedList();//Creating linkedlist object
	@Test
	public void testpushFront() {
		container.pushFront(99);//Adding 99 in front of linkedlist
		container.pushFront(39);//Adding 39 in front of linkedlist
		container.pushFront(29);//Adding 29 in front of linkedlist
		container.pushFront(59);//Adding 59 in front of linkedlist
		container.pushFront(89);//Adding 89 in front of linkedlist
		
		LinkedList.Node temp=container.head;//Getting head of linked list
		//Checking first 2 values
		assertEquals(89,temp.key);
		assertEquals(59,temp.next.key);
		//Pointing at last node
		while(temp.next!=null)
			temp=temp.next;
		assertEquals(99,temp.key);//last node
		Assert.assertNull(temp.next);//Null pointer
		
	}
	@Test
	public void testpushBack() {
		container.pushBack(99);//Adding 99 in front of linkedlist
		container.pushBack(39);//Adding 39 in front of linkedlist
		container.pushBack(29);//Adding 29 in front of linkedlist
		container.pushBack(59);//Adding 59 in front of linkedlist
		container.pushBack(89);//Adding 89 in front of linkedlist
		
		LinkedList.Node temp=container.head;//Getting head of linked list
		
		assertEquals(99,temp.key);//99 will be at first node
		//Pointing at last node
		while(temp.next!=null)
			temp=temp.next;
		assertEquals(89,temp.key);//last node data will be 89
		Assert.assertNull(temp.next);//Null pointer
		
	}
	
	@Test
	public void testpopFront() {
		container.pushFront(99);//Adding 99 in front of linkedlist
		container.pushFront(39);//Adding 39 in front of linkedlist
		container.pushFront(29);//Adding 29 in front of linkedlist
		container.pushFront(59);//Adding 59 in front of linkedlist
		container.pushFront(89);//Adding 89 in front of linkedlist
		//pop operation
		container.popFront();//89 will be discarded
		LinkedList.Node temp=container.head;//Getting head of linked list
		assertEquals(59,temp.key);//59 at top
		
	}

	@Test
	public void testpopBack() {
		container.pushFront(99);//Adding 99 in front of linkedlist
		container.pushFront(39);//Adding 39 in front of linkedlist
		container.pushFront(29);//Adding 29 in front of linkedlist
		container.pushFront(59);//Adding 59 in front of linkedlist
		container.pushFront(89);//Adding 89 in front of linkedlist
		//pop operation
		container.popBack();//99 will be discarded
		LinkedList.Node temp=container.head;//Getting head of linked list
		while(temp.next!=null)
			temp=temp.next;
		assertEquals(39,temp.key);//39 at back
		
	}
	
	@Test
	public void testpop() {
		container.pushFront(99);//Adding 99 in front of linkedlist
		container.pushBack(39);//Adding 39 in front of linkedlist
		//pop operation
		container.pop(1);//39 will be discarded
		LinkedList.Node temp=container.head;//Getting head of linked list
		assertEquals(99,temp.key);//99 at top
		assertNull(temp.next);//Null because 39 is discarded from linked list
		
	}
	
}
