package com.main;

public class MissingNumber {
	
	public static int findMissingNumber(int[] arr){
		int expectedLength = arr.length + 1;
		int expectedSum = (expectedLength + 1) * expectedLength/2;
		int actualSum = 0;
		
		if(arr == null || arr.length <= 0)	
			return -1;
		else{
			for(int x : arr){
				if(x > 0)
					actualSum += x;
				else
					return -1;
			}
		}
			
		return expectedSum - actualSum;
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,3,4,5};
		int missingNumber = findMissingNumber(a);
		System.out.println("Missing number is: " + missingNumber);
		
				
	}

}
