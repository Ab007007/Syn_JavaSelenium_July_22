package com.synechrone.trainings.java.lambdaexp;

import com.synechrone.trainings.java.innerclass.InterfaceWithReturnValue;

public class LambdaExpressionWithReturnType {

	
	public static void main(String[] args) {
		InterfaceWithReturnValue iv = () -> {
			System.out.println("Default age for DL is");
			return 18;
		};
		int age  = iv.getMinAge();
		System.out.println(age);
	}
}
