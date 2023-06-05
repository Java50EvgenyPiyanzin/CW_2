package telran.arrays;

import java.util.Arrays;

public class ArraysInt {
	public static int [] addNumber(int [] array, int number)
	{
		int[] res = Arrays.copyOf(array, array.length+1);
		res [array.length] = number; 
		
		return res;
	}
	
	public static int[] insertNumber(int[] array,int index,int number)
	{
		int [] res = new int[array.length+1];
		System.arraycopy(array, 0, res, 0, index);
		res[index] = number;
		System.arraycopy(array, index, res, index+1, array.length-index);
		return res;
	}
	public static int searthNumber(int[] array, int number)
	{
		int index = 0;
		while(index<array.length && array[index] != number)
		{
			index++;
		}
		return index < array.length ? index : -1;
	}
	public static int binarySearchNumber(int[] array, int number)
	{
		int left = 0;
		int right = array.length -1;
		int middle = right /2;
		
		while (left <= right && array[middle] != number)
		{
			if(number < array[middle])
			{
				right = middle -1;
			}
			else {
				left = middle +1;
			}
			middle = (left + right) /2;
		}
		
		return left <= right ? middle : -1;
	}

}


















