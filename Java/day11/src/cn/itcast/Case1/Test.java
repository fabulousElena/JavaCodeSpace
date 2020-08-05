package cn.itcast.Case1;

public class Test {
	public static void main(String[] args) {
		//创建笔记本对象，用笔记本对象去调用笔记本的功能
		Computer com = new Computer();
		com.openComputer();
		
		//调用笔记本使用USb设备的方法
		//参数 ，是USB接口类型，接口不能建立对象
		//调用方法，传递USB接口的实现类对象
		//Mouse m = new Mouse();
		com.useUSB(new Mouse());
		
		com.useUSB(new Keyborad());
		
		com.closeComputer();
	}

}
