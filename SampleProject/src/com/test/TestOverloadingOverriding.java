package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.OverloadingEx;
import com.main.OverridingEx;

public class TestOverloadingOverriding {
	
	OverloadingEx oload = new OverloadingEx();
	OverloadingEx oride = new OverridingEx();
	
	OverloadingEx test = null;
	
	
	@Test
	public void testOverload(){
		
		Assert.assertEquals(oload.poly(4, 5, 6), 15);
		
	}
	
	@Test
	public void testOverride(){
		
		Assert.assertEquals(oride.poly(4, 5, 6), 25);
		
	}
	
	@Test
	public void testOverloadWithZero(){
		
		Assert.assertEquals(oload.poly(0, 0, 0), 0);
		
	}
	
	@Test
	public void testOverrideWithZero(){
		
		Assert.assertEquals(oride.poly(0, 0, 0), 10);
		
	}
	
	@Test(expectedExceptions = NullPointerException.class)
	public void negativeTest(){
		
		Assert.assertNull(test.poly(0, 0, 0));
		
	}
	

}
