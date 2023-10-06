package com.multithreading;

public class Main {

	public static void main(String[] args) {
		
		EvenThread even = new EvenThread();
		OddThread odd = new OddThread(even);
		
		even.start();
		odd.start();
	}
}
