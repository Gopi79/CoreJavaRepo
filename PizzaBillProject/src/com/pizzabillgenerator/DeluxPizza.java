package com.pizzabillgenerator;

public class DeluxPizza extends Pizza 
{

	public DeluxPizza(boolean veg)
	{
		super(veg);
		super.addExtraCheese();
		super.addExtraTopping();
	}

	@Override
	public void addExtraCheese() {}

	@Override
	public void addExtraTopping() {}
	
}
