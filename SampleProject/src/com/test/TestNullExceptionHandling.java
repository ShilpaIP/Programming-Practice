package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.NullExceptionHandling;

public class TestNullExceptionHandling {
	
	@Test(expectedExceptions = NullPointerException.class)
	public void testException1(){
		
		NullExceptionHandling eh = null;
		Assert.assertNull(eh.getexceptNameLength());
	}
	
	@Test(expectedExceptions = NullPointerException.class)
	public void testException2(){
		
		NullExceptionHandling eh = NullExceptionHandling.create();
		Assert.assertNull(eh.getexceptNameLength());
	}

}
