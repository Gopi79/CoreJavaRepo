package org.ArraysusingMethods;

public class Arraylength 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40};
		Arraylength al=new Arraylength();
		System.out.println(al.length(arr));
	}
	int length(int[] array)
	{
		return array.length;
	}
}
