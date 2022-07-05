package com.synechrone.trainings.java.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamFromArray {

	
	public static void main(String[] args) {
		
		
		int[] elements = {10,20,30,50,80,54};
		IntStream intStream = Arrays.stream(elements);
		
		intStream.forEach(System.out :: println);
		
	}
}
