/*java�����е��������� Random�࣬���� ���������
 * ���裺1������� ��java.util�ļ�����
 * 2��������Random���͵ı���
 * 3.���� ����Random���еĹ��� ���������
 * Random�࣬�ṩ���ܣ� ����  nextInt���� ����һ������� �����int����
 * ����������ķ�Χ���ڹ���nextInt��дһ����������������������������Χ 
 * ��Χ�� 0-ָ��������֮����������������ָ�������֣�nextInt(100);
 * ���������������� nextDouble������Χ 0.0--1.0
 */
import java.util.Random;
public class RandomDemo {

	public static void main(String[] args) {
		//������Random���͵ı���
		Random ran = new Random();
		//����Random���еĹ��� ���������
		//Random���� ����������Ĺ���
		int i = ran.nextInt(50);
		System.out.println(i);
		System.out.println(i+2);
		
		double j = ran.nextDouble();
		System.out.println(j);
		
	}

}
