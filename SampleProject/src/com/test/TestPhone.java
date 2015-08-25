package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.Phone;

public class TestPhone {
	
	@Test
	public void testImmutablePhoneModel(){
		
		Phone ph = Phone.createPhone("iOS", "vzr567", "verizon");
		ph.createPhone("Motorola", "vzr567", "verizon");
		
		Assert.assertEquals(ph.getModel(), "iOS");
	}
	
	@Test
	public void testImmutablePhoneSerial(){
		
		Phone ph = Phone.createPhone("iOS", "vzr567", "verizon");	
		ph.createPhone("iOS", "att890", "verizon");
		Assert.assertEquals(ph.getSerialNo(), "vzr567");
	}
	
	@Test
	public void testImmutablePhoneCarrier(){
		
		Phone ph = Phone.createPhone("iOS", "vzr567", "verizon");	
		ph.createPhone("iOS", "vzr567", "att");
		Assert.assertEquals(ph.getNetworkCarrier(), "verizon");
	}
	
	@Test()
	public void testNullPhone(){
		
		Phone ph = Phone.createPhone(null, null, null);	
		Assert.assertNull(ph.getModel());
		Assert.assertNull(ph.getSerialNo());
		Assert.assertNull(ph.getNetworkCarrier());
	}

}
