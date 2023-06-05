package telran.arrays.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import telran.arrays.ArraysInt;

public class ArraysTest {
	/*
@Test
void initialTest() {
	
	int [] ar1 = {1,2,3};
	int [] ar2 = {1,2,3};
	int [] ar2_3 = ar2;
//tTrue(ar1 == ar2);
	//assertArrayEquals(ar1, ar2);
	ar2_3[0] = 10;
	
	
}*/
@Test

void copyOfIntTest()
{
	int [] ar1 = {10,5,15};
	int[] expected1 = {10,5,15};
	int[] expected2 = {10,5};
	int[] expected3 = {10,5,15,0,0};
	
	assertArrayEquals(expected1	,Arrays.copyOf(ar1,3));
	assertArrayEquals(expected2,Arrays.copyOf(ar1,2));
	assertArrayEquals(expected3,Arrays.copyOf(ar1,5));
	
	
}
@Test
void addNumberTest()
{
	int [] ar1 = {10,5,15};
	int number = 20;
	int[] expected = {10,5,15,number};
	assertArrayEquals(expected	,	ArraysInt.addNumber(ar1, number));
}
@Test
void arrayCopyTest ()
{
	int[] src = {1,2,5,3,7,8,9};
	int[] dest = {10,20,30,40,50,60,70};
	int [] expected = {10,20,30,40,1,2,3};
	System.arraycopy(src, 0, dest,4, 3);
}
@Test
void insertNumberTest()
{
	int[] src = {1,2,5,3,7,8,9};
	int number = 20;
	int index = 3;
	int [] expected1= {1,2,5,20,3,7,8,9};
	//assertArrayEquals(expected1, Arra
}
@Test 
@Timeout(3)
void maxLongTest()
{
	assertEquals(Long.MAX_VALUE, getLongMax());
}
private Long getLongMax() {
	long res =1;
	while(res > 0)
	{
		res++;
	}
	
	return res -1;
}
@Test 
void maxIntTest()
{
	assertEquals(Integer.MAX_VALUE, getIntMax());
}
private Long getIntMax() {
	long res =1;
	while(res > 0)
	{
		res++;
	}
	
	return res -1;
}
}






































