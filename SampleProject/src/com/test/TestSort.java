package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.Sort;

public class TestSort {
	
	@Test
	public void positiveNumberSort(){
		
		int[] expected = {1,2,5,8,9};
		int[] actual = Sort.doSort(new int[]{9,1,5,8,2});
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void negativeNumberSort(){
		
		int[] expected = {-9,-8,-5,-2,-1};
		int[] actual = Sort.doSort(new int[]{-9,-1,-5,-8,-2});
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void sameNumberSort(){
		
		int[] expected = {1,1,1,1};
		int[] actual = Sort.doSort(new int[]{1,1,1,1});
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void zeroNumberSort(){
		
		int[] expected = {0};
		int[] actual = Sort.doSort(new int[]{0});
		Assert.assertEquals(actual, expected);
	}
	

	@Test
	public void nullSort(){
		
		int[] expected = {};
		int[] actual = Sort.doSort(new int[]{});
		Assert.assertEquals(actual, expected);
	}

}
