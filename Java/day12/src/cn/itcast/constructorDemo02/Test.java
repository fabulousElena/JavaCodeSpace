package cn.itcast.constructorDemo02;

public class Test {
	public static void main(String[] args) {
		//����Person��Ķ��󡣾����ٵ������Ĺ��췽��
		Person p = new Person("����",20);
		Person p1 = new Person();
		System.out.println(p.getName() + p.getAge());
		System.out.println(p1.getName() + p1.getAge());
		p1.setAge(18);
		p1.setName("����");
		System.out.println(p1.getName() + p1.getAge());
	}

}
