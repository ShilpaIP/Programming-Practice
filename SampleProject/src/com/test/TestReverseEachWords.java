package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.ReverseEachWords;

public class TestReverseEachWords {
	
	@Test
	public void positiveTest(){
		
		Assert.assertEquals(ReverseEachWords.doReverse("how are you"), "woh era uoy");
	}

	@Test
	public void testSentenceWithNumbers(){
		
		Assert.assertEquals(ReverseEachWords.doReverse("number is 123 456 789"), "rebmun si 321 654 987");
	}
	
	@Test
	public void testSentenceWithSpecialCharacters(){
		
		Assert.assertEquals(ReverseEachWords.doReverse("hello, world! how many $ you got?"), ",olleh !dlrow woh ynam $ uoy ?tog");
	}
	
	@Test
	public void testSentenceWithDoubleSpace(){
		
		Assert.assertEquals(ReverseEachWords.doReverse("hello  world  today"), "olleh  dlrow  yadot");
	}
	
	@Test
	public void testNullSentence(){
		
		try{
			ReverseEachWords.doReverse(null);
			Assert.fail();
		}
		catch(NullPointerException e){
			Assert.assertTrue(true);
		}
		
	}



}
