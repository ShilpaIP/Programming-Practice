package com.main;

import java.io.DataInputStream;
import java.io.IOException;

public class InputUsingDataInputStream {
	
	public static int multiply() throws IOException{
		int product = 0;
		DataInputStream ds = new DataInputStream(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = Integer.parseInt(ds.readLine());
		System.out.println("Enter second number: ");
		int num2 = Integer.parseInt(ds.readLine());
		product = num1 * num2;
		
		ds.close();
		return product;
	}
	
	public static void main(String[] args) {
		int result = 0;
		
		try{
			result = multiply();
		} catch (IOException ex){
			ex.getMessage();
		} finally{		
			System.out.println("Product = " + result);
		}
	}

}
