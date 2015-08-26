package com.main;

import java.util.Arrays;

public class Merge {
	
	public static int[] doMerge(int[] a, int[] b){
		int[] newArr = new int[a.length + b.length];
		
		int i=0;
		while(i<newArr.length){
			for(int x : a){
				newArr[i] = x;
				i++;
			}
			for(int x : b){
				newArr[i] = x;
				i++;
			}
		}	
		return newArr;
	}
	
	public static void main(String[] args) {
		
		int[] myArr = doMerge(new int[Integer.MIN_VALUE], new int[Integer.MIN_VALUE]);
		for(int x : myArr){
			System.out.print(x + " ");
		}
	}

}
