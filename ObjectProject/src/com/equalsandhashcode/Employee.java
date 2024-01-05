package com.equalsandhashcode;

public class Employee 
{
	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object o)
	{
		if(o==null||getClass()!=o.getClass())
			return false;
		if(o==this)
			return true;
		Employee e=(Employee) o;
			return (this.getId()==e.getId());
	}
	@Override
	public int hashCode()
	{
		return getId();
				
	}
	
}
