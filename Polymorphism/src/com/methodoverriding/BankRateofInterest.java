package com.methodoverriding;

public class BankRateofInterest 
{
	public static void main(String[] args)
	{
		SBI sbi=new SBI();
		String msg=sbi.applyHomeLoan();
		System.out.println(msg);
		ICICI icici=new ICICI();
		String mms=icici.applyHomeLoan();
		System.out.println(mms);
	}
}
