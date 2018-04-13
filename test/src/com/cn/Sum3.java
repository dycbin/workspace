package com.cn;

public class Sum3 {

	public static void main(String[] args) {

		System.out.println(renyi(1, 100,3));
	}

	public static int renyi(int x, int y,int z) {
		int sum = 0;
		for (int i = x; i <=y; i++) {
			if (i % z == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
