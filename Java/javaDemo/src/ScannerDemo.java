/*Scanner�࣬���ã����������������룬���ܼ��̵�����
 * ʹ��Scanner�ࣺ
 * 1.����� ��ָ����������ڵ��ļ��� import
 * 2.��ʽ��������Scanner���ͱ���
 * 3.������ʹ��Scanner���еĹ��� ��ɼ�����
 */
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		//����  ������ = new ���ͣ�����
		//������ Scanner�������
		Scanner sc = new Scanner(System.in);
		//����.�������֣���  ���ܼ�������
		// ����  nextInt���� ���ܼ��̰����룬��֤�����������
		//���ܽ��ܵ����ݾ����������������к�Ľ��������������
		int i = sc.nextInt();
		System.out.println(i);
		
		//Scanner�����һ������   next()���ܼ���������ַ���
		
		String s = sc.next();
		System.out.println(s);
	}
}




