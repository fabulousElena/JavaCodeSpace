package cn.itcast.DuoTai01;

public class Test {
	public static void main(String[] args) {
		//��̬�ĵ��÷�����������������д��
		
		//Java���У�ʹ�ö���Ķ�̬�ԣ����ó����еķ���
		//��ʽ���������ͻ����ǽӿ�����   ����  = new ����Ķ��󣨣���
		Zi z = new Zi();
		Fu f = new Zi();
		f.show();
		
		//������Animal������ ��cat
		Cat c = new Cat();
		Animal a = new Cat();
		a.eat();
		c.eat();
		
		
		//�ӿ�Smoking��ʵ��Student
		Smoking sk = new Student();
		sk.smoking();
	}

}
