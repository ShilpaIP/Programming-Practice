package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.EqualsHashCodeEx;

public class TestEqualsHashCodeEx {
	
	@Test
	public void positiveTest(){
		
		EqualsHashCodeEx eh = new EqualsHashCodeEx(786);
		EqualsHashCodeEx eh1 = new EqualsHashCodeEx(786);
		Assert.assertTrue(eh.equals(eh1));
		
		Assert.assertEquals(eh.hashCode(), eh1.hashCode());
	}
	
	@Test
	public void negativeTest(){
		
		EqualsHashCodeEx eh = new EqualsHashCodeEx(786);
		EqualsHashCodeEx eh1 = new EqualsHashCodeEx(456);
		Assert.assertFalse(eh.equals(eh1));
		
		Assert.assertNotEquals(eh.hashCode(), eh1.hashCode());
	}

}
