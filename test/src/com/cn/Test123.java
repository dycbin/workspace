package com.cn;

public class Test123 {

	public static void main(String[] args) {

		Animal an=new Animal();
		Animal an1=new Animal("����",50);
		System.out.println("===========wucan================");
		System.out.println("����"+an.getName());
		System.out.println("����"+an.getAge());
		System.out.println("===========youcan================");
		System.out.println("����"+an1.getName());
		System.out.println("����"+an1.getAge());
	}
}
 class Animal{
	 
	private  String name;
	private  int age;
	private  String color;
	
	public Animal() {
		this.name ="����";
		this.age =40;
	}

	public Animal(String name,int age) {
		this.name =name;
		this.age =age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}
	
}