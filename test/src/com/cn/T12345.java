package com.cn;

public class T12345 {

	public static void main(String[] args) {
		T12345 t12345=new T12345();
		T12345.tell();
		t12345.run();
		t12345.tell();

	}
	public  static void tell(){
		System.out.println("类名调用静态方法");
	}
	public void run(){
		System.out.println("我是普通方法需要对象调用");
	}

}