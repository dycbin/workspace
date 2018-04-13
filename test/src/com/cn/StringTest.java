package com.cn;

public class StringTest {

	public static void main(String[] args) {

		String s = "ab,clad,ef,gbh,icjk,lmn";
		String ss = s.concat("opqr");
		System.out.println(ss);
		boolean boo = s.contains("gh");
		System.out.println(boo);
		boolean compa = s.contentEquals("abcdefghiklmn");
		System.out.println(compa);
		boolean com = s.equals("abcdefghijklmn");
		System.out.println(com);
		byte[] by = s.getBytes();
		for (int i = 0; i < by.length; i++) {
			System.out.println(by[i]);

		}
		// 按照“，”切割字符串形成新的数组
		String[] strarr = s.split(",");
		System.out.print("[");
		for (int q = 0; q < strarr.length; q++) {
			if (q != strarr.length - 1) {
				System.out.print(strarr[q] + ",");
			}
			System.out.print(strarr[q] + "");

		}
		System.out.println("]");
		// 查找指定字符第一次出现的索引位置
		int diyi = s.indexOf("f");
		System.out.println(diyi);
		// 从摸个位置开始查找指定字符第一次出现的索引位置
		int yy = s.indexOf("c", 7);
		System.out.println(yy);
		// 判断指定字符串是否为空
		boolean emty = s.isEmpty();
		System.out.println(emty);
		// 返回指定字符在此字符串中最后一次出现处的索引
		int last = s.lastIndexOf("l");
		System.out.println(last);
		// 查找字符串里的子串，替换该子串 输出新的字符串
		// String str=s.replace("ef", "wwwwwwww");
		// System.out.println(str);
		char[] char1 = s.toCharArray();
		for (int ii = 0; ii < char1.length; ii++) {
			System.out.println(char1[ii]);
		}
	}

}
