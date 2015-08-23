package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.ReverseString;

public class TestReverseString {
	
	@Test
	public void positiveTest(){
		
		Assert.assertEquals(ReverseString.reverse("hello"), "olleh");
	}
	
	@Test
	public void multipleWordStringTest(){
		
		Assert.assertEquals(ReverseString.reverse("practicing unit testing"), "gnitset tinu gnicitcarp");
	}
	
	@Test
	public void emptyStringTest(){
		
		Assert.assertNotNull(ReverseString.reverse(" "));
	}
	
	@Test
	public void nullStringTest(){
		
		try{
			ReverseString.reverse(null);
			Assert.fail();
		}
		catch(NullPointerException e){
			Assert.assertTrue(true);
		}
	}

}
