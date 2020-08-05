package cn.itcast.caseDemo01;

public class NewPhone extends Phone implements PlayGames{
	//主方法
	public static void main(String[] args) {
		new NewPhone () {
			public void play() {
				System.out.println("正在打游戏");
			}
			
		}.play();
	}
	
	
	public void call() {
		System.out.println("打电话");
	}
	public void sendMessage() {
		System.out.println("发短信");
	}
	public void play() {
		
	}
}
