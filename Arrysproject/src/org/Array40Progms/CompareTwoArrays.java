package org.Array40Progms;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) 
	{
		int [] arr1= {10,20,30,40,50};
		int [] arr2=arr1;
		int [] arr3= {10,30,15,63,60};
		int [] arr4= {10,20,30,40};
		
		if(Arrays.equals(arr1,arr2))
			System.out.println("arr1&arr2 are equal");
		else
			System.out.println("arr1&arr2 are not equal");
		if(Arrays.equals(arr2, arr3))
			System.out.println("arr2&arr3 are equal");
		else
			System.out.println("arr2&arr3 are not equal");
		if(Arrays.equals(arr3, arr4))
			System.out.println("arr3&arr4 are equal");
		else
			System.out.println("arr3&arr4 are not equal");
	}

}
