 package defaultPackage_2;

/*
 * ���Ըն���õ�Phone��
 * �����������ͱ����ĸ�ʽ
 * 
 *     ��������  ������  = new �������ͣ���;
 *     
 *   ʵ���������͵Ĳ���
 *     1.�����  ���඼����ͬһ���ļ��У�����Ҫ�����
 *     2.�����������͵ı���
 *     3.�����������еĹ���
 */
public class PhoneTest {
	public static void main (String[] args) {
		//2:�����������͵ı���
		Phone p = new Phone();
		System.out.println(p);  //����ڴ�ĵ�ַ
		
		//3.�����������еĹ���
		//����  p.�ķ�ʽ  �������е�����
		//���Ծ��Ǳ��� ,��ֵ�ͻ�ȡ�����ֵ
		p.color = "������";
		p.brand = "������";
		p.size = 5.0;
		
		//��ȡһ������ֵ
		System.out.println(p.color+"  "+p.brand +"  "+p.size);
		
		
	}

}


