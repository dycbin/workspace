package com.cn.biaozhun;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class TestArray {

	public static void main(String[] args) {
		int score[]=new int []{1000,11,22,55,100,33,88,77,66,99};
		String str=Arrays.toString(score);
		System.out.println(str);
		Date tt=new Date();
		SimpleDateFormat yy=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(yy.format(tt));
		//求最值
//		int max=score[0];
//		for(int i=1;i<score.length;i++){
//			if(score[i]>max){
//				max=score[i];
//			}
//		}
//		for(int tt:score){
//		System.out.println(tt);
//		}
		//冒泡排序
//		for (int i=1;i<score.length;i++){
//			for(int j=0;j<score.length;j++){
//				if(score[i]<score[j]){
//					int temp=score[i];
//					score[i]=score[j];
//					score[j]=temp;
//				}
//			}
//		}
//		for(int r=0;r<score.length;r++){
//			System.out.println(score[r]);
//		}
		//工具排序
		Arrays.sort(score);
		for(int rr:score){
			System.out.print(rr+",");
		}
		System.out.println(Byte.SIZE);
		System.out.println(Short.SIZE);
		System.out.println(Integer.SIZE);
		System.out.println(Long.SIZE);
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
		System.out.println(Character.SIZE);
	}
	
}
