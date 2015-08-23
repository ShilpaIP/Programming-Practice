package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.MissingNumber;

public class TestMissingNumber {
	
	@Test
	public void testPositiveNumbers(){
		
		Assert.assertEquals(MissingNumber.findMissingNumber(new int[]{1,2,4,5}), 3);
	}
	
	@Test
	public void testNegativeNumbers(){
		
		Assert.assertEquals(MissingNumber.findMissingNumber(new int[]{-4,-5,-6,-7,}), -1);
	}
	
	@Test
	public void testZeroNumbers(){
		
		Assert.assertEquals(MissingNumber.findMissingNumber(new int[]{0}), -1);
	}
	
	@Test
	public void testEmptyArray(){
		
		Assert.assertEquals(MissingNumber.findMissingNumber(new int[]{}), -1);
	}
	
	@Test
	public void testNull(){
		
		try{
			int missingNum = MissingNumber.findMissingNumber(null);
			Assert.fail();
		}
		catch (NullPointerException e){
			Assert.assertTrue(true);
		}
	}
	
	

}
