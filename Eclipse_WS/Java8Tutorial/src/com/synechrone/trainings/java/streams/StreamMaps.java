package com.synechrone.trainings.java.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMaps {

public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(7);
		list.add(2);
		list.add(6);
		list.add(3);
		list.add(4);
		
		List<Integer> mapping = list.stream().map(t -> (t * 5)).collect(Collectors.toList());

		System.out.println("Mapped Values : "  + mapping);
		
		List<Integer> mapping2 = list.stream().map(t -> (t % 2 == 0 ? t : t + 1)).collect(Collectors.toList());
		
		System.out.println("Mapped Values Even : "  + mapping2);
		
		List<Integer> sortedElements = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Original Array : " + list);
		System.out.println("sortedElements : " + sortedElements);
		
		List<Integer> reverseSortedElements = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Original Array : " + list);
		System.out.println("Reverse sortedElements : " + reverseSortedElements);
		
	}
}
