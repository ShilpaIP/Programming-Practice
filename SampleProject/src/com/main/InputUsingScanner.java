package com.main;

import java.util.Scanner;

public class InputUsingScanner {
	
	public static int add(){
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		sum = num1 + num2;
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int result = add();
		System.out.println("Result = " + result);
	}
}
