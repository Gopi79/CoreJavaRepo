package com.streamfilters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test 
{
	public static void main(String[] args)
	{
		List<Emplyoee> l=new ArrayList<>();
		l.add(new Emplyoee(289479,"Alex"));
		l.add(new Emplyoee(238763,"Jhon"));
		l.add(new Emplyoee(193847,"Mark"));
		l.add(new Emplyoee(279374,"Seri"));
		l.add(new Emplyoee(583972,"Eeric"));
		l.add(new Emplyoee(109372,"Dom"));
		
		List<Emplyoee> newlist = l.stream().filter(i->i.getEmpno()%2!=0).collect(Collectors.toList());
		newlist.forEach(System.out::println);
		System.out.println("--------------------------");
		List<Emplyoee> strlist = l.stream().filter(i->i.getEname().endsWith("x")).collect(Collectors.toList());
		strlist.forEach(System.out::println);
	}
}