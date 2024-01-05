package com.is_arelation;

public class Test extends Student //IS-A relation
{
	public static void main(String[] args) 
	{
		Student stu=new Student();
		stu.setStudentId(101);
		stu.setStudentName("Ram");
		stu.setStrudentAddress("Hyderabad");
		System.out.println(stu.getStudentId()+"\n"+stu.getStudentName()+"\n"+stu.getStrudentAddress());
	}
}
