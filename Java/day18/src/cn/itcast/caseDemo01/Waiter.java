package cn.itcast.caseDemo01;

public class Waiter extends Employee implements VIP{
	public Waiter(String string, String string2) {
		// TODO 自动生成的构造函数存根
	}
	public void vip() {
		System.out.println("服务员在倒酒！");
	}
	public void server() {
		System.out.println("服务员在服务");
	}


}
