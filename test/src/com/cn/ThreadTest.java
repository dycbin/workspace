package com.cn;

public class ThreadTest {

	public static void main(String[] args) {
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		t1.start();
		t2.start();
		t3.start();
	}

}

class myThread extends Thread {

	public void run() {
		System.out.println("=============================");
	}
}
