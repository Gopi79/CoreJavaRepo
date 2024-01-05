package com.methodoverriding;

public class SBI extends RBI 
{
	double getHomeLoaninterst() 
	{
		return 10.25;
	}
	String applyHomeLoan() 
	{
		boolean status = checkElgibility(); 
		if (status)
		{
			double homeLoanRi = getHomeLoaninterst(); 
			String msg = "SBI loan approved with RI as ::" + homeLoanRi;
			return msg;
		}
		else
		{
			return "You are not elgible for home loan";
		}
	}
}
