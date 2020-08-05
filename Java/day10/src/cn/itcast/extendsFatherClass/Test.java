package cn.itcast.extendsFatherClass;
/*
 * 继承后，子类父类中，成员变量的特点
 * Zi extends Fu
 * 
 * 子类的对象调用成员变量
 *   子类自己有，就使用自己的
 *   子类没有，调用父类的
 *   
 * 在子类中，调用父类的成员。关键字super  调用父类的成员
 * 子类（派生类）继承父类（java叫超类super ，基类）
 * 
 * this.是调用自己本类成员
 * super.是调用父类成员
 */

public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		System.out.println(z.i);
		z.show();
	}

}
