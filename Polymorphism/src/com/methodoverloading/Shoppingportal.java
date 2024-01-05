package com.methodoverloading;

public class Shoppingportal 
{
	void makePayment(String userName,String password)
	{
		//Internet Banking
		System.out.println(userName+" "+password);
	}
	void makePayment(long mobileNumber,int upiPin)
	{
		//PhonePay,Google Pay,Paytm Payment
		System.out.println(mobileNumber+" "+upiPin);
	}
	void makePayment(long cardNumber,int cvv,String name,String expireDate)
	{
		//Debit or Credit Card Payment
		System.out.println(cardNumber+" "+cvv+" "+name+" "+expireDate);
	}
	public static void main(String[] args)
	{
		Shoppingportal payment=new Shoppingportal();
		payment.makePayment("Ram", "Ram@1234");
		payment.makePayment(9381233495l, 2023);
		payment.makePayment(982423489475l, 344, "Ram", "28/07");
	}
}
