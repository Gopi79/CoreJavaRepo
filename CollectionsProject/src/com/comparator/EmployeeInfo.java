package com.comparator;

import java.util.TreeSet;

public class EmployeeInfo {
	public static void main(String[] args) {
		Employee e1 = new Employee(100, "John", 4, 90000);
		Employee e2 = new Employee(200, "Mark", 2, 40000);
		Employee e3 = new Employee(50, "Alex", 0, 20000);
		Employee e4 = new Employee(150, "Seri", 6, 1200000);
		Employee e5 = new Employee(100, "John", 1, 35000);

		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);

		System.out.println(t);
		// Case-1 [Alex---50, John---100, Seri---150, Mark---200]

		// Case-2 [Alex---50---0---20000, John---100---1---35000,
		// Mark---200---2---40000,
		// John---100---4---90000, Seri---150---6---1200000]

		// Case-3 [Alex---50---0---20000, John---100---1---35000,
		// Mark---200---2---40000, John---100---4---90000, Seri---150---6---1200000]

		TreeSet t1 = new TreeSet(new MyEmployeeComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);

		System.out.println(t1);
		// Case-1 [Alex---50, John---100, Mark---200, Seri---150]

		// Case-2 [Seri---150---6---1200000, John---100---4---90000,
		// Mark---200---2---40000, John---100---1---35000, Alex---50---0---20000]

		// Case-3 [Seri---150---6---1200000, John---100---4---90000,
		// Mark---200---2---40000, John---100---1---35000, Alex---50---0---20000]
	}
}
