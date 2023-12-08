package com.example.demo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeNoise();
		Animal dog = new Dog();
		dog.makeNoise();
		((Dog) dog).bark();
		Animal cat = new Cat();
		cat.makeNoise();

		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(4);
		pq.add(3);
		pq.add(0);
		pq.add(2);
		pq.add(-1);

		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());

		PriorityQueue<String> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
		pq1.add("a");
		pq1.add("b");
		pq1.add("a");
		pq1.add("d");
		pq1.add("c");

		System.out.println(pq1);
		System.out.println(pq1.poll());
		System.out.println(pq1.poll());
		System.out.println(pq1.poll());
		System.out.println(pq1.poll());
		System.out.println(pq1.poll());
	}

}

class Animal {

	void makeNoise() {
		System.out.println("Animal noise");

	}
}

class Dog extends Animal {

	void makeNoise() {
		System.out.println("Dog noise");
	}

	void bark() {
		System.out.println("Dog barking");
	}
}

class Cat extends Animal {

	void makeNoise() {
		System.out.println("Cat noise");
	}

	void meow() {
		System.out.println("cat meow");
	}
}