package APAssign;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class ArrayInsertionTest {

	@Test(expected = IndexOutOfBoundsException.class)
	public void inserttest() {
		//This function shows exception when i tried to insert values in array at all valid indexes
		//Test
		System.out.println("Insertion test");
		//Making an array
		int [] arr=new int[4];//will store data in it
		int [] expected_arr= {32,23,89,57};
		// setting values in array
		ArrayInsertion array=new ArrayInsertion();
		array.insert(arr,32,0);
		array.insert(arr,23,1);
		array.insert(arr,89,2);
		//When i will insert value at last index which is 3 and array_size=4 but it gives exception
		//Array Out of Bound exception appears but in-fact i am inserting value within array size
		array.insert(arr, 56, 3);
	}
}