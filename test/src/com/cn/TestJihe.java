package com.cn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestJihe {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String> ();
		list.add("11");
		list.add("22");
		list.add("33");
		list.add("44");
		list.add("55");
		list.add("66");
		list.add("77");
		//1�����������
//		Iterator<String> iterator=list.iterator();
//		while (iterator.hasNext()) {
//			String string = (String) iterator.next();
//			System.out.print(string+",");
//		}
		//2��forѭ�����
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i)+",");
//		}
		//3��foreach���
//		for (String tem:list){
//			System.out.println(tem+",");
//		}

	}

}
