package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.ExceptionCase;

public class TestExceptionCase {
	
	@Test
	public void positiveTest(){
		
		Assert.assertEquals(ExceptionCase.tryConvertingString("123"), 123);
	}
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void negativeTest(){
		
		Assert.assertEquals(ExceptionCase.tryConvertingString("hello"), "String not convertable");
	}
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void nullTest(){
		
		Assert.assertEquals(ExceptionCase.tryConvertingString(null), "String not convertable");
	}
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void blankStringTest(){
		
		Assert.assertEquals(ExceptionCase.tryConvertingString(" "), "String not convertable");
	}
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void emptyStringTest(){
		
		Assert.assertEquals(ExceptionCase.tryConvertingString(""), "String not convertable");
	}


}
