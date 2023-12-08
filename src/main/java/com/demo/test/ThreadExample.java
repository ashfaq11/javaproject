package com.demo.test;

public class ThreadExample {

	public static void main(String[] args) {

		Object lock = new Object();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lock) {
					for (int i = 1; i < 101; i = i + 2) {
						System.out.println("t1 " + i);
						try {
							lock.notify(); // Notify the waiting thread (t2)
							lock.wait(); // Release the lock and wait for the other thread to notify
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lock) {
					for (int i = 2; i < 101; i = i + 2) {
						System.out.println("t2 " + i);
						try {
							lock.notify(); // Notify the waiting thread (t1)
							lock.wait(); // Release the lock and wait for the other thread to notify
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});

		t1.start();
		t2.start();
	}
}

// t1 1 3 5, t2 2 4 6
// 1-100
