package cn.itcast.DateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;


/*
 * DateFormat类方法 parse 
 * 将字符串解析为日期对象
 * Date parse（String s ）字符串变成日期对象
 * 用户的输入 2050-2-35 == s 
 * String =>Date
 * Date=> String format
 */
public class SimpleDateFormatDemo02 {

	public static void main(String[] args) throws Exception {
		function();
	}
	
	/*
	 * 将字符串转成Date对象
	 * DateFormat类方法parse
	 * 步骤：
	 *    1.创建SimpleDateFormat对象
	 *    构造方法中，指定日期格式，
	 *    2.子类对象调用方法Parse方法，传递String  返回Date
	 *    
	 *    注意：时间和日期的模式yyyy-MM-dd  必须和字符串中的时间日期匹配，不匹配就报错
	 *    
	 *    但是，日期是用户键盘输入的，所以日期不让输入  让选择
	 */
	public static void function() throws Exception{
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = s.parse("1995-02-03 15:6:22");
		System.out.println(date);
	}
}
