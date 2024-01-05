package com.carental;

import java.io.IOException;

public class UserCarMenu
{
	public static void main(String[] args) throws IOException
	{
		CarRental userCarRental=new CarRental();
		
		Car carOne=new Car("8055", "BMW", "SUV", 150.00d);
		Car carTwo=new Car("8028", "Ford", "Volvo", 120.00d);
		userCarRental.addCar(carOne);
		userCarRental.addCar(carTwo);
		
		userCarRental.menu();
	}
}
