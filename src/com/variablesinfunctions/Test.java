package com.variablesinfunctions;

public class Test {
	int x=7;
	
	public void m2() {
		Interf f=()->{
			int x=8;
			System.out.println(x);
			System.out.println(this.x);
		};
		f.m1();
	}
	public static void main(String[] args)
	{
		Test t=new Test();
		t.m2();
	}
}
