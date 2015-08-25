package com.main;

import java.util.*;

public class MyMap {
	
	 
	
	public static Map<Integer, String> createMap(){
		Map<Integer, String> mp = new HashMap<Integer, String>();
		
		mp.put(123, "Tom Brown");
		mp.put(671, "Frank Dew");
		mp.put(913, "Rita Gaur");
		mp.put(498, "Yusuf Ahmed");
		mp.put(725, "Gary Crow");
		
		return mp;
	}
	
	public static String searchMap(Map<Integer, String> m,int key){
		
		Set<Integer> s = m.keySet();
		Iterator<Integer> it = s.iterator();
		
		String value = "";
		while(it.hasNext()){
			int k = it.next();
			if(k == key)
				value = m.get(k);
		}
		
		return value;
	}
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = createMap();
		String value = searchMap(map, 725);
		System.out.println("Value of 725: " + value);
		
		
		
	}

}
