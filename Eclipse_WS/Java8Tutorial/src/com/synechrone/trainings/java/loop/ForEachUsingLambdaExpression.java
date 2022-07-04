package com.synechrone.trainings.java.loop;

import java.util.ArrayList;

public class ForEachUsingLambdaExpression {

	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();  //Ctrl  + Shift + O
		al.add(123);
		al.add(1232);
		al.add(1233);
		al.add(1234);
		al.add(1236);
		al.forEach((ele) -> System.out.println("consuming using lambda " + ele));
		al.forEach(ele -> {
			System.out.println("-----------------------");
			System.out.println(" using lambda " + ele);
			
		});
	}
}
