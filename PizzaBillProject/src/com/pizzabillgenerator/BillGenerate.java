package com.pizzabillgenerator;

public class BillGenerate 
{
	public static void main(String[] args)
	{
		
		/*
		 * Pizza basceprice=new Pizza(true);
		 * basceprice.addExtraCheese();
		 * basceprice.addExtraTopping();
		 * basceprice.takeAway();
		 * basceprice.getBill();
		 */
		 
		DeluxPizza dp=new DeluxPizza(false);
		dp.takeAway();
		dp.getBill();
	}
}
