package com.synechrone.trainings.java.innerclass;

public class AnonymousInnerClass 
{
	public static void main(String[] args) 
	{
		ListPrintable lp = new ListPrintable() {
			
			@Override
			public void printInfo()
			{
				System.out.println("anonymousInnerClass output");
				
			}
		};
		
		lp.printInfo();
	}

}
