package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.CheckPallindrome;

public class TestCheckPallindrome {
	
	@Test
	public void positivePallinWordTest(){
		
		Assert.assertTrue(CheckPallindrome.isPallindrome("Bob"));
	}
	
	@Test
	public void negativePallinWordTest(){
		
		Assert.assertFalse(CheckPallindrome.isPallindrome("henry"));
	}
	
	@Test
	public void positivePallinSentenceTest(){
		
		Assert.assertTrue(CheckPallindrome.isPallindrome("Step on no pets"));
	}
	
	@Test
	public void negativePallinSentenceTest(){
		
		Assert.assertFalse(CheckPallindrome.isPallindrome("Live for today"));
	}
	
	@Test
	public void testBlank(){
		
		Assert.assertTrue(CheckPallindrome.isPallindrome(" "));
	}
	
	@Test
	public void testEmpty(){
		
		Assert.assertTrue(CheckPallindrome.isPallindrome(""));
	}
	
	@Test
	public void testNull(){
		
		try{
			CheckPallindrome.isPallindrome(null);
			Assert.fail();
		}
		catch (NullPointerException e){
			Assert.assertTrue(true);
		}
	}
	


}
