package com.multipleinheritance;

public class NewTest 
{
	public static void main(String[] args)
	{
		System.out.println("User1 Permissions");
		User1 user1=new Test1();
		user1.read();
		user1.write();
		System.out.println("User2 Permissions");
		User2 user2=new Test1();
		user2.write();
		user2.execute();
	}
}
