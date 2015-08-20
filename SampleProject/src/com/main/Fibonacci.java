package com.main;

public class Fibonacci {
	
	public static int getFibonacci(int num){
		
		if(num == 0 || num == 1)
			return num;
		else
			return getFibonacci(num - 1) + getFibonacci(num - 2);
	}
	
	public static String printFibonacci(int num){
		String test = null;
		
		if(num < 0)
			test = "Error";
			
		else{	
			for(int i=0; i<=num; i++){
				int fib = getFibonacci(i);
				System.out.print(fib + " ");
			}
			test = "passed";
		}
		return test;
	}
	
	public static void main(String[] args) {
		
		String expected = printFibonacci(20);
		System.out.println(expected);
		
	}

}
