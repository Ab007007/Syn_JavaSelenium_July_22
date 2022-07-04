package com.synechrone.trainings.java.lambdaexp;

import com.synechrone.trainings.java.innerclass.MltiParameterInterface;

public class LambdaExpressionWithMultiParams {

	
	public static void main(String[] args) {
		
		MltiParameterInterface ml = (x, y) -> {
			System.out.println("Age :  " + x);
			System.out.println("Name :  " + y);
			if(x>18) {
				System.out.println(y + " is eligible for DL");
			}
			else {
				System.out.println( y + " should wait for " + (18 - x) + " years for DL");
			}
				
		};
		
		ml.test(10, "aravinda");
		ml.test(20, "AHB");
		ml.test(30, "HBA");
	}
}
