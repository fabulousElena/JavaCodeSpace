/*
 * 实现随机点名器
 *   1.存储所有学生姓名
 *   2.遍历数据输出学生姓名
 *   3.输出随机数实现随机点名
 *   
 *  将功能独立出来，做成方法，调用方法
 *  
 *  定义三个功能，用到同一个姓名数据
 *  姓名存储到数组中，三个方法使用一个数组中的数据，方法传递参数
 */
import java.util.Random;
public class callNameRandom {

	public static void main(String[] args) {
		String[] names  = new String[6];
		addStudentName(names);
		showName(names);
		//randomCall(names);
		System.out.println(randomCall(names));
		//System.out.println();
		//int i = randomCall(name.length);
		//Random ran = new Random();
		//int i = ran.nextInt(name.length);
		//System.out.print("随机点到名字的同学是：");
		//System.out.println(name[randomCall(name.length)]);
		//name[randomCall(i)]
		
	}
	//添加学生姓名
	public static void addStudentName (String[] names) {
		names[0] = "张三";
		names[1] = "李四";
		names[2] = "王五";
		names[3] = "孙刘";
		names[4] = "老王";
		names[5] = "小红";
	}
	
	//遍历姓名
	public static void showName(String[] names) {
		for (int i = 0; i < names.length ; i++) {
			System.out.print(names[i]+"  ");
		}
	}
	
	//产生随机姓名
	public static String randomCall(String[] names) {
		Random ran = new Random();
		int i = ran.nextInt(names.length);
		return names[i];
	}

}
