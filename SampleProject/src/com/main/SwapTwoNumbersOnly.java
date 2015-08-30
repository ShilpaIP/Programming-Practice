package com.main;

public class SwapTwoNumbersOnly {
	
	public static int[] sortOnceOnly(int[] arr){
		
		
		for(int i=0; i<arr.length; i++){		
			for(int j=arr.length-1; j>i; j--){
				if(arr[j]< arr[j-1])
					swap(arr, j, j-1);
					
			}
		}
		return arr;
	}

	
	private static void swap(int[] arr, int to, int from){
		
		int temp = arr[from];
		arr[from] = arr[to];
		arr[to] = temp;
		
	}
	
	public static void main(String[] args) {
		
		
		int[] result = sortOnceOnly(new int[]{1,2,4,3,5});
		for(int x : result){
			System.out.print(x + " ");
		}
		
	}


}
