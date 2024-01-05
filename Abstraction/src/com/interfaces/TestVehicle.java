package com.interfaces;

public class TestVehicle 
{
	public static void main(String[] args) 
	{
		Bike be=new Bike();
		be.garechange(2);
		be.speed(3);
		be.brake(2);
		System.out.println("Bike status:");
		be.status();
		
		Car cr=new Car();
		cr.garechange(1);
		cr.speed(2);
		cr.brake(2);
		System.out.println("Car status:");
		cr.status();
	}
}
