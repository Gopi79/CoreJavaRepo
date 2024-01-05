package com.encap;

public class Area
{
	int length;
	int breadth;
	
	Area(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public int getArea()
	{
		int area=length*breadth;
		return area;
	}
}
