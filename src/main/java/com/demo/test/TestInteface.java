package com.demo.test;
import java.util.concurrent.atomic.AtomicInteger;

interface InterfaceA extends InterfaceB{
	public static int staticM() {
		return 0;
	}

	int a();

	static int x = 10;

	public default int defaultM() {
		return 1;
	}

	public static final int a = 0;
}

@FunctionalInterface
interface InterfaceB {
	public static int b() {
		return 0;
	}
	int a();

	//void abstractClassMethod();

	public static final int a = 10;
	
	public default int defaultM() {
		return 2;
	}
}

public class TestInteface extends AbstractClass implements InterfaceA, InterfaceB {
	TestInteface() {
		System.out.println("Class constructor");
	}

	 

	 

	public static void main(String[] args) {
		TestInteface testInteface = new TestInteface();
		testInteface.a();
		System.out.println(testInteface.defaultM());;
		AbstractClass a = new TestInteface();
		a.abstractClassMethod(); 
		
		AtomicInteger n1 = new AtomicInteger(10);
		
		System.out.println(n1.get());
 	}

	@Override
	public void abstractClassMethod() {
		// TODO Auto-generated method stub
		System.out.println("overrideabstractmethod");

	}



	@Override
	public int a() {
		// TODO Auto-generated method stub
		return 0;
	}

}

abstract class AbstractClass implements InterfaceB {
	
	abstract void abstractClassMethod();
	AbstractClass() {
		System.out.println("AbstractClass constructor");
	}
}