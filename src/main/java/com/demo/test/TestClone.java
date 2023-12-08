package com.demo.test;

public class TestClone {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		A a1 = new A();
		A a3 = (A) a1.clone();
	}

}


class A implements Cloneable{
	
	B b;
	public A() {
		
	}
	public A(B b) {
		this.b = new B();
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		this.b = new B();
		return super.clone();
	}
}


class B{
	
	B(){
		
	}
	
	
}