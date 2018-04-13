package com.cn;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcabcdeabcf");
		// System.out.println(sb);
		// sb.append(24);
		// System.out.println(sb);
		// sb.replace(1, 2, "123");
		// System.out.println(sb);
		// sb.insert(1, "qwe");
		// System.out.println(sb);
		// sb.delete(0, sb.length()-2);
		// System.out.println(sb);
		// int tt = sb.indexOf("bc");
		// System.out.println(tt);
		// int xu=sb.indexOf("c", 6);
		// System.out.println(xu);
//		Date time=new Date();
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日--HH时mm分ss秒");
//		System.out.println(formatter.format(time));
//		Calendar cal = Calendar.getInstance();// 取当前日期。
//		System.out.println(cal);
		GregorianCalendar cal = new GregorianCalendar();
		int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println("这个星期属于第" + weekOfYear+"周");
	}
}
