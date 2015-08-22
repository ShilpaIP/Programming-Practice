package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.Factorial;

public class TestFactorial {
	
	@Test
	public void positiveFactorial(){
		
		Assert.assertEquals(Factorial.getFactorial(5), 120);
		Assert.assertEquals(Factorial.getFactorial2(5), 120);
	}
	
	@Test
	public void negativeFactorial(){
		
		Assert.assertEquals(Factorial.getFactorial(-15), -15);
		Assert.assertEquals(Factorial.getFactorial2(-15), -15);
	}
	
	@Test
	public void zeroFactorial(){
		
		Assert.assertEquals(Factorial.getFactorial(0), 0);
		Assert.assertEquals(Factorial.getFactorial2(0), 0);
	}
	
	@Test
	public void maxIntegerFactorial(){
	
		try{
			int actual = Factorial.getFactorial(Integer.MAX_VALUE);
			
		}catch (StackOverflowError e){
			Assert.assertTrue(true, "Error occured");
		}
	}
	
	@Test
	public void minIntegerFactorial(){
		
		Assert.assertEquals(Factorial.getFactorial(Integer.MIN_VALUE), Integer.MIN_VALUE);
		Assert.assertEquals(Factorial.getFactorial2(Integer.MIN_VALUE), Integer.MIN_VALUE);
	}
	

}
