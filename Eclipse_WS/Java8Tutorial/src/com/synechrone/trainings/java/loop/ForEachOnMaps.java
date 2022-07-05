package com.synechrone.trainings.java.loop;

import java.awt.BufferCapabilities;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ForEachOnMaps {

	
	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer, String>();
		
		mp.put(1,  "Aravind");
		mp.put(2,  "Shankar");
		mp.put(3,  "Sachin");
		mp.put(4,  "Raghu");
		mp.put(5,  "Maruthi");
		
		BiConsumer<Integer, String> biConsumer = new BiConsumer<Integer, String>() {

			@Override
			public void accept(Integer t, String u) {
				System.out.println(t + " : " + u);
				
			}
		};
		mp.forEach(biConsumer);
		
		mp.forEach((k,v) -> System.out.println(k + " $$$$$$$$$$ " + v));
//		mp.forEach(System.out :: println);
	}
}
