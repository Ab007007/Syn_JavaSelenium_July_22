package com.synechrone.trainings.java.streams;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamDemoForSet {

public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(90);
		set.add(901);
		set.add(190);
		set.add(910);
		set.add(290);
		set.add(900);
		
		Stream<Integer> stream1 = set.stream();
		
	//	stream1.forEach(e -> System.out.println(e));
		stream1.forEach(System.out :: println);
	}
}
