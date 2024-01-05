package org.ArrayDemoprogs;

//import java.util.Arrays;

/**
 * 
 */
public class ArrayAssendinSort 
{
	public static void main(String[] args) 
	{
		int [] arr= {6,4,9,3,8,1,7,2,5};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Assending order:");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		
		//System.out.println(Arrays.toString(arr));
	}
}
