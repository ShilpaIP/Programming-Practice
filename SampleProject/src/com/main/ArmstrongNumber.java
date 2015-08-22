package com.main;

public class ArmstrongNumber {
	
	public static boolean getArmStrongNumber(int num){
		boolean isArmNum = false;
		
		if(num > 0){
			String n = String.valueOf(num);
			int armNum = 0;
			for(int i=0; i<n.length(); i++){
				char c = n.charAt(i);
				int x = Character.digit(c, 10);
				armNum =  (int) (armNum + Math.pow(x, n.length()));
			}
			if (armNum == num)
				isArmNum = true;
			else
				isArmNum = false;	
		}
		
		return isArmNum;
	}
	
	public static void main(String[] args) {
		
		boolean isArmstrongNum = getArmStrongNumber(153);
		System.out.println(isArmstrongNum);
	}

}
