package com.has_arelation;

public class Address 
{
	private String street;
	private String city;
	private String state;
	private int zipCode;
	public Address(String street, String city, String state, int zipCode)
	{
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	String getAddressinfo()
	{
		return street+",\n"+city+",\n"+state+",\n"+zipCode;
	}	
}
