package org.Array40Progms;

public class ArrayMergeTwoSortedArrays 
{
	public static void main(String[] args) 
	{
		int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8, 10 };
        
        int [] mergearray=mergearrays(arr1, arr2);
        System.out.println("MergetwoSorted Arrays");
        for(int f:mergearray)
        {
        	System.out.print(f+" ");
        }
	}
	static int [] mergearrays(int [] arr1,int [] arr2)
	{
		int n=arr1.length;
		int m=arr2.length;
		
		int [] x=new int[n+m];
		int i=0,j=0,k=0;
		while(i<n&&j<m)
		{
			if(arr1[i]<=arr2[j])
				x[k++]=arr1[i++];
			else
				x[k++]=arr2[j++];
		}
		while(i<n)
		{
			x[k++]=arr1[i++];
		}
		while(j<m)
		{
			x[k++]=arr2[j++];
		}
		return x;
	}
}
