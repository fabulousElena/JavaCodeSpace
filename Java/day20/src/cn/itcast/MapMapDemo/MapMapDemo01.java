package cn.itcast.MapMapDemo;

import java.util.HashMap;
import java.util.*;

/*
 * Map���ϵ�Ƕ�ף�Map�д洢�Ļ���Map����
 * Ҫ��
 *    
 */
public class MapMapDemo01 {
	public static void main(String[] args) {
		//��������༶����
		HashMap<String,String> javase = new HashMap<String,String>();
		//�����ҵ�༯��
		HashMap<String,String> javaee = new HashMap<String,String>();
		//��༶�����У��洢ѧ����Ϣ
		javase.put("001", "zhangsan");
		javase.put("002", "lisi");
		
		javaee.put("001", "wangwu");
		javaee.put("002", "zhaoliu");
		//�����������������ǰ༶���֣�ֵ�������༶����
		HashMap<String,HashMap<String,String>> z = 
				new HashMap<String,HashMap<String,String>>();
		z.put("������", javase);
		z.put("��ҵ��", javaee);
		
//		keySet(z);
		entrySet(z);
	}
	
	//����
	public static void keySet(HashMap<String,HashMap<String,String>> z) {
		//����z ���ϵķ��� keySet �������洢��Set����
		Set<String> set = z.keySet();
		//����
		Iterator<String> classNameIt = set.iterator();
		while(classNameIt.hasNext()) {
			//��ȡset����Ԫ�أ�Ҳ����z �ļ�
			String classNameKey = classNameIt.next();
			//��ȡz ��ֵ ��ֵ��һ��HashMap����
			HashMap<String,String> classMap = z.get(classNameKey);
			//����classMap���ϵķ�����������ļ��洢��set����
			Set<String> studentNum = classMap.keySet();
			Iterator<String> studentIt = studentNum.iterator();
			while(studentIt.hasNext()) {
				//studentIt.next()��ȡ�������� ѧ��ѧ�� classMap�ļ�
				String numKey = studentIt.next();
				//����classMap�����е�get������ȡֵ
				String nameValue = classMap.get(numKey);
				System.out.println(classNameKey + "..."+ numKey+ "....." + nameValue);
			}
		}
	}
    public static void entrySet(HashMap<String,HashMap<String,String>> z) {
		//����z���Ϸ���entrySet��������z���ϵļ�ֵ�Թ�ϵ���󣬴洢��set����
    	Set<Map.Entry<String, HashMap<String,String>>> classNameSet = z.entrySet();
    	//����������Set����
    	Iterator<Map.Entry<String, HashMap<String,String>>> classNameIt = classNameSet.iterator();
    	while(classNameIt.hasNext()) {
    		//classNameIt.next()������ȡ��������z���ϵļ�ֵ�Թ�ϵ����
    		Map.Entry<String, HashMap<String,String>> classNameEntry = classNameIt.next();
    		//classNameEntry����getKey  getValue
    		String classNameKey = classNameEntry.getKey();
    		//��ȡֵ  ֵ ��һ��Map���� 
    		HashMap<String,String> classMap = classNameEntry.getValue();
    		//�����༶����
    		Set<Map.Entry<String,String>> studentSet = classMap.entrySet();
    		Iterator<Map.Entry<String,String>> studentNumIt = studentSet.iterator();
    		while(studentNumIt.hasNext()) {
    			Map.Entry<String, String> studentEntry = studentNumIt.next();
    			//studentEntry ����getKey  getValue 
    			String studentNumKey = studentEntry.getKey();
    			String studentNameValue = studentEntry.getValue();
    			System.out.println(classNameKey + studentNumKey + studentNameValue);
    		}
    		
    		
    	}
	}

}
