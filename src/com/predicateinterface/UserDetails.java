package com.predicateinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserDetails 
{
	public static void main(String[] args)
	{
		List<User> user_list=new ArrayList<>();
		user_list.add(new User("Jhon","admin"));
		user_list.add(new User("Peter", "member"));
		List<User> admins=UserDetails.process(user_list,(User u)->u.getrole().equals("admin"));
		System.out.println(admins);
	}
	public static List<User> process(List<User> user_list,Predicate<User> p)
	{
		List<User> admin_list=new ArrayList<>();
		for(User users:user_list) {
			if(p.test(users))
				admin_list.add(users);
		}
		return admin_list;
	}
}