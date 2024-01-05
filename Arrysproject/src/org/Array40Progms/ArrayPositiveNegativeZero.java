package org.Array40Progms;

public class ArrayPositiveNegativeZero 
{
	public static void main(String[] args) 
	{
		int [] numbers= {10,-1,0,3,-5,2};
		int positive = 0;
		int negative = 0;
		int zero = 0;
		for (int num : numbers) {
			if (num > 0) 
				++positive;
			else if (num < 0)
				++negative;
			else 
				++zero;
		}
		System.out.println("Positive numbers = " + positive);
		System.out.println("Negative numbers = " + negative);
		System.out.println("Zeros = " + zero);
	}
}
