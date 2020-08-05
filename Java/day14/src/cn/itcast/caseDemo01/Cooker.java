package cn.itcast.caseDemo01;

public class Cooker extends Employee implements VIP{
	public void vip() {
		System.out.println("厨师在加菜！");
	}
	public void cook() {
		System.out.println("厨师在做菜");
	}

}
