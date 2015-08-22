package com.main;

public class Factorial {
	
	public static int getFactorial(int num){
		
		if(num <= 1)
			return num;
		else
			return num * getFactorial(num - 1);
	}
	
	public static int getFactorial2(int num){
		int fact = 1;
		
		if(num <= 0)
			return fact = num;
		else{
			for(int i=1; i<=num; i++){
				fact = fact * i;
			}
		}
		
		return fact;	
	}
	
	public static void main(String[] args) {
		
		int factorial = getFactorial(5);
		System.out.println("Factorial is: " + factorial);
		
		int factorial1 = getFactorial2(5);
		System.out.println("Factorial is: " + factorial1);
		
	}
	
}
