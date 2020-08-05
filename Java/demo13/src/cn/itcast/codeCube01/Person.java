package cn.itcast.codeCube01;
/*
 * 代码块
 */
public class Person {
	public static void main(String[] args) {
		{
			int x = 1 ;
			System.out.println(x + "普通代码块");
			
		}
		
		int x  = 3 ; 
		System.out.println(x +"普通代码块");
		
		Person p = new Person("小姐姐",15);
	}
	
	public static final int a;
	public String name;
	public int age;
	
	{
		System.out.println("构造代码块执行了");
		this.name = "2dwada";
		System.out.println(this.name + a);
	}
	
	static {
		System.out.println("静态代码块执行了");
		a = 1000;
	}
	
	public Person() {
		System.out.println("无参构造体开始执行");

}
	public Person(String name,int age) {
		this.name = name ; 
		this.age = age;
		System.out.println("有参构造体开始执行");
		System.out.println(this.name);
		}
	}
