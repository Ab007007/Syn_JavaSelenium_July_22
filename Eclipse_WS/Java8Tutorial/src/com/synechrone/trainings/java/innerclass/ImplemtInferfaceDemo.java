package com.synechrone.trainings.java.innerclass;

class PrintList implements ListPrintable
{
	@Override
	public void printInfo() {
		System.out.println("I'm from interface");
		
	}
}
public class ImplemtInferfaceDemo 
{
	public static void main(String[] args) {
		PrintList pl = new PrintList();
		pl.printInfo();
		
	}

}
