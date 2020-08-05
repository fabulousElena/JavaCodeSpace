package cn.itcast.classDemo03;
/*
 * 下饭程序
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
				System.out.println("他在用筷子夹菜");
			}
		}
		
		if(lifeState == 1) {
			System.out.println("人还活着");
			new getChopsticks().getFood();
			}else {
				System.out.println("人已经死亡，吃不了饭了");
			}
	}
	

}
