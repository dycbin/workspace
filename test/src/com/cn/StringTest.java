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
		// ���ա������и��ַ����γ��µ�����
		String[] strarr = s.split(",");
		System.out.print("[");
		for (int q = 0; q < strarr.length; q++) {
			if (q != strarr.length - 1) {
				System.out.print(strarr[q] + ",");
			}
			System.out.print(strarr[q] + "");

		}
		System.out.println("]");
		// ����ָ���ַ���һ�γ��ֵ�����λ��
		int diyi = s.indexOf("f");
		System.out.println(diyi);
		// ������λ�ÿ�ʼ����ָ���ַ���һ�γ��ֵ�����λ��
		int yy = s.indexOf("c", 7);
		System.out.println(yy);
		// �ж�ָ���ַ����Ƿ�Ϊ��
		boolean emty = s.isEmpty();
		System.out.println(emty);
		// ����ָ���ַ��ڴ��ַ��������һ�γ��ִ�������
		int last = s.lastIndexOf("l");
		System.out.println(last);
		// �����ַ�������Ӵ����滻���Ӵ� ����µ��ַ���
		// String str=s.replace("ef", "wwwwwwww");
		// System.out.println(str);
		char[] char1 = s.toCharArray();
		for (int ii = 0; ii < char1.length; ii++) {
			System.out.println(char1[ii]);
		}
	}

}
