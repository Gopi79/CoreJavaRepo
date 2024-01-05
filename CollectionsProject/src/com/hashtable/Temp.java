package com.hashtable;

public class Temp 
{
	int i;
	public Temp(int i)
	{
		this.i=i;
	}
	@Override
	public int hashCode() {
//		return i%11;
//		return i%9;
		return i%25;
	}
	@Override
	public String toString() {
		return "" + i;
	}
	
}
