package com.main;

public class PrintAsterisks {
	
	public static void print(int num){
		
		for(int row=num; row>=1; row--){
			for(int star=1; star<=num-row+1; star++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		print(6);
	}

}
