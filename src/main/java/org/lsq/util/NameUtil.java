package org.lsq.util;
import java.util.Random;

public class NameUtil {
	/**
	 * 自动生成账号(六位数字)
	 * */
	String name="";
	Random r = new Random();
	public String generateName(){
		int x = r.nextInt(999999);
		if(x>100000){
			name=Integer.toString(x);
			return name;
		}
		return generateName();
	}
	public static void main(String[] args) {
		NameUtil n = new NameUtil();
		for (int i = 0; i < 100; i++) {
			System.out.println(n.generateName());
		}
	}
}
