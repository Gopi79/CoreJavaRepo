package com.methodoverloading;

public class ShoppingCart 
{
	void addItem(String itemName)
	{
		System.out.println(itemName+" added to the cart");
	}
	void addItem(String itemName,int quantity)
	{
		System.out.println(quantity+" "+itemName+"s added to the cart");
	}
	void addItem(String itemName,int quantity,double price)
	{
		double totalprice=quantity*price;
		System.out.println(quantity+" "+itemName+"s added to the cart.Total price:$"+totalprice);
	}
	public static void main(String[] args)
	{
		ShoppingCart cart=new ShoppingCart();
		cart.addItem("T-shirt");
		cart.addItem("Shoes", 2);
		cart.addItem("Sunglasses", 2, 44.99);
	}
}
