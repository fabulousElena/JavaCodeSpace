package cn.itcast.CalendarDemo;

import java.util.Calendar;
import java.util.Date;


public class CalendarDemo01 {

	public static void main(String[] args) {
		function();
//		function1();
//		function2();
//		function3();
		
	}
	/*
	 * Calendar方法getTime（）
	 * 将日历对象，转成Date日期对象
	 */
	public static void function3() {
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		System.out.println(date);
	}
	
	/*
	 * Calendar类add
	 * 日历的偏移量，可以指定一个日历中的字符，进行整数的偏移
	 * add(int field , int value )
	 */
	public static void function2() {
		Calendar c = Calendar.getInstance();
		//让日历中的天数向后偏移280天
		c.add(Calendar.DAY_OF_MONTH, 280);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"年"+month+"月"+day+"日");
	}
	
	/*
	 * Calendar类Set方法
	 * 设置日历
	 * set（int field。int value）
	 *     field 设置的是哪个日历字段
	 *     value 设置后的具体数值
	 *     
	 * set（int year，int month ，int day）
	 * 传递三个整数的年月日
	 */
	public static void function1() {
		Calendar c = Calendar.getInstance();
		//设置月份   将月份设置到2月
		c.set(Calendar.MONTH, 2);
		
		//直接设置三个参数
		c.set(1970, 0, 0);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"年"+month+"月"+day+"日");
	}
	
	/*
	 * Calendar类的Get方法
	 * 获取日历字段的值
	 * int  get（int）
	 * 参数int  ，获取的那个日历字段
	 * 返回值，就表示日历字段的具体数值
	 */
	public static void function() {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int secend = c.get(Calendar.SECOND);
		String date = year+"年"+month+"月"+day+"日" +  hour + ":"+minute + ":" + secend;
		System.out.println(date);
	}
}
