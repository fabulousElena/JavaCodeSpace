package defaultPackage_2;

public class loopTest {
	public static void main (String[] args) {
		/*
		 * 求1-100之间的奇偶数之和
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
		 * 求水仙花数
		 * 三位数 100-999  个位数的立方+十位数的立方+百位数的立方 = 他自身
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
