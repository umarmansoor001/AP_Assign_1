package APAssign;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayTest {
	
	Array array1=new Array();//making a array1_class object array1
	@Before
	public void array1Creation(){
		//Setting values in array1 using insert function
		//array1={1,5,7,20,32,19};
		array1.insert(1, 0);
		array1.insert(5, 1);
		array1.insert(7, 2);
		array1.insert(20, 3);
		array1.insert(32, 4);
		array1.insert(19, 5);
	}
	
	@Test
	public void testLinearSearch(){
		//Testing
		Assert.assertTrue(array1.linearSearch(32));//index->4
		Assert.assertTrue(array1.linearSearch(1));//index->0
		Assert.assertFalse(array1.linearSearch(0));//index->none
	}
	@Test
	public void testbinarySearch(){
		array1.bubbleSort();
		//Testing
		Assert.assertTrue(array1.binarySearch(32,0,6));
		Assert.assertTrue(array1.binarySearch(1,0,6));
		assertFalse(array1.binarySearch(0,0,6));//index->none	
	
	}
	@Test
	public void testdelete(){
		//Testing
		array1.bubbleSort();//sorting array1 first
		//array1={1,5,7,19,20,32}
		array1.delete(2);//index->2 value 7 will be removed
		Assert.assertFalse(array1.linearSearch(7));
		array1.insert(7, 2);
		assertTrue(array1.linearSearch(7));//check is 7 successfully inserted or not
		array1.delete(4);//index->4 value 32 will be removed
		Assert.assertFalse(array1.linearSearch(20));
	}
	@Test
	public void testBubleSort(){
		array1.bubbleSort();//Sorting first
		Array expected_array=new Array();
		expected_array.insert(1, 0);
		expected_array.insert(5, 1);
		expected_array.insert(7, 2);
		expected_array.insert(19, 3);
		expected_array.insert(20, 4);
		expected_array.insert(32, 5);
		// expected_array contains{1,5,7,19,20,32}
		// array1 contains{1,5,7,19,20,32}
		assertArrayEquals(expected_array.array, array1.array); 
	}
	@Test(expected = IndexOutOfBoundsException.class)
	public void testInsert(){
		for(int i=0; i<=100;i++)
		{
			array1.insert(i, i);//this throws exception at 100 index
			//there is no proper index validation checks in function(insert()) in array1.java file
		}
	}
}
