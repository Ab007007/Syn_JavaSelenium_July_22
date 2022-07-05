package com.synechrone.trainings.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class GetDefaultDemo {

	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(10, "ABC1");
		mp.put(11, "ABC2");
		mp.put(12, "ABC3");
		mp.put(13, "ABC4");
		System.out.println(mp);
		
		System.out.println("mp.get(10) " + mp.get(10));
		System.out.println("mp.get(8) " + mp.get(8));
		System.out.println("mp.get(8) " + mp.getOrDefault(8, "some default"));
		
		mp.putIfAbsent(10, "ASDFASDF");
		System.out.println(mp);
		
		
	}
}
