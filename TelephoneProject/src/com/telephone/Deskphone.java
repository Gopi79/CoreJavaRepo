package com.telephone;

public class Deskphone implements Telephone 
{
	
	private String myNumber;
	private boolean isRinging;
	
	public Deskphone(String myNumber)
	{
		this.myNumber=myNumber;
	}

	@Override
	public void powerOn()
	{
		System.out.println("Desk Phone is Always Powered.");
	}

	@Override
	public void dail(String phoneNumber)
	{
		System.out.println("Now Ringing "+phoneNumber+" on DeskPhone");
	}

	@Override
	public void answer()
	{
		if (isRinging)
		{
			System.out.println("Answering the Desk Phone");
			isRinging=false;
		}
		else
		{
			System.out.println("Desk Phone is Not Ringing.");
		}
	}

	@Override
	public boolean callPhone(String phoneNumber) 
	{
		if (phoneNumber==myNumber)
		{
			isRinging=true;
			System.out.println("Desk phone is Ringing.");
		}
		else
		{
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
