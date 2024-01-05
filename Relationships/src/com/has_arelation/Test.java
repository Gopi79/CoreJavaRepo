package com.has_arelation;

public class Test 
{
	public static void main(String[] args) 
	{
		Address persionAddres=new Address("Temple Road", "Guntur", "Andhra Pradesh",500001);
		Persion persion=new Persion("Ram", persionAddres);
		System.out.println(persion.getPersionInfo());
	}
}
