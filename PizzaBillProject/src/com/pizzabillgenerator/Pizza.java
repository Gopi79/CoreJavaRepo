package com.pizzabillgenerator;

public class Pizza 
{
	private int price;
	private boolean veg;
	private int extraCheesePrice=100;
	private int extraToppingAdded=150;
	private int backPack=20;
	private int basePrice;
	private boolean isExtraCheeseAdded=false;
	private boolean isExtraToppingAdded=false;
	private boolean isOptedForTakeAway=false;
	public Pizza(boolean veg)
	{
		this.veg = veg;
		if(this.veg)
			this.price=300;
		else
			this.price=400;
		this.basePrice=this.price;
	}
	public void addExtraCheese()
	{
		isExtraCheeseAdded=true;
		this.price+=extraCheesePrice;
	}
	public void addExtraTopping()
	{
		isExtraToppingAdded=true;
		this.price+=extraToppingAdded;
	}
	public void takeAway()
	{
		isOptedForTakeAway=true;
		this.price+=backPack;
	}
	public void getBill()
	{
		String bill="";
		System.out.println("Pizza:"+basePrice);
		if(isExtraCheeseAdded)
			bill+="Extra CheeseAdded:"+extraCheesePrice+"\n";
		if(isExtraToppingAdded)
			bill+="Extra ToppingAdded:"+extraToppingAdded+"\n";
		if(isOptedForTakeAway)
			bill+="Take Away:"+backPack+"\n";
		bill+="Bill:"+this.price+"\n";
		System.out.println(bill);
	}
}
