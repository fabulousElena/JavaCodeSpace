package cn.itcast.RegexDemo;

public class RegexDemo01 {
	public static void main(String[] args) {
		checkEmail_1();
	}
	/*
	 * 检查邮件地址是否合法
	 * 规则：15315313@qq.com
	 *     DADWADawda12@qq.com
	 *     @:前  数字字母_ 个数不能少于一个
	 *     @:后  数字字母       个数不能少于一个
	 *     .:后  字母 
	 *     "[a-zA-Z0-9_]+@[a-z0-9]+(\\.[a-z]+)+"
	 */
	public static void checkEmail_1() {
		String str = "263648542adwa@qq.com";
		boolean b = str.matches("[a-zA-Z0-9_]+@[a-z0-9]+(\\.[a-z]+)+");
		System.out.println(b);
	}

}
