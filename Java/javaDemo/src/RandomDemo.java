/*java中已有的引用类型 Random类，作用 产生随机数
 * 步骤：1、导入包 ：java.util文件夹中
 * 2。创建出Random类型的变量
 * 3.变量 调用Random类中的功能 产生随机数
 * Random类，提供功能， 名字  nextInt（） 产生一个随机数 结果是int类型
 * 出现随机数的范围，在功能nextInt（写一个整数），整数就是随机数的最大范围 
 * 范围： 0-指定的整数之间的随机数（不包含指定的数字）nextInt(100);
 * 产生浮点的随机数： nextDouble（）范围 0.0--1.0
 */
import java.util.Random;
public class RandomDemo {

	public static void main(String[] args) {
		//创建出Random类型的变量
		Random ran = new Random();
		//调用Random类中的功能 产生随机数
		//Random类中 产生随机数的功能
		int i = ran.nextInt(50);
		System.out.println(i);
		System.out.println(i+2);
		
		double j = ran.nextDouble();
		System.out.println(j);
		
	}

}
