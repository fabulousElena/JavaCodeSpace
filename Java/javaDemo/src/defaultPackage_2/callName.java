package defaultPackage_2;
/*
 * ������������ü��ϸĽ�
 *   ��ʵ����ѧ��������ʹ�ö��������ʽ������ѧ������
 *     ѧ�����ԣ�����������
 * 
 *   �洢ѧ����
 *     ѧ�����ͣ��洢��������
 *   ��������������
 *   ������������������Ϊ���������������ҵ�Ԫ��
 */
import java.util.ArrayList;
import java.util.Random;
public class callName {
	public static void main(String[] args) {
		//���弯�� ���洢����studentName���ͱ���
		ArrayList<studentName> array = new ArrayList<studentName>();
		//���ѧ����Ϣ
		add(array);
		//��������
		printArrayList(array);
		randomCall(array);
		
	} 
	
	//����� �������ϵ����� ���������Ҵ�Ԫ��
	public static void randomCall(ArrayList<studentName> array) {
		Random ran = new Random();
		int i = ran.nextInt(array.size());
		studentName s = array.get(i);
		System.out.println(s.name);
	}
	//����ѧ������Ϣ  ��������
	
	public static void printArrayList(ArrayList<studentName> array) {
		for(int i = 0; i < array.size(); i++) {
			//�洢���ϵ�ʱ�򣬼��� add��sn1��
			//��ȡ��ʱ�򣬼���get����  ȡ��������studentName���͵ı���
			studentName s = array.get(i);
			System.out.println(s.name +"  "+s.age );
		}
		
	}
	
	//���巽����ʵ�ִ洢ѧ��������������
	//����studentName���ͱ������洢��������
	public static void add(ArrayList<studentName> array) {
		//����studentName���ͱ���
		studentName sn1 = new studentName();
		studentName sn2 = new studentName();
		studentName sn3 = new studentName();
		studentName sn4 = new studentName();
		studentName sn5 = new studentName();
		
		sn1.name = "����";
		sn1.age = 101;
		
		sn2.name = "����";
		sn2.age = 102;
		
		sn3.name = "����";
		sn3.age = 103;
		
		sn4.name = "С��";
		sn4.age = 104;
		
		sn5.name = "С��";
		sn5.age = 105;
		//��studentName�����洢�������С�
		array.add(sn1);
		array.add(sn2);
		array.add(sn3);
		array.add(sn4);
		array.add(sn5);
		
	}
	
}
