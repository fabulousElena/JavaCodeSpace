package cn.itcast.constructorDemo01;
/*
 * �Զ����Person�࣬��Ա����   name  age
 * Ҫ����new Person��ͬʱ����ָ����name  age��ֵ
 * ��ʵ�ִ˹��ܣ���Ҫ���÷���ȥʵ�֡����췽��   ������  constructor 
 * ���ã���new ��ͬʱ���Գ�Ա������ֵ   ����������Գ�ʼ����ֵ��new Person��ͬʱ�Ͷ�����name  age��ֵ
 * 
 * ���췽�������ʽ��
 *   ���η���Ȩ�ޣ�  ������   �������б�  {
 *   
 *   }  ���������ֱ�������������ȫһ��  ��СдҲһ�� 
 *      ���췽��������д����ֵ���ͣ�voidҲ����д  
 *      
 * ���췽����ʲôʱ�������� ��
 *   ��new��ʱ���Զ�ִ����   
 *   ֻ����һ�� �����˶��� 
 *   
 * ÿ���඼ӵ�й��췽��   �����췽����дҲ�С�
 * �����ʱ�򣬱��������Զ���������Ƿ��й��췽��
 * ����о�û�¡�û�еĻ������������Զ����һ�����췽��
 *   �������Զ���ӵĹ��췽��  public Person(){}
 * ����Լ���д�˹��췽���������ʱ��Ͳ�����ӹ��췽����
 */
public class Person {
	private String name;
	private int age;
	
	//�����Person��Ĺ��췽��
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("����һ���ղ����Ĺ��췽��");
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
