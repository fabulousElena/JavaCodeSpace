package cn.itcast.interfaceDemo01;
/*
 * �����࣬ʵ�ֽӿڣ���д�ӿ��еĳ��󷽷�
 * ����ʵ����Ķ���
 * 
 * ��ʵ�ֽӿڣ��������Ϊ�̳�
 * 
 * �ؼ���  implements  
 * class �� implements �ӿ�{
 *        ��д�ӿ��еĳ��󷽷�
 * }
 *              ��                                    ʵ��                          �ӿ�
 * class MyInterfaceImpl implements MyInterface
 */
public class MyInterfaceImpl implements MyInterface{
	public void function() {
		System.out.println("ʵ���࣬��д�ӿڳ��󷽷�");
	}

}
