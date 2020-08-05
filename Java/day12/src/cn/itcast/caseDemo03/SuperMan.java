package cn.itcast.caseDemo03;

public class SuperMan extends Animal implements Fly{
	public void fly() {
		System.out.println("在飞");
	}
	public void talk() {
		System.out.println("在说话");
	}
	
	public SuperMan() {
		super();
	}

}
