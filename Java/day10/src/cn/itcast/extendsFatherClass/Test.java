package cn.itcast.extendsFatherClass;
/*
 * �̳к����ุ���У���Ա�������ص�
 * Zi extends Fu
 * 
 * ����Ķ�����ó�Ա����
 *   �����Լ��У���ʹ���Լ���
 *   ����û�У����ø����
 *   
 * �������У����ø���ĳ�Ա���ؼ���super  ���ø���ĳ�Ա
 * ���ࣨ�����ࣩ�̳и��ࣨjava�г���super �����ࣩ
 * 
 * this.�ǵ����Լ������Ա
 * super.�ǵ��ø����Ա
 */

public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		System.out.println(z.i);
		z.show();
	}

}
