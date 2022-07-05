package com.synechrone.trainings.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

public class ReplaceAllDemo {

	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(901);
		list.add(190);
		list.add(910);
		list.add(290);
		list.add(900);
	
//		//replace all elements
//		UnaryOperator<Integer> operator = new UnaryOperator<Integer>() {
//
//			@Override
//			public Integer apply(Integer t) {
//				 return t + 5;
//			}
//		};
//		list.replaceAll(operator);
		
		
		list.replaceAll(ele -> (ele + 5));
		System.out.println(list);
	}
}
