package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.LargestNum;

public class TestLargestNum {
	
	@Test
	public void testPositiveNumbers(){
		
		Assert.assertEquals(LargestNum.findLargest(new int[]{1,2,3,4,5}), 5);
	}
	
	@Test
	public void testNegativeNumber(){
		
		Assert.assertEquals(LargestNum.findLargest(new int[]{-1,-2,-3,-4,-5}), -1);
	}
	
	@Test
	public void testSameNumbers(){
		
		Assert.assertEquals(LargestNum.findLargest(new int[]{5,5,5,5,5,5}), 5);
	}
	
	@Test
	public void testZeroNumbers(){
		
		Assert.assertEquals(LargestNum.findLargest(new int[]{0}), 0);
	}
	
	@Test
	public void testEmptyArray(){
		
		try{
			int largest = LargestNum.findLargest(new int[]{});
		} 
		catch (ArrayIndexOutOfBoundsException ex){
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void testNull(){
		
		try{
			int largest = LargestNum.findLargest(null);
		} 
		catch (NullPointerException ex){
			Assert.assertTrue(true);
		}
	}
}
