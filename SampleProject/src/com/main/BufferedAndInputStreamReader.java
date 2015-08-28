package com.main;

import java.io.*;

public class BufferedAndInputStreamReader {
	
	public static int substract() {
		int result = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		try{
			System.out.println("Enter number you want to subtract from: ");
			int num1 = Integer.parseInt(br.readLine());
			System.out.println("Enter number you want to subtract with: ");
			int num2 = Integer.parseInt(br.readLine());
			result = num1 - num2;		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int difference = substract();
		System.out.println("Difference is: " + difference);
	}
}
