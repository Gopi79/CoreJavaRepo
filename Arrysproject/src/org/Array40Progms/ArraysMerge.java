package org.Array40Progms;

public class ArraysMerge
{
	public static void main(String[] args)
	{
		int [] arr= {4,7,3,9};
		int [] arr1= {1,8,2,4,5};
	    
		int [] mergarr=new int[arr.length+arr1.length];
		
		/*System.arraycopy(arr, 0, mergarr, 0, arr.length);
		System.arraycopy(arr1, 0, mergarr, arr.length, arr1.length);
		
		for(int i=0;i<mergarr.length;i++)
		{
			System.out.print(mergarr[i]+" ");
		}*/
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			mergarr[i]=arr[i];
			count++;
		}
		for(int j=0;j<arr1.length;j++)
		{
			mergarr[count++]=arr1[j];
		}
		for(int x=0;x<mergarr.length;x++)
		{
			System.out.print(mergarr[x]+" ");
		}
	}
}
