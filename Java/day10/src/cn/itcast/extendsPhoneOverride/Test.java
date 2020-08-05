package cn.itcast.extendsPhoneOverride;
/*
 * 测试手机类 
 *    创建出手机类的对象，去调用方法
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
