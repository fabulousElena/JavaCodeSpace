package cn.itcast.demoTest;
/*
 * ����Ա������  
 *   ���������������Ķ���
 */
public class Test {
	public static void main(String[] args) {
		
		JavaEE ee= new JavaEE();
		Network net = new Network();
		
		ee.setName("����");
		ee.setID("�з���001");
		
		net.setName("����");
		net.setID("ά����007");
		
		System.out.println(ee.getName()  +  ee.getID());
		System.out.println(net.getName() + net.getID());
		
		ee.work();
		net.work();
	}

}
