package cn.itcast.caseDemo01;

public class Cooker extends Employee implements Vip{
	
	public Cooker() {
		super();
	}
	public Cooker(String name , String ID) {
		super(name , ID);
		
	}
	
	public void Server() {
		System.out.println("厨师在服务");
	}
	public void vip() {
		System.out.println("正在做菜加量");
	}

}
