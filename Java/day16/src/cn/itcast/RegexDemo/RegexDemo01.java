package cn.itcast.RegexDemo;

public class RegexDemo01 {
	public static void main(String[] args) {
		checkEmail_1();
	}
	/*
	 * ����ʼ���ַ�Ƿ�Ϸ�
	 * ����15315313@qq.com
	 *     DADWADawda12@qq.com
	 *     @:ǰ  ������ĸ_ ������������һ��
	 *     @:��  ������ĸ       ������������һ��
	 *     .:��  ��ĸ 
	 *     "[a-zA-Z0-9_]+@[a-z0-9]+(\\.[a-z]+)+"
	 */
	public static void checkEmail_1() {
		String str = "263648542adwa@qq.com";
		boolean b = str.matches("[a-zA-Z0-9_]+@[a-z0-9]+(\\.[a-z]+)+");
		System.out.println(b);
	}

}
