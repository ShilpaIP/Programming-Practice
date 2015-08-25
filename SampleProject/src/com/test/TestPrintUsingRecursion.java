package com.test;

import java.io.*;

import org.testng.Assert;
import org.testng.annotations.*;

import com.main.PrintUsingRecursion;

public class TestPrintUsingRecursion {
	
	private static OutputStream os;
	private static PrintStream ps;
	
	@BeforeTest
	public void setUpStreams(){
		
		os = new ByteArrayOutputStream();
		ps = new PrintStream(os);
		System.setOut(ps);
	}
	
	@Test
	public void positiveTest(){
		
		PrintUsingRecursion.doPrint(10);
		Assert.assertTrue(os.toString().contains("1 2 3 4 5 6 7 8 9 10 "));
	}
	
	@Test
	public void negativeTest(){
		
		PrintUsingRecursion.doPrint(-6);
		Assert.assertTrue(os.toString().contains("-6"));
	}
	
	@Test
	public void zeroTest(){
		
		PrintUsingRecursion.doPrint(0);
		Assert.assertTrue(os.toString().contains("0"));
	}
	
	@AfterTest(alwaysRun = true)
	public void shutDownStreams() throws IOException{
		
		if(os != null && ps != null){
			os.close();
			ps.close();
		}
			
	}

}


