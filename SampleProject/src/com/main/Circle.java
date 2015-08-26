package com.main;

public class Circle extends Shape implements ShapeConstants {
	
	private double radius;
	
	public Circle(double radius){
		 super.setNoOfSides(radius);
	}

	@Override
	public double calculateArea() {
		
		if(getRadius() > 0.0)
			return PI * Math.pow(getRadius(), 2); 
		else
			return 0.0;
	}

	@Override
	public double calculatePerimeter() {
		
		if(getRadius() > 0.0)
			return (2 * PI * getRadius());
		else 
			return 0.0;
	}
	
	public double getRadius(){
		return super.getSides();
	}
	
	
	
	public static void main(String[] args) {
		
		Circle c = new Circle(3);
		double circleArea = c.calculateArea();
		double circlePerimeter = c.calculatePerimeter();
		double myRadius = c.getRadius();
		System.out.println("Radius of circle is " + myRadius + " with area of " + circleArea + " and circumference of " + circlePerimeter);
	}

	
}
