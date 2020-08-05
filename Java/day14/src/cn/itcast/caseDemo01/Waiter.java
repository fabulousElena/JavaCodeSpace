package cn.itcast.caseDemo01;

public class Waiter extends Employee implements VIP{
	public void vip() {
		System.out.println("服务员在倒酒！");
	}
	public void server() {
		System.out.println("服务员在服务");
	}


}
