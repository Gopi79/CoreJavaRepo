package com.telephone;

public class Mobilephone implements Telephone 
{
	private String myNumber;
	private boolean isRinging;
	private boolean ispowerOn;
	
	public Mobilephone(String myNumber)
	{
		this.myNumber=myNumber;
	}

	@Override
	public void powerOn()
	{
		ispowerOn=true;
		System.out.println("Phone Powered On.");
	}

	@Override
	public void dail(String phoneNumber)
	{
		System.out.println("Now Ringing "+phoneNumber+" on MobilePhone");
	}

	@Override
	public void answer()
	{
		if (isRinging && ispowerOn)
		{
			System.out.println("Answering the Mobile Phone");
			isRinging=false;
		}
//		else
//		{
//			System.out.println("Mobile Phone is Not Ringing.");
//		}
	}

	@Override
	public boolean callPhone(String phoneNumber) 
	{
		if (phoneNumber==myNumber && ispowerOn)
		{
			isRinging=true;
			System.out.println("Mobile phone is Ringing.");
		}
		else
		{
			System.out.println("Either Wrong Number is Entered or Mobile Phone is Off.");
			isRinging=false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() 
	{
	
		return isRinging;
	}
}
