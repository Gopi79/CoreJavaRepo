package com.assignmentonstreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestEmployee 
{
	//Section 1
	public static void main(String[] args) 
	{
		List<Employee> emplist=Arrays.asList(
				new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0),
				new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0),
				new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0),
				new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0),
				new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0),
				new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0),
				new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0),
				new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0),
				new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0),
				new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5),
				new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0),
				new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0),
				new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0),
				new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5),
				new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0),
				new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0)
				);
		
		//emplist.stream().forEach(System.out::println);
		
		//1 How Many Male and Female in Organization
		/*
		 * long Female_count =
		 * emplist.stream().filter(el->el.getGender().equals("Female")).count(); long
		 * Male_count =
		 * emplist.stream().filter(el->el.getGender().equals("Male")).count();
		 * System.out.println("Females: "+Female_count);
		 * System.out.println("Males: "+Male_count);
		 */
		
		//2 print all job in Orgganization
		/*
		 * System.out.println("Departments");
		 * emplist.stream().map(el->el.getDept()).distinct().forEach(System.out::println
		 * );
		 */
		
		//3 average ages of men and female
		/*
		 * System.out.println("Males Average ages:"); emplist.stream()
		 * .filter(el->(el.getGender()=="Male")&&(el.getAge()>20 && el.getAge()<68))
		 * .map(el->el.getAge()).distinct().forEach(System.out::println);
		 * 
		 * System.out.println("Females Average ages:"); emplist.stream()
		 * .filter(el->(el.getGender()=="Female")&&(el.getAge()>24 && el.getAge()<71))
		 * .map(el->el.getAge()).distinct().forEach(System.out::println);
		 */
		
		//4 Highest paid employee in Organization
		/*
		 * System.out.println("Employee Name:"); Optional<String> name =
		 * emplist.stream()
		 * .max((s1,s2)->s1.getSal()>s2.getSal()?1:s1.getSal()<s2.getSal()?-1:0)
		 * .map(e->e.getName()); System.out.println(name);
		 */
		
		//5 print all employes after 2015
		/*
		 * System.out.println("Employees After joining 2015:");
		 * emplist.stream().filter(e->e.getYear()>2015).map(e->e.getName()).forEach(
		 * System.out::println);
		 */
		
		//6 count no of employees in each department
		/*
		 * emplist.stream()
		 * .collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()))
		 * .forEach((d,c)->System.out.println(d+"-"+c));
		 */
		
		//7 average sal of each dept
		/*
		 * emplist.stream()
		 * .collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(
		 * Employee::getSal))) .forEach((d,a)->System.out.println(d+"-"+a));
		 */
		
		//8 details of youngest male employee in Development department
		/*
		 * emplist.stream() .filter(e->e.getGender().equals("Male")&&
		 * e.getDept().equals("Development"))
		 * .min(Comparator.comparingInt(Employee::getAge))
		 * .ifPresent(e->System.out.println(e));
		 */
		
		//9 most experience in the organization
		/*
		 * emplist.stream() .max(Comparator.comparingInt(Employee::getAge)).
		 * ifPresent(e->System.out.println(e));
		 */
		
		//10 How many Male & Female employees are there in the sales team
		
		/*
		 * emplist.stream() .filter(e->e.getDept().equals("Sales"))
		 * .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
		 * .forEach((ms,fs)->System.out.println(ms+"-"+fs));
		 */
		
		//11 average salary of Male and Female Employees
		/*
		 * emplist.stream()
		 * .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble
		 * (Employee::getSal)))
		 * .forEach((gen,avg_sal)->System.out.println(gen+"-"+avg_sal));
		 */
		
		//12 List down the names of all employees in each department
		
		/*
		 * emplist.stream()
		 * .collect(Collectors.groupingBy(Employee::getDept,Collectors.mapping(Employee:
		 * :getName,Collectors.toList()))) .forEach((d,n)->System.out.println(d+"-"+n));
		 */		
		
		//13 the average salary and Total Salary of whole organization
		/*
		 * DoubleSummaryStatistics summaryStatistics = emplist.stream()
		 * .mapToDouble(Employee::getSal) .summaryStatistics();
		 * System.out.println("Average Salary: "+summaryStatistics.getAverage());
		 * System.out.println("Total Sal: "+summaryStatistics.getSum());
		 */
		
		//14 Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years
		/*
		 * System.out.println("Employees Younger or equal to 25"); emplist.stream()
		 * .collect(Collectors.partitioningBy(e->e.getAge()<=25))
		 * .getOrDefault(true,null) .forEach(e->System.out.println(e.getName()));
		 * System.out.println("Employees Older Than 25"); emplist.stream()
		 * .collect(Collectors.partitioningBy(e->e.getAge()<=25))
		 * .getOrDefault(false,null) .forEach(e->System.out.println(e.getName()));
		 */
		
		//15 the oldest employee in the organization
		/*
		 * Optional<String> val =
		 * emplist.stream().max(Comparator.comparingInt(Employee::getAge)).map(e->e.
		 * getName()+"-"+e.getAge()); System.out.println(val);
		 */
		
		//16 the Second highest salaried employee details in the organization
		
		  Optional<Employee> second_emp = emplist.stream()
		  .sorted(Comparator.comparingDouble(Employee::getSal).reversed()) .skip(1)
		  .findFirst();
		  System.out.println(second_emp.get().getName()+"-"+second_emp.get().getSal());
		 
		
	}
}