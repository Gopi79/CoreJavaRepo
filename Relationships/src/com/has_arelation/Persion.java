package com.has_arelation;

public class Persion 
{
	private String name;
	private Address address;
	public Persion(String name, Address address)
	{
		this.name = name;
		this.address = address;
	}
	String getPersionInfo()
	{
		return name+"\nAddress:\n"+address.getAddressinfo();
	}
}
