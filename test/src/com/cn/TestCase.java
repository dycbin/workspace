package com.cn;

public class TestCase {
	public static void main(String args[]) {
		Test a = new Test(); // Animal 对象
		Test b = new Dog(); // Dog 对象

		// a.move();// 执行 Animal 类的方法
		b.move();// 执行 Dog 类的方法
	}
}

class Test {
	public void move() {
		System.out.println("动物可以移动");
	}
}

class Dog extends Test {
	public void move() {
		System.out.println("狗可以跑和走");
	}

	public void bark() {
		System.out.println("狗可以吠叫");
	}
}
