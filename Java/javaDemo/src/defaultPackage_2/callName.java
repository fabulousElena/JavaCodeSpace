package defaultPackage_2;
/*
 * 随机点名器，用集合改进
 *   现实中有学生这个事物，使用定义类的形式，描述学生事物
 *     学生属性：姓名，年龄
 * 
 *   存储学生：
 *     学生类型，存储到集合中
 *   总览：遍历集合
 *   随机：生成随机数，作为索引，到集合中找到元素
 */
import java.util.ArrayList;
import java.util.Random;
public class callName {
	public static void main(String[] args) {
		//定义集合 ，存储的是studentName类型变量
		ArrayList<studentName> array = new ArrayList<studentName>();
		//添加学生信息
		add(array);
		//遍历集合
		printArrayList(array);
		randomCall(array);
		
	} 
	
	//随机数 当做集合的索引 到集合中找打元素
	public static void randomCall(ArrayList<studentName> array) {
		Random ran = new Random();
		int i = ran.nextInt(array.size());
		studentName s = array.get(i);
		System.out.println(s.name);
	}
	//总览学生的信息  遍历集合
	
	public static void printArrayList(ArrayList<studentName> array) {
		for(int i = 0; i < array.size(); i++) {
			//存储集合的时候，集合 add（sn1）
			//获取的时候，集合get方法  取出来的是studentName类型的变量
			studentName s = array.get(i);
			System.out.println(s.name +"  "+s.age );
		}
		
	}
	
	//定义方法，实现存储学生的姓名和年龄
	//创建studentName类型变量，存储到集合中
	public static void add(ArrayList<studentName> array) {
		//创建studentName类型变量
		studentName sn1 = new studentName();
		studentName sn2 = new studentName();
		studentName sn3 = new studentName();
		studentName sn4 = new studentName();
		studentName sn5 = new studentName();
		
		sn1.name = "张三";
		sn1.age = 101;
		
		sn2.name = "李四";
		sn2.age = 102;
		
		sn3.name = "王二";
		sn3.age = 103;
		
		sn4.name = "小明";
		sn4.age = 104;
		
		sn5.name = "小红";
		sn5.age = 105;
		//将studentName变量存储到集合中。
		array.add(sn1);
		array.add(sn2);
		array.add(sn3);
		array.add(sn4);
		array.add(sn5);
		
	}
	
}
