package cn.itcast.classDemo03;
/*
 * �·�����
 */
import java.util.Scanner;
public class Person {
	
	public static void main(String[] args) {
		Person p = new Person();
		Scanner s = new Scanner(System.in);
		Person.lifeState = s.nextInt();
		p.eat();
		
	}
	
	public static int lifeState = 1;
	
	public void eat() {
		class getChopsticks{
			public void getFood() {
				System.out.println("�����ÿ��Ӽв�");
			}
		}
		
		if(lifeState == 1) {
			System.out.println("�˻�����");
			new getChopsticks().getFood();
			}else {
				System.out.println("���Ѿ��������Բ��˷���");
			}
	}
	

}
