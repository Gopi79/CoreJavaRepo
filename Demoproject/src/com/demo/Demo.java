package com.demo;

public class Demo {
	public static void main(String[] args) {
		int a = 5;	//a=5
		
		int b = a * 10; //b=50
		
		int c = a++ - ++a + b--; //a=7, b=49 c=48
		
		b = a + b++ - ++b + a--;	//a=6 b=12 c=48
		
		c = a++ + b%3 + b++ + --c; //a=7 b=13 c=65 
		
		a += b-- - --c;	//a=-44 b=12 c=64
		
		System.out.println(a + c + " hi java " + b + (a + c)); // 20 hi java 1220
		
	}
}
