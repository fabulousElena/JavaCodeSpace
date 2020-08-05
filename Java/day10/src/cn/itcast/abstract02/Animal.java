package cn.itcast.abstract02;
/*
 * 抽象类可以没有抽象方法，可以定义带有方法体的方法
 * 为了让子类继承以后，可以直接使用
 */
public abstract class Animal {
	public void sleep() {
		System.out.println("在睡觉");
	}

}
