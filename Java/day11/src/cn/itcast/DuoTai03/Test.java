package cn.itcast.DuoTai03;
/*
 * �����ࡣ
 *   1.ʵ�ֶ����cat dog��̬����
 *   2.�����͵�ǿ��ת����������������й���
 */
public class Test {
	public static void main(String[] args) {
		//�������࣬ʹ�����ζ�̬����
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		//a1��a2���Ե������࣬���๲�з���  ���е�ʱ�������������д
		a1.eat();
		a2.eat();
		
		//�����͵�ǿ��ת�����������������
		//��ֹ�����쳣����������a1����Cat����ת��Cat��
		//a2���� Dog����ת��Dog��
		//instanceof�ж�
		if(a1 instanceof Cat) {
			Cat c = (Cat)a1;
			c.catchMouse();
		}if(a2 instanceof Dog) {
			Dog d = (Dog)a2;
			d.lookHome();
		}
			
	}

}
