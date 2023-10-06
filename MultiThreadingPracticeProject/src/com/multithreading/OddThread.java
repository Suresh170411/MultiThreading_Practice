package com.multithreading;

public class OddThread extends Thread {

	EvenThread even;
	
	public OddThread(EvenThread even) {
		this.even = even;
	}
	
	@Override
	public void run() {
		try {
			even.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i=1; i<=20; i++) {
			if (i%2 == 1) {
				System.out.println("Odd Thread : " + i);
			}
		}
	}

}
