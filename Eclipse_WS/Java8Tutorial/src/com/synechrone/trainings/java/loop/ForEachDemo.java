package com.synechrone.trainings.java.loop;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachDemo {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();  //Ctrl  + Shift + O
		al.add("Hello");
		al.add(123);
		al.add(1.5);
		al.add(true);
		ListConsumer lc = new ListConsumer();
		al.forEach(lc);
		ListConsumer2 lc2 = new ListConsumer2();
		al.forEach(lc2);
	}

}

class ListConsumer implements Consumer
{
	@Override
	public void accept(Object t) {
		System.out.println("Consuming : "  + t);
	}
	
}

class ListConsumer2 implements Consumer
{
	@Override
	public void accept(Object t) {
		System.out.println("Consuming222 : "  + t);
	}
}
