package com.synechrone.trainings.java.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDerivedDataType {

	public static void main(String[] args) {
		
		Integer[] numbers = {10,020,50,30,50,40,55};
		Stream<Integer> intStream = Arrays.stream(numbers);
		
		intStream.forEach(System.out :: println);
		
		
		

		Integer[] numbers1 = {10,020,50,30,50,40,55};
		Stream<Integer> streamArray = Stream.of(numbers1);
		streamArray.forEach(System.out :: println);
		
		Stream<Integer> streamGroup = Stream.of(10,020,50,30,50,40,55);
		
		streamGroup.forEach(System.out :: println);
	}
}
