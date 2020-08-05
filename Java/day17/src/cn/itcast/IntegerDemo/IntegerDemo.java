package cn.itcast.IntegerDemo;
/*
 * Integer类，封装基本数据类型int ，提高大量方法
 * 将字符串转成基本数据类型int
 */
public class IntegerDemo {
	public static void main(String[] args) {
		function3();
	}
	/*
	 * Integer类的构造方法
	 *   Integer（String s ）
	 *   将数字格式的字符串传递到Integer类的构造方法中
	 *   创建Integer对象，包装的是一个字符串
	 *   将构造方法中的 字符串，转成基本数据类型，调用方法，非静态的 intValue（）
	 */
	public static void function3() {
		Integer in = new Integer("100"); 
		int i = in.intValue();
		System.out.println(--i);
	}
	
	/*
	 * 如何将基本类型int  变成字符串  
	 * int => String  任何类型 + “” 就变成了String类型
	 * 使用Integer类中的静态方法toString()
	 */
	public static void function2() {
		int i = 3;
		String s = i+"";
		System.out.println(s+1);
		//把数字转成进制数 toString（String s , int radix)
		System.out.println(Integer.toString(i,2));
	}
	
	/*
	 * Integer类静态方法 parseInt（String s ，int radix）
	 * radix 基数,进制
	 * 110,2  意思是前面的数字是二进制  但是方法parseInt 运行结果是十进制
	 */
	public static void function1() {
		int i = Integer.parseInt("110", 2);
		System.out.println(i);
	}
	
	/**
	 * Integer类中的静态方法parseInt（String s ）返回基本数据类型
	 * 要求：字符串必须是数字格式的
	 */
	public static void function() {
		String s = "21";
		int i = Integer.parseInt(s);
		System.out.println(i+2);
	}

}
