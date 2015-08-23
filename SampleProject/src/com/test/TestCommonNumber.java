package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.CommonNumber;

public class TestCommonNumber {
	
	@Test
	public void testPositiveNumber(){
		
		Assert.assertEquals(CommonNumber.findCommonNumber(new int[] {1,2,3,4}, new int[] {7,6,5,4}), 4);
	}
	
	@Test
	public void testNegativeNumber(){
		
		Assert.assertEquals(CommonNumber.findCommonNumber(new int[] {-1,-2,-3,-4}, new int[] {-12,-9,-6,-3}), -3);
	}
	
	@Test
	public void testSameNumber(){
		
		Assert.assertEquals(CommonNumber.findCommonNumber(new int[] {5,5,5,5}, new int[] {5,5,5,5,5}), 5);
	}
	
	@Test
	public void testZeroNumber(){
		
		Assert.assertEquals(CommonNumber.findCommonNumber(new int[] {0}, new int[] {0}), 0);
	}
	
	@Test
	public void testEmptyArray(){
		
		try{
			int actual = CommonNumber.findCommonNumber(new int[] {}, new int[] {});
			Assert.fail();
		}
		catch (ArrayIndexOutOfBoundsException e){
			Assert.assertTrue(true);
		}
		
	}
	
	@Test
	public void testNull(){
		
		try{
			int actual = CommonNumber.findCommonNumber(null, null);
			Assert.fail();
		}
		catch (NullPointerException e){
			Assert.assertTrue(true);
		}
		
	}
	

}
