package com.synechrone.trainings.java.innerclass;

public class LocalInnerClassDemo {

	public static void main(String[] args) {
		
		class LocalImplementation implements ListPrintable
		{
			@Override
			public void printInfo() {
				System.out.println("Only from main i'm available");
				
			}
		}
		
		LocalImplementation li = new LocalImplementation();
		li.printInfo();
		
		
	}
	
	
}
