package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.FindAndReplaceSubstring;

public class TestFindAndReplaceSubString {
	
	@Test
	public void test1WordReplacement(){
		
		Assert.assertEquals(FindAndReplaceSubstring.replaceSubstring("I can do this", "can", "will"), "I will do this");
	}
	
	@Test
	public void testMultipleWordReplacement(){
		
		Assert.assertEquals(FindAndReplaceSubstring.replaceSubstring("I can do this", "can do", "will get"), "I will get this");
	}
	
	@Test
	public void testBlankSubstring(){
		
		Assert.assertEquals(FindAndReplaceSubstring.replaceSubstring("go now", "", "ie"), "iegieoie ienieoiewie");
	}
	
	@Test
	public void testBlankReplacementString(){
		
		Assert.assertEquals(FindAndReplaceSubstring.replaceSubstring("I can do this", "can do", ""), "I  this");
	}
	
	@Test
	public void testBlankOriginalString(){
		
		Assert.assertEquals(FindAndReplaceSubstring.replaceSubstring("", "can do", "will do"), "");
	}
	
	@Test
	public void testSpaceSubstring(){
		
		Assert.assertEquals(FindAndReplaceSubstring.replaceSubstring("go now", " ", "ie"), "goienow");
	}
	
	@Test
	public void testSpaceReplacementString(){
		
		Assert.assertEquals(FindAndReplaceSubstring.replaceSubstring("I can do this", "can do", " "), "I   this");
	}
	
	@Test
	public void testSpaceOriginalString(){
		
		Assert.assertEquals(FindAndReplaceSubstring.replaceSubstring(" ", "can do", "will do"), " ");
	}
	

	@Test
	public void testNullSubstring(){
		
		try{
			FindAndReplaceSubstring.replaceSubstring("go now", null, "ie");
		}
		catch (NullPointerException e){
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void testNullReplacementString(){
		
		try{
			FindAndReplaceSubstring.replaceSubstring("I can go now", "will", null);
		}
		catch (NullPointerException e){
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void testNullOriginalString(){
		
		try{
			FindAndReplaceSubstring.replaceSubstring(null, "hello all", "hi world");
		}
		catch (NullPointerException e){
			Assert.assertTrue(true);
		}
	}

}
