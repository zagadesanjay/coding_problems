package com.sz.cp;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(factorial(13));
	}
	
	
	private static int factorial(int n) {
		
		int val = 1;
		
		for (int i = n; i > 0;i--) {
			val = val * i;
		}
		return val;
		
	}
	

}
