package com.main;

public class BalancedParenthesis {
	
	public static boolean isBalanced(String s){
		int openParen = 0;
		int closeParen = 0;
		
		
		if((s.length() > 0) && ((s.length() % 2) == 0)){
			for(int i=0, j=s.length()-1; i<s.length()/2 && i!=j; i++,j--){
				if(s.charAt(i) == '(' && s.charAt(j) == ')'){
					openParen++;
					closeParen++;
				}
				else
					return false;
			}
				
			if(openParen == closeParen)
				return true;
			else
				return false;		
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		boolean chkParen = isBalanced("(())");
		System.out.println(chkParen);
	}

}
