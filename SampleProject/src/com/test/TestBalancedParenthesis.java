package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.BalancedParenthesis;

public class TestBalancedParenthesis {
	
	@Test
	public void positiveTest(){
		
		Assert.assertTrue(BalancedParenthesis.isBalanced("((()))"));
	}
	
	@Test
	public void negativeTest(){
		
		Assert.assertFalse(BalancedParenthesis.isBalanced(")("));
	}
	
	@Test
	public void singleTest(){
		
		Assert.assertFalse(BalancedParenthesis.isBalanced("("));
	}
	
	
	@Test
	public void emptyTest(){
		
		Assert.assertFalse(BalancedParenthesis.isBalanced(""));
	}
	
	@Test
	public void blankTest(){
		
		Assert.assertFalse(BalancedParenthesis.isBalanced(" "));
	}
	

	@Test
	public void nullTest(){
		
		try{
			BalancedParenthesis.isBalanced(null);
			Assert.fail();
		}
		catch (NullPointerException e){
			Assert.assertTrue(true);
		}
	}
	

}
