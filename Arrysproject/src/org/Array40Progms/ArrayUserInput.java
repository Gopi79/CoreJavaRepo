package org.Array40Progms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayUserInput 
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		System.out.println("Enter the Size of Array:");
		String str=br.readLine();
		int size=Integer.parseInt(str);
		int [] arr=new int [size];
		System.out.println("the Size of array is:"+arr.length);
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++)
		{
			String str1=br.readLine();
			arr[i]=Integer.parseInt(str1);
		}
		System.out.println(Arrays.toString(arr));
	}
}
