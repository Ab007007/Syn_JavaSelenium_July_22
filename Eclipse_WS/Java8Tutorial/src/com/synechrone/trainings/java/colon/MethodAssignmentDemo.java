package com.synechrone.trainings.java.colon;

import com.synechrone.trainings.java.innerclass.ListPrintable;

public class MethodAssignmentDemo {

	static void printMyName() {
		System.out.println("My name is Aravinda");
	}
	
	public static void main(String[] args) {
		/* Un implemented methods can be implemented by using,
		 * 1. Class
		 * 2. static inner class
		 * 3. local inner class
		 * 5. anonymous inner class
		 * 6. lambda exptessions
		 * 7. method assignment
		 */

		ListPrintable lp = MethodAssignmentDemo :: printMyName;
		lp.printInfo();
	}
	
}
