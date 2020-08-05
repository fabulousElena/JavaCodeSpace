package cn.itcast.DuoTai01;

public class Test {
	public static void main(String[] args) {
		//多态的调用方法必须调用子类的重写！
		
		//Java当中，使用对象的多态性，调用程序中的方法
		//公式：父类类型或者是接口类型   变量  = new 子类的对象（）；
		Zi z = new Zi();
		Fu f = new Zi();
		f.show();
		
		//抽象类Animal，子类 是cat
		Cat c = new Cat();
		Animal a = new Cat();
		a.eat();
		c.eat();
		
		
		//接口Smoking，实现Student
		Smoking sk = new Student();
		sk.smoking();
	}

}
