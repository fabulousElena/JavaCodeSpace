package cn.itcast.demo02;
/*
 * String 类的特点：
 *    一切都是对象，字符串事物 “ ”也是对象
 *    类是用来描述事物，String类就是用来描述事物的类
 *    所有的 “” 都是String的对象
 *    
 *    字符串是一个常量，一旦创建不能改变
 */
public class StringDemo {
	public static void main(String[] args) {
		String str = "dadwad";
		//将str的指向改变  并不是改变字符串
		System.out.println(str);
		str = "232w2323";
		
		
	}

}
