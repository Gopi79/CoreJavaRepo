package org.Array40Progms;

public class ArrayAlternative_EvenNumbers 
{
	public static void main(String[] args) 
	{
		int [] arr= {2,4,8,6,10,12,14,16,18,20};
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count+=1;//count=count+1 //count++
				if(count%2!=0)
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}
