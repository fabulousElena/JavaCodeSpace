package cn.itcast.mapDemo2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
 * Map�ӿ�ʵ���� Hashtable
 * �ײ����ݽṹҲ�ǹ�ϣ���ص��HashMap��һ����
 * ��������Hashtable �̰߳�ȫ���ϣ������ٶ���
 *       HashMap   �̲߳���ȫ���ϣ������ٶȿ�
 *       
 *       HashMap ����洢nullֵ��null��
 *       Hashtable������
 *       
 *       Hashtable����Properties��Ȼ����
 */
public class HashtableDemo {
	public static void main(String[] args) {
		Map<String , String> map = new Hashtable<String,String>();
		map.put(null, null);
		System.out.println(map);
	}

}
