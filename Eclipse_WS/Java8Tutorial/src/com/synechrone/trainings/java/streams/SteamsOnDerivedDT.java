package com.synechrone.trainings.java.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SteamsOnDerivedDT {

	
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Shankar", 300000));
		employees.add(new Employee("Daya", 600000));
		employees.add(new Employee("Aravinda", 800000));
		employees.add(new Employee("Girish", 900000));
		employees.add(new Employee("Prakash", 100000));
		employees.add(new Employee("Harish", 200000));
	
		
	
		List<Employee> sortedByNames = employees.stream().sorted((emp1, emp2) -> emp1.getName().compareTo(emp2.getName())).collect(Collectors.toList());
		System.out.println("---------------- Sorted by names ---------------");
		sortedByNames.forEach(System.out :: println);
		System.out.println(sortedByNames);
		
		List<Employee> sortedBySalary = employees.stream().sorted((emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary())).collect(Collectors.toList());
		System.out.println("---------------- Sorted by Salary ---------------");
		sortedBySalary.forEach(System.out :: println);
		
		
	}
}
