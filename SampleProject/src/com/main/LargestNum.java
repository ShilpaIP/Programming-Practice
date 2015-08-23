package com.main;

public class LargestNum {
	
	public static int findLargest(int[] arr){
		int largest = arr[0];
		
		for(int x : arr){
			if(x > largest)
				largest = x;		
		}
		return largest;
	}
	
	public static void main(String[] args) {
		
		int[] a = {3,1,8,4,10,12,94,6};
		int l = findLargest(a);
		System.out.println("Largest is: " + l);
		
	}

}
