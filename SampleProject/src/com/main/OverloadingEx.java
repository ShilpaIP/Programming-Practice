package com.main;

public class OverloadingEx {
	
	public OverloadingEx(){
		System.out.println("Overloading");
	}
	
	public int poly(int a, int b){
		
		return a + b;
	}
	
	public int poly(int a, int b, int c){
		
		return a + b + c;
	}
	
	public static void main(String[] args) {
		
		OverloadingEx ox = new OverloadingEx();
		int result = ox.poly(4,5);
		System.out.println("Result of first method: " + result);
		
		int result1 = ox.poly(4,5,6);
		System.out.println("Result of 2nd overloaded method: " + result1);
	}
	
}
