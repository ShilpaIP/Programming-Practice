package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.Merge;

public class TestMerge {
	
	@Test
	public void testPositiveNumbers(){
		
		Assert.assertEquals(Merge.doMerge(new int[]{1,2,3}, new int[]{4,5,6}), new int[]{1,2,3,4,5,6});
	}
	
	@Test
	public void testNegativeNumbers(){
		
		Assert.assertEquals(Merge.doMerge(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}), new int[]{-1,-2,-3,-4,-5,-6});
	}
	
	@Test
	public void testSameNumber(){
		
		Assert.assertEquals(Merge.doMerge(new int[]{1,1,1}, new int[]{1,1,1}), new int[]{1,1,1,1,1,1});
	}
	
	@Test
	public void testZeroNumbers(){
		
		Assert.assertEquals(Merge.doMerge(new int[]{0,0}, new int[]{0,0,0}), new int[]{0,0,0,0,0});
	}
	
	@Test
	public void testEmptyArray(){
		
		Assert.assertEquals(Merge.doMerge(new int[]{}, new int[]{}), new int[]{});
	}
	

	@Test(expectedExceptions = NullPointerException.class)
	public void testNull(){
		
		Assert.assertNull(Merge.doMerge(null, null));
	}
	
	@Test
	public void testZeroInitializedArray(){
		
		Assert.assertEquals(Merge.doMerge(new int[0], new int[0]), new int[0]);
		
	}
	
	@Test
	public void testPositiveInitializedArray(){
		
		Assert.assertEquals(Merge.doMerge(new int[4], new int[5]), new int[9]);
		
	}

	@Test(expectedExceptions = NegativeArraySizeException.class)
	public void testNegativeInitializedArray(){
		
		Merge.doMerge(new int[-4], new int[-5]);
		Assert.fail();
	}
		
	@Test(expectedExceptions = OutOfMemoryError.class)
	public void testMaxSizedArray(){
		
		Merge.doMerge(new int[Integer.MAX_VALUE], new int[Integer.MAX_VALUE]);
		Assert.fail();
	}
	
	@Test(expectedExceptions = NegativeArraySizeException.class)
	public void testMinSizedArray(){
		
		Merge.doMerge(new int[Integer.MIN_VALUE], new int[Integer.MIN_VALUE]);
		Assert.fail();
	}


}
