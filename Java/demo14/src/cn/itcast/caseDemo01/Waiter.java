package cn.itcast.caseDemo01;

public class Waiter extends Employee implements Vip{
	public Waiter() {
		super();
	}
	public Waiter(String name , String ID) {
		super(name , ID);
	}
	
	public void Server() {
		System.out.println("服务员在服务！");
	}
	
	public void vip () {
		System.out.println("正在倒酒！");
	}

}
