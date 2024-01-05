package org.Array40Progms;

public class ArrayEvenSumOddSum 
{
	public static void main(String[] args) 
	{
		int [] arr= {5,2,4,1,7,6,8,0,9};
		int evsum=0;
		int odsum=0;
		for(int i:arr)
		{
			if(i%2==0)
				evsum+=i;
			else
				odsum+=i;
		}
		System.out.println("Array Even elements Sum:"+evsum);
		System.out.println("Array Odd elements Sum;"+odsum);
	}
}
