package com.main;

public class PrimeNumber {
	
	public static boolean isPrime(int num){
		
		if(num <= 1)
			return false;
		else{
			for(int i=2; i<=num/2; i++){
				if(num % i == 0)
					return false;
			}
			return true;
		}		
	}
	
	
	public static void main(String[] args) {
		
		boolean chkPrime = isPrime(7);
		System.out.println(chkPrime);
		
	}

}
