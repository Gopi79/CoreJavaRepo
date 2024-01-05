package com.telephone;

public interface Telephone 
{
	//PowerOn
	void powerOn();
	
	//dail a Number
	void dail(String phoneNumber);
	
	//answer phone call
	void answer();
	
	//call another phone
	boolean callPhone(String phoneNumber);
	
	// is ringing
	boolean isRinging();
}
