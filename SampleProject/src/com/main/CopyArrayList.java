package com.main;

import java.util.*;

public class CopyArrayList {
	
	public static String[] copy(List<String> l){
		
		String[] arr = new String[l.size()];
		return l.toArray(arr);
	}
	
	public static void main(String[] args) {
		
		List<String> arrList = new ArrayList<String>();
		arrList.add("Working");
		arrList.add("hard");
		arrList.add("will");
		arrList.add("give");
		arrList.add("success");
		
		String[] newArr = copy(arrList);
		System.out.println(Arrays.toString(newArr));
		
			
	}

}
