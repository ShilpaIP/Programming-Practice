package com.main;

import java.io.Console;

public class InputUsingConsole {
	
	public static int divide(){
		int division = 0;
		Console cs = System.console();
		
		if(cs == null){
			System.out.println("Null");
		}
		else{
		/*	if(cs != null){
				System.out.println("Enter first number: ");
				String n1= cs.readLine("Num1: ");
				int num1 = Integer.parseInt(n1);
				System.out.println("Enter second number: ");
				String n2= cs.readLine("Num2: ");
				int num2 = Integer.parseInt(n2);
				if(num2 == 0)
					throw new ArithmeticException("Division by zero not allowed!");
				else
					division = num1/num2;
			} */
		} 
		return division;
	}
	
	public static void main(String[] args) {
		
		int div = divide();
		System.out.println("Division = " + div);
	}

}
