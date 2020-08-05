package cn.itcast.abstract01;
/*
 * 测试抽象类。
 *   创建他的子类的对象，使用子类的对象调用方法
 */
public class Test {
	public static void main(String[] args) {
		JavaEE j  = new JavaEE();
		j.work();
		
		Andorid a = new Andorid();
		a.work();
	}

}
