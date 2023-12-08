package com.demo.test;

public class DeadLockEx {
	public static void main(String[] args) {
		
		Object ob1 = new Object();
		Object ob2 = new Object();
		
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				synchronized (ob1) {
					System.out.println("holding ob1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("waiting ob2");
	
					synchronized (ob2) {
						System.out.println("holding ob2");

					}
				}
				
			}
		});
		
Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				synchronized (ob2) {
					System.out.println("holding ob2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("waiting ob1");
	
					synchronized (ob1) {
						System.out.println("holding ob1");

					}
				}
				
			}
		});

t1.start();
t2.start();
		
	}
}
