package cn.itcast.constructorDemo03;
/*
 * this�����ڹ��췽��֮����е���
 * this.�ķ�ʽ�����־ֲ������ͳ�Ա����ͬ�����������
 * this�ڹ��췽��֮��ĵ��� �﷨��this����
 */
public class Person {

	private String name;
	private int age;
	public Person() {
		//�������в����Ĺ��췽��
		//������������ 20���ݸ��˱���name  age
		this("����",20);//����д�ڹ��췽���ĵ�һ��
		
	}
	/*
	 * �˹��췽�� ���� String  int
	 * �ڴ��������ͬʱ��Ϊ��Ա������ֵ
	 */
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
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
}
