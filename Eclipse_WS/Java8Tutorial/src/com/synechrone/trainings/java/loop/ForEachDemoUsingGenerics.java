package com.synechrone.trainings.java.loop;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachDemoUsingGenerics {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();  //Ctrl  + Shift + O
		al.add(123);
		al.add(1232);
		al.add(1233);
		al.add(1234);
		al.add(1236);
		ListConsumer3 lc = new ListConsumer3();
		al.forEach(lc);
	}

}

class ListConsumer3 implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("Consuming Integers : "  + t);
	}
	
	
}


