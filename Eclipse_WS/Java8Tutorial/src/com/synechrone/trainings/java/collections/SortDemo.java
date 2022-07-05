package com.synechrone.trainings.java.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

public class SortDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(901);
		list.add(190);
		list.add(910);
		list.add(290);
		list.add(900);

//		Comparator<Integer> comp = new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//
//				return o1.compareTo(o2);
//			}
//		};
//		list.sort(comp);
		
		
		list.sort((ele1, ele2) ->ele1.compareTo(ele2));
		System.out.println(list);
	}
}
