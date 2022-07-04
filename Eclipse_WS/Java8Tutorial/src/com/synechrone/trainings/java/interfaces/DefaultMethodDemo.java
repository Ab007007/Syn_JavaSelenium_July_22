package com.synechrone.trainings.java.interfaces;

interface B {
	default void test() {
		System.out.println("From B, Test method");
	}
}


interface C {
	default void test() {
		System.out.println("From C, Test method");
	}
}

class D implements B,C
{
	public void test() {
		// TODO Auto-generated method stub
		B.super.test();
		C.super.test();
	}
}
public class DefaultMethodDemo implements B {

	public static void main(String[] args) 
	{
		DefaultMethodDemo dm = new DefaultMethodDemo();
		dm.test();
	}
}
