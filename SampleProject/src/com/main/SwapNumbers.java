package com.main;

public class SwapNumbers {
	
	public static String swapWithoutVariable(int a, int b){
		int origA = a;
		int origB = b;
		String result = "";
		
		if(a == b)
			result = "same number swapping";
		else {
			a = a+b;
			b = a-b;
			a = a-b;
			
			System.out.println("a=" + a + " b=" + b);
			
			if(a == origB && b == origA)
				result = "successful";
			else
				result = "not succesful";
		}
			
		return result;
	}
	
	public static String swapWithVariable(int a, int b){
		int origA = a;
		int origB = b;
		String result = "";
		
		if(a == b)
			result = "same number swapping";
		else {
			int temp = a;
			a = b;
			b = temp;
			
			System.out.println("a=" + a + " b=" + b);
			
			if(a == origB && b == origA)
				result = "successful";
			else
				result = "not succesful";
		}
			
		return result;
	}
	
	public static void main(String[] args) {
		
		String test = swapWithoutVariable(7,7);
		System.out.println(test);
		
		String test2 = swapWithVariable(9, 10);
		System.out.println(test2);
	}

}
