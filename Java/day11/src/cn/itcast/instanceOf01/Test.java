package cn.itcast.instanceOf01;
/*
 * ����� �Ƚ������  �������true��false
 * �ؼ��֣�instanceof �Ƚ������������� 
 * 
 * �ؼ���  instanceof  ���Ƚϡ�һ���������͵ı������ǲ���������͵Ķ���
 * p��� ��������Student���Ͷ���  ����Teacher���Ͷ���
 * 
 *   ���ñ���  instanceof ����  
 *   p instanceof Student  �Ƚ� p�ǲ���Student���͵Ķ�������� instanceof�ͷ���true
 *   
 * ֻ�ܶ��м̳��� ����ʵ���� ʹ��  
 */
public class Test {
	public static void main(String[] args) {
		Person p = new Student();
		//Person p = new Teacher();
		
		boolean b = p instanceof Student;
		System.out.println(b);
		p.sleep();
		Student s = (Student)p;
		s.study();
		
	}

}
