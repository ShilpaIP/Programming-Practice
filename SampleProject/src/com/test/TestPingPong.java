package com.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.PingPong;

public class TestPingPong {
	
	@Test
	public void positive3DivisionTest(){
		
		Assert.assertEquals(PingPong.print(9), "ping");
		
	}
	
	@Test
	public void positive5DivisionTest(){
		
		Assert.assertEquals(PingPong.print(25), "pong");
		
	}
	
	@Test
	public void positiveDualDivisionTest(){
		
		Assert.assertEquals(PingPong.print(15), "ping pong");
		
	}
	
	@Test
	public void positive0DivisionTest(){
		
		Assert.assertTrue(PingPong.print(0).contains("not allowed"));
		
	}
	
	@Test
	public void positiveNoDivisionTest(){
		
		Assert.assertTrue(PingPong.print(14).contains("not divisable"));
		
	}
	
	@Test
	public void negativeDivisionTest(){
		
		Assert.assertTrue(PingPong.print(-64).contains("Error"));
		
	}

}
