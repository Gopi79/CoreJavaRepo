package com.stringBuffer;

public class DeleteMethod
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Welcome");
		sb.delete(0,5);
		System.out.println(sb);
		sb.deleteCharAt(3);
		System.out.println(sb);
	}
}
