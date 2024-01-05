package com.stringbasic;

public class Findgandrusingsplit
{
	public static void main(String[] args)
	{
		String str="java is a programming language";
		String [] nstr=str.split(" ");
		int gcount=0;
		int rcount=0;
		for(String st:nstr)
		{
			gcount=gcount+st.toLowerCase().split("g",-1).length-1;
			rcount=rcount+st.toLowerCase().split("r",-1).length-1;
		}
		System.out.println("g's count:"+gcount);
		System.out.println("r's count:"+rcount);
	}
}
