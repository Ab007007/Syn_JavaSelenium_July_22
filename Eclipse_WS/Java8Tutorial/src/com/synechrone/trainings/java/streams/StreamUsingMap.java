package com.synechrone.trainings.java.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class StreamUsingMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		
		mp.put(1,  "Aravind");
		mp.put(2,  "Shankar");
		mp.put(3,  "Sachin");
		mp.put(4,  "Raghu");
		mp.put(5,  "Maruthi");
		
		Stream<Entry<Integer, String>> stream1 = mp.entrySet().stream();
		
		Stream<Integer> keys = mp.keySet().stream();
		Stream<String> values = mp.values().stream();
		
		System.out.println("-------------------------------------");
		stream1.forEach(System.out :: println);
		System.out.println("-------------------------------------");
		keys.forEach(System.out :: println);
		System.out.println("-------------------------------------");
		values.forEach(System.out :: println);
	}

}
