package org.ArrayDemoprogs;

import java.util.Arrays;

public class Arraydemo 
{
	public static void main(String[] args) 
	{
		int [] arr=new int [3];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		/*for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}*/
		/*for(int a:arr)
		{
			System.out.print(a+" ");
		}*/
		System.out.println(Arrays.toString(arr));
	}
}
