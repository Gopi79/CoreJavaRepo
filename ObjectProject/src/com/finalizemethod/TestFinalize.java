package com.finalizemethod;

public class TestFinalize
{
	public static void main(String[] args)
	{
		TestFinalize obj = new TestFinalize();
		System.out.println(obj.hashCode());
		obj = null;
		System.gc();
		System.out.println("end of garbage collection");
	}
	@Override
	protected void finalize()
	{
		System.out.println("finalize method called");
	}
}
