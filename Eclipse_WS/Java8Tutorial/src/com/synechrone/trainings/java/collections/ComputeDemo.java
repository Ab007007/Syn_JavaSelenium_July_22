package com.synechrone.trainings.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ComputeDemo {

	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(10, "ABC1");
		mp.put(11, "ABC2");
		mp.put(12, "ABC3");
		mp.put(13, "ABC4");
		System.out.println(mp);
		
		BiFunction<Integer, String, String> bfun= new BiFunction<Integer, String, String>() {
		@Override
		public String apply(Integer t, String u) {
			// TODO Auto-generated method stub
			return u.concat("  ########  ");
		}
		};
		
		mp.computeIfPresent(10,bfun);
		System.out.println(mp);
		
		mp.compute(11, (k,v) -> v.concat(" Lambda update"));
		System.out.println(mp);
	}
}
