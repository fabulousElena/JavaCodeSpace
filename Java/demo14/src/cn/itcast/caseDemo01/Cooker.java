package cn.itcast.caseDemo01;

public class Cooker extends Employee implements Vip{
	
	public Cooker() {
		super();
	}
	public Cooker(String name , String ID) {
		super(name , ID);
		
	}
	
	public void Server() {
		System.out.println("��ʦ�ڷ���");
	}
	public void vip() {
		System.out.println("�������˼���");
	}

}
