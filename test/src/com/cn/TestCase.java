package com.cn;

public class TestCase {
	public static void main(String args[]) {
		Test a = new Test(); // Animal ����
		Test b = new Dog(); // Dog ����

		// a.move();// ִ�� Animal ��ķ���
		b.move();// ִ�� Dog ��ķ���
	}
}

class Test {
	public void move() {
		System.out.println("��������ƶ�");
	}
}

class Dog extends Test {
	public void move() {
		System.out.println("�������ܺ���");
	}

	public void bark() {
		System.out.println("�����Էͽ�");
	}
}
