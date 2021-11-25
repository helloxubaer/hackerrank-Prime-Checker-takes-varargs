package com.zubaer.hackerrank;

import java.io.InputStream;

public class Prime {
	InputStream in = System.in;
	public void checkPrime(int... input) {
		
		for(int i : input ) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}//else {
				//System.out.print("");
			//}
			
		}
		System.out.println();
	}
	public boolean isPrime(int num) {
		boolean isPrime = true;
		if(num == 1 || num == -1 ) {
			return false;
		}
		for(int i=2; i<=num/2; i++) {
			int res = num % i;
			
			if( res == 0 ) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			return true;
		}
		
		return false;
	}
}
