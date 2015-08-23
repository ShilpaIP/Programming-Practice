package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.LinearSearch;

public class TestLinearSearch {
	
	@Test
	public void positiveSearch(){
		
		Assert.assertTrue(LinearSearch.search(new int[]{7,5,2,9,15}, 5));
	}
	
	@Test
	public void negativeSearch(){
		
		Assert.assertFalse(LinearSearch.search(new int[]{7,5,2,9,15}, 35));
	}
	
	@Test
	public void nullSearch(){
		
		Assert.assertFalse(LinearSearch.search(new int[]{}, 8));
	}

}
