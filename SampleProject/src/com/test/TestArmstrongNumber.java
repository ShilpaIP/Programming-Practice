package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.ArmstrongNumber;

public class TestArmstrongNumber {
	
	@Test
	public void singleDigitTest(){
		
		Assert.assertEquals(ArmstrongNumber.getArmStrongNumber(7), true);
	}
	
	@Test
	public void doubleDigitTest(){
		
		Assert.assertEquals(ArmstrongNumber.getArmStrongNumber(49), false);
	}
	
	@Test
	public void zeroDigitTest(){
		
		Assert.assertEquals(ArmstrongNumber.getArmStrongNumber(0), false);
	}
	
	@Test
	public void positive3DigitTest(){
		
		Assert.assertEquals(ArmstrongNumber.getArmStrongNumber(153), true);
	}
	
	@Test
	public void negative3DigitTest(){
		
		Assert.assertEquals(ArmstrongNumber.getArmStrongNumber(654), false);
	}

}
