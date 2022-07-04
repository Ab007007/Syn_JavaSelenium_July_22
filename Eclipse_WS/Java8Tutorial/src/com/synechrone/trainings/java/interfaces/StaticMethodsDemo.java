package com.synechrone.trainings.java.interfaces;

interface A {
	public static void test() {
		System.out.println("From interface");
	}
	
	void test2();
}

class AImplementation implements A
{
	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
}
public class StaticMethodsDemo {

	
	public static void main(String[] args) {
		AImplementation ai =  new AImplementation();
		ai.test2();
		A.test();
	
	}
}
