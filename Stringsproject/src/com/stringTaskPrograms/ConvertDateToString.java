package com.stringTaskPrograms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ConvertDateToString 
{
	public static void main(String[] args) 
	{
		String date = "07-27-2020";
		System.out.print(convertDateToString(date));
	}
	public static String convertDateToString(String date) 
	{
		DateFormat df = new SimpleDateFormat(date);
		java.util.Date today = Calendar.getInstance().getTime();
		String dateToString = df.format(today);
		return (dateToString);
	}
}
