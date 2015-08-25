package com.main;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
	
	public static void findUsingSet(int[] arr){
		
		Set<Integer> s = new HashSet<Integer>();
		for(int x : arr){
			if(!s.add(x))
				System.out.println("Duplicate: " + x);
		}
	}
	
	public static void main(String[] args) {
		
		int[] a = {4,3,6,6,1,9,3,0};
		findUsingSet(a);
			
				
	}

}
