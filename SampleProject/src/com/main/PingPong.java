package com.main;

public class PingPong {
	
	public static String print(int num){
		String result = "";
		
		if(num <= 0)
			result = "Error, zero or less number not allowed";
		else if(num%3 == 0 && num%5 == 0)
			result = "ping pong";
		else if(num%3 ==0 || num%5 ==0) {
			if(num%3 == 0)
				result = "ping";
			else if(num%5 == 0)
				result = "pong";
		}
		else
			result = "Error, number not divisable by 3 or 5.";
				
		return result;	
	}
	
	public static void main(String[] args) {
		
		String r1 = print(15);
		String r2 = print(25);
		String r3 = print(9);
		String r4 = print(0);
		String r5 = print(7);
		
		System.out.println(r1 +"\n" + r2 + "\n" + r3 + "\n" + r4 + "\n" + r5);
		
	}

}
