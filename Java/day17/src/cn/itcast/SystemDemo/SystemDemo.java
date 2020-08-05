package cn.itcast.SystemDemo;

public class SystemDemo {
	public static void main(String[] args) {
		function4();
	}
	
	/*
	 * system �෽��  ��������arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
	 * Object src  Ҫ���� ��Դ����
	 * int srcPos  ����Դ����ʼ����
	 * Object dest  ���ƺ��Ŀ������
	 * int destPos  Ŀ���������ʼ����
	 * int length   ���Ƽ���
	 */
	public static void function4() {
		int[] src = {11,25,221,33,44,55,6,66,22};
		int[] desc = {33,424,2,33};
		System.arraycopy(src, 1, desc, 1, 2);
		for(int i = 0 ; i < desc.length ; i ++) {
			System.out.println(desc[i]);
		}
	}
	
	/*
	 * JVM���ڴ��У���ȡ���������
	 * static void gc()
	 */
	public static void function2() {
		new PersonLaJi();
		new PersonLaJi();
		new PersonLaJi();
		new PersonLaJi();
		new PersonLaJi();
		new PersonLaJi();
		new PersonLaJi();
		new PersonLaJi();
		new PersonLaJi();
		new PersonLaJi();
		System.gc();
	}
	
	/*
	 * ��ȡ��ǰ����ϵͳ������
	 * ��̬����  static Properties getProperties()
	 */
	public static void function3() {
		System.out.println(System.getProperties());
	}
	
	/*
	 * ��ȡϵͳ��ǰ����ֵ
	 * static long currentTimeMillis()
	 * �Գ���ִ��ʱ�����
	 */
	public static void function() {
		long start = System.currentTimeMillis();
		
		for(int i = 0 ; i < 1000 ; i ++) {
			for(int j = 0 ; j < 100 ; j ++) {
				System.out.println(i);
				if(i == 50) {
					System.exit(0);//�˳���ǰ�����
				}
			}
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
	}

}
