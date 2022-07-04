package com.synechrone.trainings.java.lambdaexp;

import com.synechrone.trainings.java.innerclass.ParameterInterfce;

public class LambdaExpressionWithParameter {

	
	public static void main(String[] args) {
		
		
		ParameterInterfce pi = (int x) -> System.out.println("from test " + x);

		pi.test(100);
		pi.test(1000);
		pi.test(10000);
	
	}
}
