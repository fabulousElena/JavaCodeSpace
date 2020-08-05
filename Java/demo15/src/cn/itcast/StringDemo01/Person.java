package cn.itcast.StringDemo01;

public class Person extends Object{
	public static void main(String[] args) {
		String s = "implements";
		System.out.println(s.length());
		System.out.println(s.substring(s.length() - 2));
		System.out.println(s.substring(2, 6));
		System.out.println(s.startsWith("imp"));
		System.out.println(s.endsWith("ts"));
		System.out.println(s.indexOf("ple"));
	}

}
