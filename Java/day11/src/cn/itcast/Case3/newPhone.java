package cn.itcast.Case3;

public class newPhone extends Phone implements iPlay{
	public void call() {
		System.out.println("正在打电话");
	}
	
	public void sendMessage() {
		System.out.println("正在发信息");
	}
	
	public void playGame() {
		System.out.println("正在打游戏");
	}
	

}
