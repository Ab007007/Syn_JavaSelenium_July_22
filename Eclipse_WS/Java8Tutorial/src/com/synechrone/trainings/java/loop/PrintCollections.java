package com.synechrone.trainings.java.loop;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintCollections {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();  //Ctrl  + Shift + O
		al.add("Hello");
		al.add(123);
		al.add(1.5);
		al.add(true);
		
		// for loop
		System.out.println("Printing Collections using basic for loop ");
		for (int i = 0; i < al.size() ; i++)
		{
			System.out.println("element at index : " + i + " is " + al.get(i));
		}
		
		// enhanced for loop
		System.out.println("Printing using enhanced for loop ");
		for (Object element : al) {
			System.out.println("Element : " + element);
		}
		// iterator
		System.out.println("Printing using iterator");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			
	}

}
