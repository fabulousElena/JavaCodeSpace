package cn.itcast.codeCube01;
/*
 * �����
 */
public class Person {
	public static void main(String[] args) {
		{
			int x = 1 ;
			System.out.println(x + "��ͨ�����");
			
		}
		
		int x  = 3 ; 
		System.out.println(x +"��ͨ�����");
		
		Person p = new Person("С���",15);
	}
	
	public static final int a;
	public String name;
	public int age;
	
	{
		System.out.println("��������ִ����");
		this.name = "2dwada";
		System.out.println(this.name + a);
	}
	
	static {
		System.out.println("��̬�����ִ����");
		a = 1000;
	}
	
	public Person() {
		System.out.println("�޲ι����忪ʼִ��");

}
	public Person(String name,int age) {
		this.name = name ; 
		this.age = age;
		System.out.println("�вι����忪ʼִ��");
		System.out.println(this.name);
		}
	}
