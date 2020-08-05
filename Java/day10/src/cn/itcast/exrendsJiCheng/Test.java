package cn.itcast.exrendsJiCheng;

public class Test {
	public static void main(String[] args) {
		//创建研发员工类的对象
		Develop d = new Develop ();
		//使用子类的对象，d能否调用父类中的成员呢
		d.name = "Mac";
		d.print();
		d.work();
		
		
		//创建维护员工类的对象
		WeiHu w = new WeiHu();
		w.name  = "mac1";
		w.print();
		w.work();
		
	}

}
