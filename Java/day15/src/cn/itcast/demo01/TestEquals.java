package cn.itcast.demo01;

import java.util.ArrayList;

public class TestEquals {
	public static void main(String[] args) {
		//Person���̳�object�࣬�̳������˸��෽��equals
		Person p1 = new Person("����",25);
		Person p2 = new Person("lisi",25);
		
		//Person����p1 ���ø���ķ���equals���ж���ıȽ�
		boolean b = p1.equals(p2);
		System.out.println(b);
		
		ArrayList<String> arr = new ArrayList<>();
		boolean c = p1.equals(null);
		System.out.println(c);
	}

}
