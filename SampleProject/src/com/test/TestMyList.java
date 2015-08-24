package com.test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.MyList;

public class TestMyList {
	
	List<Integer> ml = MyList.create(8);
	
	
	@Test
	public void positiveSearchTest(){	
		
		Assert.assertTrue(MyList.search(ml, 8));
	}
	
	@Test
	public void negativeSearchTest(){
		

		Assert.assertFalse(MyList.search(ml, 9));
	}
	
	@Test
	public void zeroSearchTest(){
	
		Assert.assertFalse(MyList.search(ml, 0));
	}
	
	@Test
	public void zeroCreateTest(){
		
		List<Integer> ml1 = MyList.create(0);
		Assert.assertTrue(ml1.isEmpty());
	}
	
}
