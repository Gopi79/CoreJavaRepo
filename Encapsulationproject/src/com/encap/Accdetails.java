package com.encap;

public class Accdetails
{
	public static void main(String[] args)
	{
		Account ac=new Account();
		ac.setAccno(5678);
		ac.setName("raj");
		ac.setAmount(25000.99f);
		System.out.println(ac.getAccno());
		System.out.println(ac.getName());
		System.out.println(ac.getAmount());
	}
	
}
