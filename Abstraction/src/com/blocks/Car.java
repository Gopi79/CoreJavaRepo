package com.blocks;

public class Car 
{
	int speed;
	Car()
	{
		System.out.println("Construcutor");
		System.out.println("Car Speed: "+speed);
	}
	{
		System.out.println("Instance Block");
		speed=60;
	}
	void carspeed()
	{
		speed+=20;
		System.out.println("Car Speed Increases to: "+speed);
	}
	public static void main(String[] args)
	{
		Car car=new Car();
		car.carspeed();
		System.out.println("Mian method.");
	}
}
