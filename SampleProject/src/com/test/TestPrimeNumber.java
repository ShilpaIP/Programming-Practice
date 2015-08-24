package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.PrimeNumber;

public class TestPrimeNumber {
	
	@Test
	public void positiveTest(){
		
		Assert.assertTrue(PrimeNumber.isPrime(7));
	}
	
	@Test
	public void negativeTest(){
		
		Assert.assertFalse(PrimeNumber.isPrime(14));
	}
	
	@Test
	public void zeroTest(){
		
		Assert.assertFalse(PrimeNumber.isPrime(0));
	}
	
	@Test
	public void oneTest(){
		
		Assert.assertFalse(PrimeNumber.isPrime(1));
	}

}
