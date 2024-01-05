package org.demo;

public class Demo
{
	public int id;
	public String name;
	
	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.print(101,"ram");
		System.out.println(d.id+" "+d.name);
	}
	public void print(int did,String dname)
	{
		id=did;
		name=dname;
	}
}
