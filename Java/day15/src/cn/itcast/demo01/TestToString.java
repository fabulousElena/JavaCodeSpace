package cn.itcast.demo01;

import java.util.Random;
import java.util.Scanner;

public class TestToString {
	public static void main(String[] args) {
		//调用Person类的方法toString()
		//在输出语句中syso 如果 写的是一个对象那么语句执行的是默认调用对象的toString()方法
		//
		Person p = new Person("张三",22);
		String s = p.toString();
		System.out.println(s);
		System.out.println(p);
		
		Random r = new Random();
		System.out.println(r);
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
	}

}
