package com.stringBuffer;

public class CapacityDemo 
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Welcome to Vtalent");
		System.out.println(sb.capacity());
		sb.ensureCapacity(35);
		System.out.println(sb.capacity());
	}
}
