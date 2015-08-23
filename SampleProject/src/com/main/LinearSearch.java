package com.main;

public class LinearSearch {
	
	public static boolean search(int[] arr, int key){
		boolean found = false;
		
		for(int x : arr){
			if(x == key)
				found = true;
		}
		
		return found;
	}
	
	public static void main(String[] args) {
		
		boolean search =  search(new int[]{4,9,7,5,3}, 5);
		System.out.println(search);
	}

}
