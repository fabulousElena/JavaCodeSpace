package defaultPackage_2;
/*
 * �ַ�Java��������  char
 * ����Java��������  int
 * 
 * int���ͺ� char����ת��
 * char �����ֽ�  int  �ĸ��ֽ�
 * 
 * char ת��int���͵�ʱ���Զ�ת����char�������ͣ����ѯ������õ�����
 * intת��char���͵�ʱ��ǿ��ת�� �����ѯ�����
 * 
 * char���Ժ�int���㣬����Ϊint���ͣ����ڴ���Ϊ�����ֽ�
 * charȡֵ��Χ 0 - 65535���޷�����������
 */
public class ASCIIDemo {
	public static void main (String[] args) {
		char c = '��';
		int i = c + 1 ;
		System.out.println(i);
		int j = 90;
		char h = (char)j;
		System.out.println(h);
		
		System.out.println((char)1);
		
		char k = '��';  
		System.out.println(k);
		
		for(int r = 65 ; r <= 90; r++) {
			System.out.print((char)r+" ");
			System.out.print((char)(r+32)+" ");
		}
		for (int z = 1; z <= 9 ; z++) {
			for(int p = 1 ; p <= z ; p++) {
				System.out.print(p+"*"+z+"="+z*p+" \t");
			}
			System.out.println();
		}
		
		
				
	}

}
