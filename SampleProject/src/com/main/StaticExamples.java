package com.main;

public class StaticExamples {
	
	public StaticExamples(){
		System.out.println("This is static constructor!");
	}
	
	static{
		System.out.println("This is static block!");
	}
	
	public static void printStaticMethod(){
		System.out.println("This is static method!");
	}
	
	public static void main(String[] args) {
		
		StaticExamples se = new StaticExamples();
		printStaticMethod();
	}

}
