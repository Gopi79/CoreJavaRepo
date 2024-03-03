package com.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test 
{
	public static void main(String[] args) 
	{
		LocalDate date=LocalDate.now();
		
		LocalTime time=LocalTime.now();
		
		System.out.println(date);
		
		System.out.println(time);
		
		int dd=date.getDayOfMonth();
		
		int mm=date.getMonthValue();
		
		int yyyy=date.getYear();
		
		System.out.printf("\n%d/%d/%d",dd,mm,yyyy);
		
		int h=time.getHour();
		
		int m=time.getMinute();
		
		int s=time.getSecond();
		
		int n=time.getNano();
		
		System.out.printf("\n%d:%d:%d:%d",h,m,s,n);
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println();
		System.out.println(dt);
		
		int d=dt.getDayOfMonth();
		
		int mt=dt.getMonthValue();
		
		int yy=dt.getYear();
		
		System.out.printf("\n%d-%d-%d",d,mt,yy);
		
		int ho=dt.getHour();
		
		int mi=dt.getMinute();
		
		int se=dt.getSecond();
		
		int na=dt.getNano();
		
		System.out.printf("\n%d>%d>%d>%d",ho,mi,se,na);
	}
}