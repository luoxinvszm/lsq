package org.lsq.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期与字符串之间的转换
 * 
 * @author qinhua
 * 
 */
public class DateFormat {

	/*
	 * 将date类型转换成String类型
	 * return String
	 */
	public static String dateToString() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dateString = formatter.format(currentTime);

		 // 	System.out.println(dateString);			测试系统当前时间

		return dateString;
	}
	
	/*public static void main(String[] args) {
		DateFormat d = new DateFormat();
		System.out.println(d.dateToString());
	}*/
}
