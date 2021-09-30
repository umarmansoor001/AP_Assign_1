package APAssign;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayTest {
	
	Array array=new Array();//making a Array_class object array
	@Before
	public void ArrayCreation(){
		//Setting values in Array using insert function
		//array={1,5,7,20,32,19};
		array.insert(1, 0);
		array.insert(5, 1);
		array.insert(7, 2);
		array.insert(20, 3);
		array.insert(32, 4);
		array.insert(19, 5);
	}
	
	@Test
	public void testLinearSearch(){
		//Testing
		Assert.assertTrue(array.linearSearch(32));//index->4
		Assert.assertTrue(array.linearSearch(1));//index->0
		Assert.assertFalse(array.linearSearch(0));//index->none
	}
	@Test
	public void testbinarySearch(){
		array.bubbleSort();
		//Testing
		Assert.assertTrue(array.binarySearch(32,0,6));
		Assert.assertTrue(array.binarySearch(1,0,6));
		assertFalse(array.binarySearch(0,0,6));//index->none	
	
	}
	@Test
	public void testdelete(){
		//Testing
		array.bubbleSort();//sorting array first
		//array={1,5,7,19,20,32}
		array.delete(2);//index->2 value 7 will be removed
		Assert.assertFalse(array.linearSearch(7));
		array.insert(7, 2);
		assertTrue(array.linearSearch(7));//check is 7 successfully inserted or not
		array.delete(4);//index->4 value 32 will be removed
		Assert.assertFalse(array.linearSearch(20));
	}
	@Test
	public void testBubleSort(){
		array.bubbleSort();//Sorting first
		Array expected_array=new Array();
		expected_array.insert(1, 0);
		expected_array.insert(5, 1);
		expected_array.insert(7, 2);
		expected_array.insert(19, 3);
		expected_array.insert(20, 4);
		expected_array.insert(32, 5);
		// expected_array contains{1,5,7,19,20,32}
		// array contains{1,5,7,19,20,32}
		assertArrayEquals(expected_array.array, array.array); 
	}
	@Test(expected = IndexOutOfBoundsException.class)
	public void testInsert(){
		for(int i=0; i<=100;i++)
		{
			array.insert(i, i);//this throws exception at 100 index
			//there is no proper index validation checks in function(insert()) in Array.java file
		}
	}
}
