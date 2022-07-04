package com.synechrone.trainings.java.innerclass;

public class StaticInnerclassDemo 
{

	static class ImplementPrint implements ListPrintable
	{
		@Override
		public void printInfo() {
			System.out.println("i'm implemented in static inner class");
		}
	}
	
	public static void main(String[] args) {
		
		ImplementPrint ip = new ImplementPrint();
		ip.printInfo();
		System.out.println("----------------");
		ImplementPrint ip2 = new ImplementPrint();
		ip2.printInfo();
	}
	
	public static void test() {
		ImplementPrint ip = new ImplementPrint();
		ip.printInfo();
	}
	
}
