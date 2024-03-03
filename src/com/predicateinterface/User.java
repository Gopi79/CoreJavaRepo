package com.predicateinterface;

public class User 
{
	private String name;
	private String role;
	
	public User(String name,String role) {
		this.name=name;
		this.role=role;	
	}
	public String getname() {
		return name;
	}
	public String getrole()
	{
		return role;
	}
	@Override
	public String toString() {
		return "UserName:"+name+",Role:"+role;
	}
}