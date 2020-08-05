package cn.itcast.DateDemo;

import java.util.Date;

/*
 * 时间和日期类
 * java.util.date
 * 
 * 毫秒概念：1000毫秒==1秒
 * 
 * 毫秒的0点  
 *    System.currentTimeMills（）  返回long类型参数
 *    获取当前日期的毫秒值 1572015163180
 *    时间原点：公元1970年1月1日午夜0：0：0  这点毫秒值就是0
 *    
 *  重要：时间和日期的计算 依赖于毫秒值
 * 
 */
public class DateDemo {
	public static void main(String[] args) {
		long s = System.currentTimeMillis();
		System.out.println(s);
		function();
		function1();
		function3();
		function2();
	}
	/*
	 * Date类 setTime（long） 传递毫秒值
	 * 毫秒值转成日期对象
	 */
	public static void function2() {
		Date date = new Date();
		date.setTime(0);
		System.out.println(date);
	}
	
	/*
	 * Date类  getTime() 返回值long
	 * 返回的是毫秒值
	 * 将日期转化成毫秒值
	 */
	public static void function3() {
		Date date = new Date();
		long l = date.getTime();
		System.out.println(l);
	}
	/*
	 * Date类的long参数的构造方法
	 * Date（long）表示毫秒值
	 * 传递毫秒值  将毫秒值转成日期
	 * 
	 */
	public static void function1() {
		Date date = new Date(0);
		System.out.println(date);
	}
	
	/*
	 * date类的空参构造器
	 * 获取到的是当前操作系统的时间和日期
	 */
	public static void function() {
		Date date = new Date();
		System.out.println(date);
	}

}
