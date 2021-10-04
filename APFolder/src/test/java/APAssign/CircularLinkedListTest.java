package APAssign;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CircularLinkedListTest {

	CircularLinkedList container=new CircularLinkedList();//Creating linkedlist object
	@Test
	public void testpushFront() {
		container.pushFront(99);//Adding 99 in front of linkedlist
		container.pushFront(39);//Adding 39 in front of linkedlist
		container.pushFront(29);//Adding 29 in front of linkedlist
		container.pushFront(59);//Adding 59 in front of linkedlist
		container.pushFront(89);//Adding 89 in front of linkedlist
		
		CircularLinkedList.Node temp=container.head;//Getting head of linked list
		//Checking first 2 values
		assertEquals(89,temp.key);
		assertEquals(59,temp.next.key);
		//Pointing at last node
		while(temp.next!=container.head)
			temp=temp.next;
		assertEquals(99,temp.key);//last node
		Assert.assertEquals(89,temp.next.key);// It wouldn't be Null pointer
		
	}
	@Test
	public void testpushBack() {
		container.pushBack(9);//Adding 99 in front of linkedlist
		CircularLinkedList.Node temp=container.head;//Getting head of linked list
		//Pointing at last node
		while(temp.next!=container.head)
			temp=temp.next;
		assertEquals(9,temp.key);//last node data will be 89
		
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
		
		CircularLinkedList.Node temp=container.head;//Getting head of linked list
		assertEquals(59,temp.key);//59 at top
		while(temp.next!=container.head)
			temp=temp.next;
		assertEquals(59,temp.next.key);//59 at top
		
	}

}
