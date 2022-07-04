package com.synechrone.trainings.java.interfaces;

interface B1 {
	default void test1() {
		System.out.println("From B, Test method");
	}
}


interface C1 {
	default void test2() {
		System.out.println("From C, Test method");
	}
}

class D1 implements B1, C1
{
	void test1(int x) {
		System.out.println(x);
	}
}
public class DefaultMethodDemo2 implements B1, C1 {

	public static void main(String[] args) 
	{
		D1 d = new D1();
		d.test1();
		d.test1(100);
		d.test2();
		
		DefaultMethodDemo2 dm = new DefaultMethodDemo2();
		dm.test1();
		dm.test2();
	}
}
