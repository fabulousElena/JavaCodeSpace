package cn.itcast.caseDemo01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ���Ƶ�Ա�� ��ʦ ����Ա ���� �ֱ�洢������������
 * ����һ��������ͬʱ������������ ���ڱ�����ͬʱ  �����Ե��ù�������
 */
public class GenericTest {
	public static void main(String[] args) {
		//����3�����϶���洢
		ArrayList<Cooker> cooker = new ArrayList<Cooker>();
		ArrayList<Manager> manager = new ArrayList<Manager>();
		ArrayList<Waiter> waiter = new ArrayList<Waiter>();
		cooker.add(new Cooker("zhangsan","001"));
		cooker.add(new Cooker("zhangsan1","002"));
		waiter.add(new Waiter("zhangsi","001"));
		waiter.add(new Waiter("zhangsi1","002"));
		manager.add(new Manager("xiaoming","001",3000));
		manager.add(new Manager("xiaoming1","002",2000));
		iterator(waiter);
		iterator(manager);
		iterator(cooker);
		
	}
	/*
	 * ���巽��ͬʱ������������ ���ڱ�����ͬʱ  �����Ե��ù�������
	 * ��?ͨ��� ������it.next() ����ȡ��������Object���� ��ô����work������
	 * ��ǿ��ת��  it.next() = Object o ==> Employee
	 * �����Ĳ���  ���ɲ��ɿ���  ����Employee���� ��Ҳ���Դ���Employee�������
	 * ���͵��޶�   ��������Employee�ǹ̶���  �������� �����޵� 
	 * ? extends Employee ���Ƶ��Ǹ��࣬�����޶������Դ���Employee �����������������
	 * ? super   Employee ���Ƶ������࣬�����޶������Դ���Employee ���������ĸ������
	 */
	public static void iterator(ArrayList<? extends Employee> array) {
		Iterator<? extends Employee> it = array.iterator();
		while(it.hasNext()) {
			//��ȡ����next���� ����������ʲô  ��Employee
			Employee e = it.next();
			System.out.println(e);
		}
	}

}
