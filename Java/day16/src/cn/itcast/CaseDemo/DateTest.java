package cn.itcast.CaseDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) throws Exception {
		function2();
	}
	/*
	 * 
	 * 闰年计算
	 * 高级的算法
	 */
	public static void function2() throws ParseException {
		System.out.println("请输入年份");
		int r = new Scanner(System.in).nextInt();
		Calendar c = Calendar.getInstance();
		c.set(r, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		if(c.get(Calendar.DAY_OF_MONTH) == 29) {
			System.out.println("是闰年");
		}else {
			System.out.println("不是闰年");
		}
		
		
		
	}
	
	
	/*
	 * 计算一共活了多少天
	 * 需要数据  ： 生日   今天的日期
	 * 得到两个日期   换算成毫秒  进行加减  然后再转换成日期  输出
	 * 
	 */
	public static void function() throws Exception {
		//Date date = new Date();
		//获取出生日期
		System.out.println("请输入您的出生日期  格式  yyyy-MM-dd");
		String birthdayString = new Scanner(System.in).next();
		//将字符串日期转成Date对象
		//创建SimpleDateFormat对象，写日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthdayDate  = sdf.parse(birthdayString);
		
		//获取今天的日期
		Date todayDate = new Date();
		
		//把两个日期转成毫秒值Date类的方法  getTime（）
		long birthday = birthdayDate.getTime();
		long today = todayDate.getTime();
		long i = today - birthday;
		
		
		if(i<0) {
			System.out.println("请输入正确的出生年月");
			
		}else {
		
		System.out.println(i/1000/60/60/24);
		
		}
		
		
		
	}
	

}
