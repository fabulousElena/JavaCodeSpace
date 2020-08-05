package cn.itcast.abstract01;
/*
 * 定义开发工程师类
 *   EE开发工程师 
 *   Android开发工程师     共性  ：开发
 *   
 *   根据共性进行抽取，然后形成一个父类Develop
 *   定义方法，工作：怎么工作？具体干什么？
 *   
 *   抽象类，不能实例化对象，是不能new的。
 *   不能创建对象的原因是，如果真的让你new了。那么对象  .  调用抽象方法，
 * 抽象方法没有主题，根本没办法运行。
 *   抽象类的使用方式，需要定义类继承抽象类。将抽象方法进行重写，创建子类的对象
 */
public abstract class Develop {
	//定义方法  工作方法，但是怎么工作说不清楚讲不明白  
	//说不清楚就不说,没有主体的方法，必须使用关键字 abstract修饰
	//抽象的方法，必须存在于抽象的类中，类也需要用abstract修饰
	public abstract void work();

}
