package org.ArrayDemoprogs;
public class Array_ReapetedElements
{
	public static void main(String[] args) 
	{
		int [] arr= {3, 2, 1, 3, 4,1,2,5,6};
		System.out.println("Repated Elements are:");
		for(int i=0;i<arr.length;i++)
		{
			int cout=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					cout++;
				}
			}
			if(cout==1)//(cout>0)
				System.out.print(arr[i]+" ");
		}
	}
}