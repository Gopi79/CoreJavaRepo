package com.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Test1 
{
	public static void main(String[] args) 
	{
		//of
		LocalDateTime dt=LocalDateTime.of(2000,03,07,12,30);
		System.out.println(dt);
		System.out.println("After:"+dt.plusMonths(6));
		System.out.println("Befour:"+dt.minusMonths(4));
		
		//period
		LocalDate bithday=LocalDate.of(2000,03,07);
		LocalDate today=LocalDate.now();
		Period p=Period.between(bithday, today);
		System.out.printf("You are age is %d Years and %d Months %d Days",p.getYears(),p.getMonths(),p.getDays());
		System.out.println();
		
		//isLeap
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year: ");
		int n=sc.nextInt();
		Year y=Year.of(n);
		if(y.isLeap())
			System.out.printf("%d is a Leap Year",n);
		else
			System.out.printf("%d is not a Leap Year",n);
		sc.close();
		System.out.println();
		
		//Zone
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		System.out.println();
		
		ZoneId ze=ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt=ZonedDateTime.now(ze);
		System.out.println(zdt);
	}
}