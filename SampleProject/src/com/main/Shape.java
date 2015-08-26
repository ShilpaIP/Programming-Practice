package com.main;

public abstract class Shape {
	
	private double noOfSides;
	private double area;
	private double perimeter;
	

	public abstract double calculateArea();
	
	public abstract double calculatePerimeter();

	public void setNoOfSides(double noOfSides) {
		this.noOfSides = noOfSides;
	}
	
	public double getSides(){
		return noOfSides;
	}
	
	


	


	
	
}
