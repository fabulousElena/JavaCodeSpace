package cn.itcast.Case3;

public class newPhone extends Phone implements iPlay{
	public void call() {
		System.out.println("���ڴ�绰");
	}
	
	public void sendMessage() {
		System.out.println("���ڷ���Ϣ");
	}
	
	public void playGame() {
		System.out.println("���ڴ���Ϸ");
	}
	

}
