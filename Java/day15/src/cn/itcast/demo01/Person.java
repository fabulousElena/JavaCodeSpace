package cn.itcast.demo01;

import java.util.ArrayList;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public Person() {}
	
	/*
	 * ��д�����toString����
	 * û�б�Ҫ�õ����߿����ڴ��ַ
	 * ��дҪ�� ���������е����г�Ա������ֵ
	 */
	
	public String toString() {
		return name+ age;
	}
	/*
	 * ���� Javadoc��
	 * @see java.lang.Object#equals(java.lang.Object)
	 * ��д����ķ��������ǲ��ı丸�෽����Դ����,˵�������е�equals�Ƚ���������ĵ�ַ
	 * ��������Ƚ��ڴ��ַ��û������ġ�
	 * �ܲ��ܱȽ���������ĳ�Ա����age
	 * �����������ĳ�Ա������ͬ �ͷ��� true  ��֮false
	 * 
	 * ��д�����equals����  �Լ��������ıȽϷ�ʽ
	 */
	//public boolean equals(Object obj) {
	//return this == obj;	
	//}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		//�Բ���obj���зǿյ��ж�  û�о�ֱ������  return
		if(obj == null) {
			return false;
		}
		
		//��obj�����������͵�����ת�� objת��P2����
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return this.age == p.age;
		}
		return false;
		
		
		
	}
	

}
