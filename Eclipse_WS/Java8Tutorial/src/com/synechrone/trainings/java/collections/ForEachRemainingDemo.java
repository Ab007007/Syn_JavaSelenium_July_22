package com.synechrone.trainings.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

public class ForEachRemainingDemo {

	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(901);
		list.add(190);
		list.add(910);
		list.add(290);
		list.add(900);
		
		Iterator<Integer> it = list.iterator();
//		it.forEachRemaining(ele -> System.out.println("Element : " + ele));
		
		it.forEachRemaining(System.out :: println);
		
		// remove if
		list.removeIf(ele -> (ele % 3 == 0));
		System.out.println(list);
		
		//replace all elements
		UnaryOperator<Integer> operator = new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t) {
				 return t + 5;
			}
		};
		list.replaceAll(operator);
		System.out.println(list);
	}
}
