package cn.itcast.caseDemo01;

public class Waiter extends Employee implements Vip{
	public Waiter() {
		super();
	}
	public Waiter(String name , String ID) {
		super(name , ID);
	}
	
	public void Server() {
		System.out.println("����Ա�ڷ���");
	}
	
	public void vip () {
		System.out.println("���ڵ��ƣ�");
	}

}
