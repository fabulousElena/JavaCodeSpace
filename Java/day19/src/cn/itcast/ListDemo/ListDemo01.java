package cn.itcast.ListDemo;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * �������Ĳ����޸��쳣��java.util.ConcurrentModificationException
 * �����ڱ����Ĺ����У�ʹ���˼��Ϸ����޸��˼��ϵĳ��ȡ����ǲ�����ġ�
 */
public class ListDemo01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("adbc1");
		list.add("adbc13");
		list.add("adbc12");
		list.add("adbc2");
		//�Լ���ʹ�õ��������л�ȡ����ȡ��ͬʱ�жϼ������Ƿ���ڡ�adbc2������
		//����У����һ��Ԫ�ء�ADBC1��
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			//�Ի�ȡ����Ԫ�ؽ����жϣ��Ƿ��С�adbc2��
			if(s.equals("adbc2")) {
				list.add("ADBC1");
			}
			System.out.println(s);
		}
	}

}
