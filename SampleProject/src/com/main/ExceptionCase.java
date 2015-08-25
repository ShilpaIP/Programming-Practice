package com.main;

public class ExceptionCase {
	
	public static int tryConvertingString(String s) throws NumberFormatException {
		
		return Integer.parseInt(s);
		
	}
	
	public static void main(String[] args) {
		
		try{
			tryConvertingString(null);
		} catch(NumberFormatException e){
			e.getMessage();
		} finally {
			System.out.println("String not convertable");
		}
	}

}
