package com.methodoverriding;

public class OpTest 
{
	public static void main(String[] args) 
	{
		HealthIndia Hi=new HealthIndia();
		Yashoda Yh=new Yashoda();
		Apollo Ah=new Apollo();
		int hop=Hi.getOpNumber();
		int yop=Yh.getOpNumber();
		int aop=Ah.getOpNumber();
		System.out.println(hop);
		System.out.println(yop);
		System.out.println(aop);
	}
}
