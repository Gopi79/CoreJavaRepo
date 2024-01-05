package com.programe20strings;

public class FindtheFirstNonrepeatedCharacter 
{
	public static void main(String[] args) 
	{
		String str = "ammahi";
		char ch='\0';
		for(int i=0;i<str.length();i++)
		{
			char chr=str.charAt(i);
			boolean isrepeted=false;
			for(int j=0;j<str.length();j++)
			{
				if(i!=j&&chr==str.charAt(j))
				{
					isrepeted=true;
					break;
				}
			}
			if(!isrepeted)
			{
				ch=chr;
				break;
			}
		}
		if(ch!='\0')
			System.out.println("the first non repeated charecter is:"+ch);
		else
			System.out.println("There are no non-repeated characters in the string");
	}
}