package cn.itcast.CalendarDemo;

import java.util.Calendar;

/*
 * 日历类  Java.util.Calendar
 * 抽象类 使用她的子类对象
 * 
 * Calendar类写了静态方法getInstance（） 直接返回了子类的对象
 * 不需要直接new子类的对象，通过静态方法直接获取
 * 
 * 
 */
public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
	}

}
