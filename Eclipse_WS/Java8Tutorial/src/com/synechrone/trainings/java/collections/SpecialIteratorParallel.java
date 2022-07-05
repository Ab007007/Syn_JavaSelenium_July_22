package com.synechrone.trainings.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpecialIteratorParallel {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		 for (int i = 1; i <= 100 ; i++) {
			 list.add(i);
			
		}
		Spliterator<Integer> it = list.spliterator();
		Spliterator<Integer> splitIT = it.trySplit();
		
		new Thread(() -> {
			it.forEachRemaining(ele -> System.out.println("main iterator : " + ele));
			}).start();
		new Thread(() -> {
			splitIT.forEachRemaining(ele -> System.out.println("sub iterator : " + ele));
			}).start();
		
		
	}
}
