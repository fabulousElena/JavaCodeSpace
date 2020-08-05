package cn.itcast.instanceOf01;
/*
 * 运算符 比较运算符  ，结果是true和false
 * 关键字：instanceof 比较引用数据类型 
 * 
 * 关键字  instanceof  作比较。一个引用类型的变量，是不是这个类型的对象
 * p这个 变量，是Student类型对象  还是Teacher类型对象
 * 
 *   引用变量  instanceof 类名  
 *   p instanceof Student  比较 p是不是Student类型的对象。如果是 instanceof就返回true
 *   
 * 只能对有继承类 或者实现类 使用  
 */
public class Test {
	public static void main(String[] args) {
		Person p = new Student();
		//Person p = new Teacher();
		
		boolean b = p instanceof Student;
		System.out.println(b);
		p.sleep();
		Student s = (Student)p;
		s.study();
		
	}

}
