package defaultPackage_2;

public class loopTest {
	public static void main (String[] args) {
		/*
		 * ��1-100֮�����ż��֮��
		 */
		int j = 0;
		int k = 0;
		for (int i = 1 ; i <= 100; i++) {
			if(i%2==1) {
				j = j + i;
			}else {
				k = k + i;
			}
		}
		System.out.println(j);
		System.out.println(k);
		
		/*
		 * ��ˮ�ɻ���
		 * ��λ�� 100-999  ��λ��������+ʮλ��������+��λ�������� = ������
		 */
		for(int m = 100 ; m <= 999 ; m++) {
			int a = m/100;
			int b = (m/10)%10;
			int c = m % 10;
			if(a*a*a + b*b*b + c*c*c == m) {
				System.out.println(m);
			}
		
		}

	}

}
