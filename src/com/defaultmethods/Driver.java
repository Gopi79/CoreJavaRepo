package com.defaultmethods;

public class Driver implements Left, Right 
{
	@Override
	public void m1() {
		Left.super.m1();
	}
	public static void main(String[] args) {
		Driver d=new Driver();
		d.m1();
	}
}
