package com.main;

public class PrintUsingRecursion {
	
	public static void doPrint(int num){
		
		if(num > 1){
			doPrint(num - 1);
		}
		System.out.print(num + " ");
		
	}
	
	public static void main(String[] args) {
		
		doPrint(10);
	}

}
