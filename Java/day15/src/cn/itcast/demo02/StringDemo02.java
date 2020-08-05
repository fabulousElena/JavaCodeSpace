package cn.itcast.demo02;

public class StringDemo02 {

	public static void main(String[] args) {
		//字符串定义方法 两个   直接赋值=   使用String类的构造方法
		String str1 = new String ("ad");
		String str2 = "ad";
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}
}
