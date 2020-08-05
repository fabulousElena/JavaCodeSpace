package cn.itcast.Case3;

public class Test {
	public static void main(String[] args) {
		oldPhone o = new oldPhone();
		o.call();
		o.sendMessage();
		
		newPhone n = new newPhone();
		n.playGame();
		n.call();
		n.sendMessage();
	}

}
