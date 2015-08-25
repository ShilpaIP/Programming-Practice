package com.test;

import java.util.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.CopyArrayList;

public class TestCopyArrayList {
	
	
	@Test
	public void positiveTest(){
		
		List<String> arrList = new ArrayList<String>();
		arrList.add("Working");
		arrList.add("hard");
		arrList.add("will");
		arrList.add("give");
		arrList.add("success");
		
		Assert.assertEquals(CopyArrayList.copy(arrList), new String[]{"Working", "hard", "will", "give", "success"});
	}
	
	@Test
	public void emptyListTest(){
		
		List<String> arrList = new ArrayList<String>();	
		Assert.assertEquals(CopyArrayList.copy(arrList), new String[]{});
	}
	
	@Test
	public void numberListTest(){
		
		List<String> arrList = new ArrayList<String>();
		arrList.add("123");
		arrList.add("456");
		arrList.add("789");
		
		
		Assert.assertEquals(CopyArrayList.copy(arrList), new String[]{"123", "456", "789"});
	}
	
	@Test(expectedExceptions = NullPointerException.class)
	public void nullListTest(){
		
		List<String> arrList = null;	
		Assert.assertNull(CopyArrayList.copy(arrList));
	}
	
	

}
