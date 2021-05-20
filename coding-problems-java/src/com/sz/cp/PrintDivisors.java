package com.sz.cp;

public class PrintDivisors {

	public static void main(String[] args) {
		System.out.println("The divisors of 100 are: ");
        printDivisors(100);

	}
	
	static void printDivisors(int n)
    {
        // Note that this loop runs till square root
        for (int i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                // If divisors are equal, print only one
                if (n/i == i)
                    System.out.print(" "+ i);
      
                else // Otherwise print both
                    System.out.print(i+" " + n/i + " " );
            }
        }
    }

}
