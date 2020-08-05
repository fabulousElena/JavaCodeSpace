package cn.itcast.extendsFatherClass02;
/*
 * 
 * 继承后，子类父类中成员方法的特点
 * 
 *   子类的对象，调用方法的时候，
 *     子类自己有，使用子类
 *     子类自己没有，调用父类
 *     
 *   重载：方法名一样，参数列表不同，是同一个类的事情  
 *   何为方法的重写   Override
 *     当子类中，出现了和父类一模一样（方法名  修饰符  参数列表）的方法的时候，就称之为子类重写父类的方法
 */
public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
		//z.show2();
		
	}

}
