package com.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.SwapNumbers;

public class TestSwapNumbers {
	
	@Test
	public void positiveRandomNumberSwap(){
		String expected = "successful";
		String actual = SwapNumbers.swapWithVariable(14, 75);
		String actual1 = SwapNumbers.swapWithoutVariable(14, 75);
		Assert.assertTrue(actual.equals(actual1), expected);
	}
	
	@Test
	public void positiveMaxIntegerSwap(){
		String expected = "successful";
		String actual = SwapNumbers.swapWithVariable(Integer.MAX_VALUE, Integer.MIN_VALUE);
		String actual1 = SwapNumbers.swapWithoutVariable(Integer.MAX_VALUE, Integer.MIN_VALUE);
		Assert.assertTrue(actual.equals(actual1), expected);			
	}
	
	@Test
	public void positiveMinIntegerSwap(){
		String expected = "successful";
		String actual = SwapNumbers.swapWithVariable(Integer.MIN_VALUE, Integer.MIN_VALUE);
		String actual1 = SwapNumbers.swapWithoutVariable(Integer.MIN_VALUE, Integer.MIN_VALUE);
		Assert.assertTrue(actual.equals(actual1), expected);			
	}
	
	@Test
	public void sameNumberSwap(){
		String expected = "same number swapping";
		String actual = SwapNumbers.swapWithVariable(5,5);
		String actual1 = SwapNumbers.swapWithoutVariable(5,5);
		Assert.assertTrue(actual.equals(actual1), expected);			
	}

	
	@Test
	public void negativeNumberSwap(){
		String expected = "successful";
		String actual = SwapNumbers.swapWithVariable(-3, -6 );
		String actual1 = SwapNumbers.swapWithoutVariable(-3, -6 );
		Assert.assertTrue(actual.equals(actual1), expected);			
	}

}
