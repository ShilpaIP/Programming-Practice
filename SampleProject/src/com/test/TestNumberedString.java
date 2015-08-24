package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.NumberedString;

public class TestNumberedString {
	
	@Test
	public void testRealString(){
		
		Assert.assertEquals(NumberedString.giveNumbers("This is nice"), "This1 is2 nice3");
	}
	
	@Test
	public void testStringWithSpecialCharacter(){
		
		Assert.assertEquals(NumberedString.giveNumbers("Hot & Happening"), "Hot1 &2 Happening3");
	}
	
	@Test
	public void testBlankString(){
		
		Assert.assertNull(NumberedString.giveNumbers(" "));
	}
	
	@Test
	public void testEmptyString(){
		
		Assert.assertNull(NumberedString.giveNumbers(""));
	}
	
	@Test
	public void testNullString(){
		
		try{
			NumberedString.giveNumbers(null);
			Assert.fail();
		}
		catch (NullPointerException e){
			Assert.assertTrue(true);
		}
	}

}
