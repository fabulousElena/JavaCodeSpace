package cn.itcast.caseDemo01;

public class NewPhone extends Phone implements PlayGames{
	//������
	public static void main(String[] args) {
		new NewPhone () {
			public void play() {
				System.out.println("���ڴ���Ϸ");
			}
			
		}.play();
	}
	
	
	public void call() {
		System.out.println("��绰");
	}
	public void sendMessage() {
		System.out.println("������");
	}
	public void play() {
		
	}
}
