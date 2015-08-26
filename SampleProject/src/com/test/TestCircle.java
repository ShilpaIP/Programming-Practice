package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.Circle;
import com.main.Shape;

public class TestCircle {
	
	@Test
	public void testPositiveArea(){
		
		Shape circle = new Circle(4.0);
		Assert.assertEquals(circle.calculateArea(), 50.24);
	}
	
	@Test
	public void testPositiveCircumference(){
		
		Shape circle = new Circle(4.0);
		Assert.assertEquals(circle.calculatePerimeter(), 25.12);
	}
	
	@Test
	public void testNegativeArea(){
		
		Shape circle = new Circle(-3.0);
		Assert.assertEquals(circle.calculateArea(), 0.0);
	}
	
	@Test
	public void testNegativeCircumference(){
		
		Shape circle = new Circle(-3.0);
		Assert.assertEquals(circle.calculatePerimeter(), 0.0);
	}
	
	@Test
	public void testZeroArea(){
		
		Shape circle = new Circle(0);
		Assert.assertEquals(circle.calculateArea(), 0.0);
	}
	
	@Test
	public void testZeroCircumference(){
		
		Shape circle = new Circle(0);
		Assert.assertEquals(circle.calculatePerimeter(), 0.0);
	}
	
	

}
