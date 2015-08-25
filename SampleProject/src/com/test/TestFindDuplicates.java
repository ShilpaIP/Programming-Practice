package com.test;
import java.io.*;

import org.testng.Assert;
import org.testng.annotations.*;

import com.main.FindDuplicates;

public class TestFindDuplicates {
	
	private static OutputStream os = null;
	private static PrintStream ps = null;
	
	@BeforeMethod
	public void setUpOutputCapture(){
		
		os = new ByteArrayOutputStream();
		ps = new PrintStream(os);
		System.setOut(ps);
		
	}
	
	@Test
	public void positiveTest(){
			
		FindDuplicates.findUsingSet(new int[]{1,2,3,4,4,5,6});
		Assert.assertTrue(os.toString().contains("4"));
			
	}
	
	@Test
	public void negativeTest(){
			
		FindDuplicates.findUsingSet(new int[]{1,2,3,4,5});
		Assert.assertTrue(os.toString().contains(""));
			
	}
	
	@Test
	public void singleTest(){
			
		FindDuplicates.findUsingSet(new int[]{1,1,1,1,1});
		Assert.assertTrue(os.toString().contains("1"));
			
	}
	
	@Test
	public void emptyTest(){
			
		FindDuplicates.findUsingSet(new int[]{});
		Assert.assertTrue(os.toString().contains(""));
			
	}
	
	@Test(expectedExceptions = NullPointerException.class)
	public void nullTest(){
		
		int[] arr = null;
		FindDuplicates.findUsingSet(arr);
		Assert.assertTrue(true);
			
	}
	
	@AfterMethod(alwaysRun = true)
	public void shutDownStreams() throws IOException{
		if(os != null)
			os.close();
		if(ps != null)
			ps.close();
	}

}
