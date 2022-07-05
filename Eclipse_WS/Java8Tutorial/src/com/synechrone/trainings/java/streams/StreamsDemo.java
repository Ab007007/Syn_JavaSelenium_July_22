package com.synechrone.trainings.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(901);
		list.add(190);
		list.add(910);
		list.add(290);
		list.add(900);
		
		Stream<Integer> stream1 = list.stream();
		
	//	stream1.forEach(e -> System.out.println(e));
		stream1.forEach(System.out :: println);
	}
}
