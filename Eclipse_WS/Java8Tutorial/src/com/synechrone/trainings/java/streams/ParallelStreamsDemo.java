package com.synechrone.trainings.java.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import javax.lang.model.element.Element;

public class ParallelStreamsDemo {
	
	public static void main(String[] args) {
		List<Integer> list =  new ArrayList<Integer>();
		
		for (int i = 1;i <= 100; i++)
		{
			list.add(i);
			
		}
		
		
//		Stream<Integer> evenNumbers = list.stream().filter(el -> el %2 ==0);
//		evenNumbers.forEach(System.out :: println);
//		
		Stream<Integer> parallelEvenNumbers = list.parallelStream().filter(el -> el %2 ==0);
		parallelEvenNumbers.forEach(System.out :: println);
		
	}

}
