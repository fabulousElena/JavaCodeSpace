/*
 * continue�ؼ���
 * ���ã���ѭ���У���ֹ����ѭ������ִ��continue�������䣬ֱ�ӿ�ʼ��һ�����
 */
public class continueDemo {
	public static void main (String [] args){
		for(int i = 0 ; i < 10 ; i++ ) {
			if (i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
