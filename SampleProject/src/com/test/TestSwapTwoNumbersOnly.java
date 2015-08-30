package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.SwapTwoNumbersOnly;

public class TestSwapTwoNumbersOnly {
	
	@Test
	public void positiveSwapTest(){
		
		Assert.assertEquals(SwapTwoNumbersOnly.sortOnceOnly(new int[]{1,2,4,3,5}), new int[]{1,2,3,4,5});
	}
	
	@Test
	public void negativeSwapTest(){
		
		Assert.assertEquals(SwapTwoNumbersOnly.sortOnceOnly(new int[]{-5,-4,-2,-3,-1}), new int[]{-5,-4,-3,-2,-1});
	}
	
	@Test
	public void zeroSwapTest(){
		
		Assert.assertEquals(SwapTwoNumbersOnly.sortOnceOnly(new int[]{0,0,1,0,0}), new int[]{0,0,0,0,1});
	}
	
	@Test
	public void emptySwapTest(){
		
		Assert.assertEquals(SwapTwoNumbersOnly.sortOnceOnly(new int[]{}), new int[]{});
	}
	
	@Test(expectedExceptions=NullPointerException.class)
	public void nullSwapTest(){
		
		Assert.assertNull(SwapTwoNumbersOnly.sortOnceOnly(null));
		
	}

}
