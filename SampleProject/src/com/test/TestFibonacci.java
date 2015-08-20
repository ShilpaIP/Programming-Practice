package com.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.Fibonacci;;

public class TestFibonacci {
	
	@Test
	public void testPositiveFibonacci(){
		String expected = "passed";
		String actual = Fibonacci.printFibonacci(9);
		Assert.assertTrue(actual.contains(expected));
		
	}
	
	@Test
	public void testNegavtiveFibonacci(){
		String expected = "Error";
		String actual = Fibonacci.printFibonacci(-23);
		Assert.assertTrue(actual.contains(expected));
	}
	
	@Test
	public void testZeroFibonacci(){
		String expected = "passed";
		String actual = Fibonacci.printFibonacci(0);
		Assert.assertTrue(actual.contains(expected));
	}
	
	@Test
	public void testOneFibonacci(){
		String expected = "passed";
		String actual = Fibonacci.printFibonacci(1);
		Assert.assertTrue(actual.contains(expected));
	}
}
