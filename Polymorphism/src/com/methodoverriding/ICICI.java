package com.methodoverriding;

public class ICICI extends RBI 
{
	double getHomeLoaninterst() 
	{
		return 9.75;
	}
	String applyHomeLoan() 
	{
		boolean status = checkElgibility(); 
		if (status)
		{
			double homeLoanRi = getHomeLoaninterst(); 
			String msg = "ICICI loan approved with RI as ::" + homeLoanRi;
			return msg;
		}
		else
		{
			return "You are not elgible for home loan";
		}
	}
}
