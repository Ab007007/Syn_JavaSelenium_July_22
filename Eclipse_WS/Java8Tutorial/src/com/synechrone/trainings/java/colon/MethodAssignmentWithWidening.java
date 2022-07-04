package com.synechrone.trainings.java.colon;

import com.synechrone.trainings.java.innerclass.ListPrintable;
import com.synechrone.trainings.java.innerclass.MltiParameterInterface;
import com.synechrone.trainings.java.innerclass.ParameterInterfce;

public class MethodAssignmentWithWidening {

	static void printMyAge(double age) {
		System.out.println("My Age is " + age);
	}
	
	
	public static void main(String[] args) {
		ParameterInterfce pi = MethodAssignmentWithWidening :: printMyAge;
		pi.test(55);
		
	}
	
}
