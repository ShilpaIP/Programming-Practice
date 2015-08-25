package com.test;

import java.util.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.MyMap;

public class TestMyMap {
	
	@Test
	public void positiveCreateTest(){
		
		Map<Integer, String> map = MyMap.createMap();
		Assert.assertTrue(map.size() == 5);		
	}
	
	@Test
	public void positiveSearchTest(){
		
		Map<Integer, String> map = MyMap.createMap();
		Assert.assertEquals(MyMap.searchMap(map, 913), "Rita Gaur");
	}
	
	@Test
	public void negativeSearchTest(){
		
		Map<Integer, String> map = MyMap.createMap();
		Assert.assertEquals(MyMap.searchMap(map, 111), "");
	}
	
	@Test(expectedExceptions = NullPointerException.class)
	public void nullTest(){
		
		Map<Integer, String> map = MyMap.createMap();
		Assert.assertNull(MyMap.searchMap(null, 0));
	}

}
