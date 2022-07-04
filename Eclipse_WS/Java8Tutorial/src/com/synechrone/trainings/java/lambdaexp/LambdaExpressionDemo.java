package com.synechrone.trainings.java.lambdaexp;

import com.synechrone.trainings.java.innerclass.ListPrintable;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		
		ListPrintable lp = () -> System.out.println("done!!!!!! from Lambda");
		
		lp.printInfo();
		
	}
}
