package com.main;

public class CheckPallindrome {
	
	public static boolean isPallindrome(String s){
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--){
			rev += s.charAt(i);
		}
		if(rev.equalsIgnoreCase(s))
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		
		boolean chkPallin = isPallindrome("Anna");
		System.out.println(chkPallin);
		
		boolean chkPallin1 = isPallindrome("hello");
		System.out.println(chkPallin1);
		
	}

}
