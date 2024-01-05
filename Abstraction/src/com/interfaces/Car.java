package com.interfaces;

public class Car implements Vehicle {
	int gare;
	int speed;
	
	@Override
	public int garechange(int g) {
		return gare=g;
	}
	@Override
	public int speed(int s) {
		return speed+=s;
	}
	@Override
	public int brake(int b) {
		return speed-=b;
	}
	public void status()
	{
		System.out.println("gare stage: "+gare+" Car speed: "+speed);
	}
}
