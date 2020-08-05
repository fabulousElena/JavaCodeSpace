package cn.itcast.DateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 对日期进行格式化（自定义）
 *   对日期格式化的类  java.text.DateFormat 抽象类  普通方法  也有抽象方法 
 *   实际上是使用子类java.text.SimpleDateFormat 可以使用父类普通
 *   方法  重写了抽象方法
 *   
 *   
 */
public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		fonction();
	}
	/*
	 * 如何对日期格式化
	 * 步骤：
	 *   1：创建SimpleDateFormat对象
	 *     在类的构造方法中，写入字符串的日期合适（自己定义）
	 *   2.用SimpleDateFormat类调用方法format对日期进行格式化
	 *     返回值是String format （Date date）传递日期对象，返回字符串
	 *    日期模式
	 *        yyyy 年份
	 *        MM   月份
	 *        dd   天数(月中的)
	 *        HH   0-23小时
	 *        mm   分钟
	 *        ss   秒
	 *        
	 *        yyyy年MM月dd日 HH点mm分钟ss秒 汉字可以随意修改，但是里面的字符不能修改MM  dd
	 *       
	 *   
	 */
	public static void fonction() {    
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分钟ss秒");
		String date = sdf.format(new Date());
		System.out.println(date);
		
	}
}
