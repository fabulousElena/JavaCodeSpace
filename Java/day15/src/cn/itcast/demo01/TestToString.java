package cn.itcast.demo01;

import java.util.Random;
import java.util.Scanner;

public class TestToString {
	public static void main(String[] args) {
		//����Person��ķ���toString()
		//����������syso ��� д����һ��������ô���ִ�е���Ĭ�ϵ��ö����toString()����
		//
		Person p = new Person("����",22);
		String s = p.toString();
		System.out.println(s);
		System.out.println(p);
		
		Random r = new Random();
		System.out.println(r);
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
	}

}
