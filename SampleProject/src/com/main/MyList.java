package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList {
	
	public static List<Integer> create(int num){
		
		List<Integer> l = new ArrayList<Integer>();
		if(num > 0){
			for(int i=1; i<=num;i++){
				l.add(i);
			}
		}
		
		return l;
	
	}
	
	public static boolean search(List<Integer> l, int key){
		boolean found = false;
		
		for(Integer i : l){
			if (i == key)
				found = true;
		}
		
		return found;
	}
	
	public static void print(List<Integer> l){
		Iterator<Integer> it = l.iterator();
		
		while(it.hasNext()){
			System.out.print(it.next());
		}
	}
	
	public static void printReverse(List<Integer> l){
		ListIterator<Integer> lt = l.listIterator(l.size());
		
		while(lt.hasPrevious()){
			System.out.print(lt.previous());
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> mylist = create(10);
		print(mylist);
		printReverse(mylist);
		if(search(mylist, 0) == true)
			System.out.println(true);
		else 
			System.out.println(false);
	
		
	}

}
