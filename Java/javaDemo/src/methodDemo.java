/*
 *   方法的定义格式  （必须写在类的包含中，不能写在另一个方法里面）
 *      修饰符  返回值类型 方法的名字 （参数列表...）{
 *            方法的功能主体 
 *              循环、判断、变量、比较、运算....
 *            return ; 
 *      }
 *      
 *     修饰符：固定写法  public static 
 *     返回值类型：方法在运算后，结果的数据类型
 *     方法名：自定义名字，满足标识符规范，方法名字手字谜小写，后面的每个单词首字母大写
 *     参数列表：方法的运算过程中，是否有未知的数据，如果有未知的数据，定义在参数列表中。（定义变量）
 *     return：1，方法的返回，将计算的结果返回 。2，结束方法
 *     
 *     //方法定义和使用的注意事项
 *       1。方法不能定义在另一个方法里面
 *       2.方法不能写错名字
 *       3.方法不能写错参数列表
 *       4。方法返回值是void。方法中可以省略return 
 *           return下面不能有代码，因为执行不到
 *       5.方法返回值类型 和return后面的数据类型必须匹配
 *       6.方法不能重复定义
 *       7.调用方法的时候，返回值是void，不能写在输出语句中
 *       
 */
import java.util.Scanner;
public class methodDemo {

	public static void main(String[] args) {
		//调用方法，让方法执行起来
		//在方法main中，调用 getArea方法
		//int area = getArea(5,6);
		//System.out.println("面积是"+ area);
		printRect();
		scannerInt();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		printRect_1(i,j);
		double k = average(10,3,4);
		System.out.println(k);

	}
	/*
	 * 要求：计算一个长方形的面积。
	 * 定义方法解决这个要求。
	 * 分析方法定义过程：
	 *   1,明确方法计算后结果的数据类型  定义格式对应的就是返回值类型  int
	 *   2，方法计算过程中，有没有未知的数据  未知数据  长方形的长和宽  未知数据的数据类型 int
	 *       未知数的变量，定义在方法的小括号内，用逗号分开
	 */
	
	//public static int getArea(int w,int h) {
		//实现方法的功能主体
		//int area = w * h ;
		//return w * h; 
	//}
	
	//定义的方法练习
	public static void printRect() {
		for (int i = 0; i < 3;i++) {
			for (int  j = 0 ; j < 3 ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static int scannerInt() {
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		System.out.println(j);
		return j ;
		
	}
	public static void printRect_1(int m,int n) {
		for (int i = 0; i < m;i++) {
			for (int  j = 0 ; j < n ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
	public static double average(double i,double j,double k) {
		double n = (i + j + k)/3;
		return n;
	}
}

