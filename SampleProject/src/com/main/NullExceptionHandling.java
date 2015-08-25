package com.main;

public class NullExceptionHandling {
	
	private String exceptName;
	
	private NullExceptionHandling(){}
	
	public static NullExceptionHandling create(){
		return new NullExceptionHandling();
	}

	public int getexceptNameLength(){
		return exceptName.length();
	}
	
	

	
	
	public static void main(String[] args) {
		
		NullExceptionHandling e = null;
		System.out.println(e.getexceptNameLength());
	}
	
	

}
