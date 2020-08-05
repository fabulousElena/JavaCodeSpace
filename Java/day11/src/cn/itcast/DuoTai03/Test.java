package cn.itcast.DuoTai03;
/*
 * 测试类。
 *   1.实现动物和cat dog多态调用
 *   2.做类型的强制转换，调用子类的特有功能
 */
public class Test {
	public static void main(String[] args) {
		//两个子类，使用两次多态调用
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		//a1和a2可以调用子类，父类共有方法  运行的时候是走子类的重写
		a1.eat();
		a2.eat();
		
		//做类型的强制转换，调用子类的特有
		//防止发生异常，必须做到a1属于Cat对象，转成Cat类
		//a2属于 Dog对象，转成Dog类
		//instanceof判断
		if(a1 instanceof Cat) {
			Cat c = (Cat)a1;
			c.catchMouse();
		}if(a2 instanceof Dog) {
			Dog d = (Dog)a2;
			d.lookHome();
		}
			
	}

}
