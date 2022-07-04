package com.synechrone.trainings.java.colon;

import com.synechrone.trainings.java.innerclass.ListPrintable;
import com.synechrone.trainings.java.innerclass.MltiParameterInterface;
import com.synechrone.trainings.java.innerclass.ParameterInterfce;

public class MethodAssignmentWithArgs {

	static void printMyAge(int age) {
		System.out.println("My Age is " + age);
	}
	
	static void printUserInfo(int age, String name) {
		System.out.println("User age is "  + age);
		System.out.println("User Name is "  + name);
	}
	public static void main(String[] args) {
		ParameterInterfce pi = MethodAssignmentWithArgs :: printMyAge;
		pi.test(55);
		MltiParameterInterface mpi = MethodAssignmentWithArgs :: printUserInfo;
		mpi.test(30, "Aravinda");
		
	}
	
}
