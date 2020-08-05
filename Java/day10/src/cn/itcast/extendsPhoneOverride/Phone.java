package cn.itcast.extendsPhoneOverride;
/*
 * 定义手机类 
 *    功能：打电话   发短信  显示来电号码  
 */
public class Phone {
	public void call() {
		System.out.println("正在打电话");
	}
	
	public void sendMessage() {
		System.out.println("手机在发短信");
	}
	public void showNum() {
		System.out.println("显示号码");
	}
	

}
