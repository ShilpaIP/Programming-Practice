package com.main;

public class CommonNumber {
	
	//This program assumes that only 1 number is common in both the arrays
	public static int findCommonNumber(int[]a, int[] b){
		int commonNum = a[0];
		
		for(int x : a){
			for(int y : b){
				if(x == y)
					commonNum = x;
			}
		}
		
		return commonNum;
	}
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {9,8,7,6,5};
		int number = findCommonNumber(arr1, arr2);
		System.out.println("Common number is both arrays is: " + number);
				
		
	}

}
