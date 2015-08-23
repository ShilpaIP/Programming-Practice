package com.main;

public class Sort {
	
	public static int[] doSort(int[] arr){
		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[j] < arr[i]){
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}	
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] sortedArr = doSort(new int[]{9,3,1,8,5});
		for(int x : sortedArr){
			System.out.println(x);
		}
	}

}
