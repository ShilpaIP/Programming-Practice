package com.main;

import java.util.*;
import java.util.Map.Entry;

public class SortMapByValue {
		
	public static LinkedHashMap<Integer, String> sortByValue(HashMap<Integer, String> map){
		
		LinkedHashMap<Integer, String> newMap = new LinkedHashMap<Integer, String>();
		
		List<Integer> keys = new ArrayList(map.keySet());
		List<String> values = new ArrayList(map.values());
	    
		Collections.sort(keys);
		Collections.sort(values);
		
		
		Iterator itv = values.iterator();
		while(itv.hasNext()){
			String val = (String) itv.next();
			
			Iterator itk = keys.iterator();
			while(itk.hasNext()){
				Integer k = (Integer) itk.next();
				String valInMap = map.get(k);
				if(val.equals(valInMap)){
					values.remove(k);
					map.remove(k);
					newMap.put(k, val);
				}
			}
		}
		return newMap;
		
	}
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> myMap = new HashMap<Integer, String>();
		myMap.put(1, "frank");
		myMap.put(2, "bob");
		myMap.put(3, "lilian");
		myMap.put(4, "abel");
		
		LinkedHashMap<Integer, String> resultMap = sortByValue(myMap);
		
		System.out.println("Key   Values");
		System.out.println("************\n");
		
		for(Entry<Integer, String> pairs : resultMap.entrySet()){
			Integer key = pairs.getKey();
			String value = pairs.getValue();
			System.out.println(key + " : " + value);
		}
	}

}
