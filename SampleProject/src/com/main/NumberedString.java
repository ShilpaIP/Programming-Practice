package com.main;

public class NumberedString {
	
	public static String giveNumbers(String str){
		int count = 0;
		String numStr = "";
		
		if(!str.equals(" ") && !str.equals("")){
			String[] splitStr = str.split(" ");
			for(int i=0; i<splitStr.length; i++){
				if(i == splitStr.length-1){
					count++;
					numStr = numStr + splitStr[i] + count;
				}
				else{		
					count++;
					numStr = numStr + splitStr[i] + count + " ";
				}
			}
		}
		else
			numStr = null;
		
		return numStr;
	}
	
	public static void main(String[] args) {
		
		String newStr = giveNumbers("this is nice");
		System.out.println(newStr);
	}

}
