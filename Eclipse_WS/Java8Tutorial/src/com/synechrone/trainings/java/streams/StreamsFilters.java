package com.synechrone.trainings.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFilters {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(910);
		list.add(901);
		list.add(190);
		list.add(90);
		list.add(901);
		list.add(190);
		list.add(290);
		list.add(900);
		
		Stream<Integer> stream = list.stream();
	
		List<Integer> result1 = stream.filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t > 200 ;
			}
		}).collect(Collectors.toList());
		System.out.println(result1);
		
		
		// using lambda 
		Stream<Integer> streamLambda = list.stream();
		List<Integer> result2 = streamLambda.filter(ele -> ele > 200).collect(Collectors.toList());
		System.out.println("Using Lambda " + result2);
		
		Stream<Integer> evenNumbers = list.stream();
		List<Integer> collect3 = evenNumbers.filter(ele -> ele % 2 ==0).collect(Collectors.toList());
		System.out.println("Even Numbers: " + collect3);
		
		Stream<Integer> oddNumbers = list.stream();
		List<Integer> collect4 = oddNumbers.filter(ele -> ele % 2 !=0).collect(Collectors.toList());
		System.out.println("Odd Numbers: " + collect4);

		
		List<Integer> uniqueElements = list.stream().distinct().collect(Collectors.toList());
		System.out.println("------------------------------------");
		System.out.println(uniqueElements);
		System.out.println("------------------------------------");
		
		Optional<Integer> num = list.stream().filter(ele -> ele > 900).findFirst();
		
		System.out.println(num);
		num.ifPresent(System.out :: println);
		System.out.println("isPresent : " + num.isPresent());
		Optional<Integer> num2 = list.stream().filter(ele -> ele > 900).findAny();
		
		System.out.println(num2);
		
	}
}
