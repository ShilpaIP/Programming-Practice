package com.main;

public class OverridingEx extends OverloadingEx {
	
	private int random;
	
	public OverridingEx(){
		super();
		random = 10;
		System.out.println("And Overriding concepts.");
	}
	
	public int poly(int a, int b, int c){
		
		return super.poly(a,b,c) + random;
		
	}
	
	public static void main(String[] args) {
		
		OverloadingEx or = new OverridingEx();
		int result = or.poly(4, 5, 6);
		System.out.println("Result of overriding methods: " + result);
		
	}



}
