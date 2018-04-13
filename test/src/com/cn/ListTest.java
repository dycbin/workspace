package com.cn;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args){
		List<String> l=new ArrayList<String>();
		l.add("abc1");
		l.add("abc2");
		l.add("abc3");
		l.add("abc4");
		l.add("abc5");
		l.add("abc6");
		l.add(1,"qwe");
		System.out.println("原始：");
		for(int i=0;i<l.size();i++){
			System.out.print(l.get(i));
		}
		l.remove(1);
		System.out.println();
		System.out.println("新的：");
		for(int i=0;i<l.size();i++){
			System.out.print(l.get(i));
		}
//		while (it.hasNext()){
//			System.out.println(it.next());
//		}
			
	}

}
