package com.interfaces;

public class Bike implements Vehicle 
{
	int speed;
	int gare;
	@Override
	public int garechange(int ga) {
		return gare=ga;
	}
	@Override
	public int speed(int sd) {
		return speed+=sd;
	}
	@Override
	public int brake(int bk) {
		return speed-=bk;
	}
	public void status()
	{
		System.out.println("gare stage: "+gare+" Bike speed: "+speed);
	}
}
