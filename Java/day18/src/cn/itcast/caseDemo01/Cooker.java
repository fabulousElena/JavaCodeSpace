package cn.itcast.caseDemo01;

public class Cooker extends Employee implements VIP{
	public Cooker(String string, String string2) {
		// TODO 自动生成的构造函数存根
	}
	public void vip() {
		System.out.println("厨师在加菜！");
	}
	public void cook() {
		System.out.println("厨师在做菜");
	}

}
