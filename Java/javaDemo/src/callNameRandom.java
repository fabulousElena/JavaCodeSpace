/*
 * ʵ�����������
 *   1.�洢����ѧ������
 *   2.�����������ѧ������
 *   3.��������ʵ���������
 *   
 *  �����ܶ������������ɷ��������÷���
 *  
 *  �����������ܣ��õ�ͬһ����������
 *  �����洢�������У���������ʹ��һ�������е����ݣ��������ݲ���
 */
import java.util.Random;
public class callNameRandom {

	public static void main(String[] args) {
		String[] names  = new String[6];
		addStudentName(names);
		showName(names);
		//randomCall(names);
		System.out.println(randomCall(names));
		//System.out.println();
		//int i = randomCall(name.length);
		//Random ran = new Random();
		//int i = ran.nextInt(name.length);
		//System.out.print("����㵽���ֵ�ͬѧ�ǣ�");
		//System.out.println(name[randomCall(name.length)]);
		//name[randomCall(i)]
		
	}
	//���ѧ������
	public static void addStudentName (String[] names) {
		names[0] = "����";
		names[1] = "����";
		names[2] = "����";
		names[3] = "����";
		names[4] = "����";
		names[5] = "С��";
	}
	
	//��������
	public static void showName(String[] names) {
		for (int i = 0; i < names.length ; i++) {
			System.out.print(names[i]+"  ");
		}
	}
	
	//�����������
	public static String randomCall(String[] names) {
		Random ran = new Random();
		int i = ran.nextInt(names.length);
		return names[i];
	}

}
