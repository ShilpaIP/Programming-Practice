package com.main;


public class ReverseEachWords {
	
	public static String doReverse(String str){
		String revSen = "";
		
		String[] splitStr = str.split(" ");
		for(int i=0; i<splitStr.length; i++ ){
			String s = splitStr[i];
			String sRev ="";
			for(int j=s.length()-1; j>=0; j--){
				sRev += s.charAt(j);
			}
			splitStr[i] = sRev + " ";
		}
		for(int i=0; i<splitStr.length; i++){
			if(i == splitStr.length-1)
				revSen += splitStr[i].trim();
			else
				revSen += splitStr[i];
		}
	
		return revSen;
		
}
	
	public static void main(String[] args) {
		
		String revSen = doReverse("Hello World, how are you doing!");
		System.out.println(revSen);
	}

}
