package com.test;

import java.util.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.SortMapByValue;

public class TestSortMapByValue {

	
	@Test
	public void psoitiveTestSortMap(){
	
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "jack");
		map.put(2, "andy");
		map.put(3, "rick");
		
		LinkedHashMap<Integer,String>  newMap = SortMapByValue.sortByValue(map);
		
		Assert.assertNotSame(map, newMap);
	}
	
	@Test
	public void negativeTestSortMapWithSameKeys(){
	
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "jack");
		map.put(1, "andy");
		map.put(1, "rick");
		
		LinkedHashMap<Integer,String>  newMap = SortMapByValue.sortByValue(map);
		
		Assert.assertNotEquals(map.size(), newMap.size());
	}
	
	@Test
	public void negativeTestSortMapWithSameValues(){
	
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "jack");
		map.put(2, "jack");
		map.put(3, "jack");
		
		LinkedHashMap<Integer,String>  newMap = SortMapByValue.sortByValue(map);
		
		Assert.assertNotEquals(map.size(), newMap.size());
	}
	
	@Test
	public void negativeTestSortMapWithEmptyValues(){
	
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "");
		map.put(2, "");
		map.put(3, "");
		
		LinkedHashMap<Integer,String>  newMap = SortMapByValue.sortByValue(map);
		
		Assert.assertNotEquals(map, newMap);
	}
	
	@Test(expectedExceptions=NullPointerException.class)
	public void negativeTestSortMapWithNullValues(){
	
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, null);
		map.put(2, null);
		map.put(3, null);
		
		LinkedHashMap<Integer,String>  newMap = SortMapByValue.sortByValue(map);
		
		Assert.assertNotSame(map, newMap);
	}
}
