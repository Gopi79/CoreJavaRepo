package com.enums;

public class Test1 
{
	public static void main(String[] args)
	{
		Weeks day=Weeks.TUH;
		switch (day) {
		case SUN:
			System.out.println("The Day is Sun Day");
			break;
		case MON:
			System.out.println("The Day is Mon Day");
			break;
		case TUH:
			System.out.println("The Day is Tuh Day");
			break;
		case WED:
			System.out.println("The Day is Wed Day");
			break;
		case THU:
			System.out.println("The Day is Thu Day");
			break;
		case FIR:
			System.out.println("The Day is FIR Day");
			break;
		case STU:
			System.out.println("The Day is STU Day");
			break;
		default:
			System.out.println("Your Entering Wrong Day.");
			break;
		}
	}
}