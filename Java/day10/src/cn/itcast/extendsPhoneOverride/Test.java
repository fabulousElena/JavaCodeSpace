package cn.itcast.extendsPhoneOverride;
/*
 * �����ֻ��� 
 *    �������ֻ���Ķ���ȥ���÷���
 */
public class Test {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.call();
		p.sendMessage();
		p.showNum();
		
		AndriodPhone a = new AndriodPhone();
		a.showNum();
		a.call();
		a.sendMessage();
	}

}
