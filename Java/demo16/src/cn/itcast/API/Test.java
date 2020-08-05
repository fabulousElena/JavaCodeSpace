package cn.itcast.API;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Integer i = new Integer(4);
		System.out.println(i);
		int num = i.intValue();
		System.out.println(num);
		System.gc();
		double c = Math.pow(3, 20);
		System.out.println(c);
		long l1 = System.currentTimeMillis();
		for(i = 0 ; i < 100000 ; i++) {
			if(i==50000) {
				System.exit(0);
			}
		}
		long l2 = System.currentTimeMillis();
		System.out.println(l2-l1);
		
	}

}
