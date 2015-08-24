package com.main;

public class FindAndReplaceSubstring {
	
	public static String replaceSubstring(String origStr, String subStr, String replacementStr){
		
		if(origStr != null && subStr != null && replacementStr != null)
			return origStr.replace(subStr, replacementStr);
		else
			throw new NullPointerException();
	}
	
	public static void main(String[] args) {
		
		String rplStr = replaceSubstring("", "can do", "will do");
		System.out.println(rplStr);
	}
	

}
