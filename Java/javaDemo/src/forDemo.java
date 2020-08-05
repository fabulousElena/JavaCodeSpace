/*for 格式 
 *       for（初始化变量；条件；增量）{
 *            循环体
 *       }
 *  初始化变量：定义变量，控制循环次数
 *  条件：当条件是true的时候，执行循环体，是false的时候，结束循环
 *  增量：变量自增的情况
 */
import java.util.Scanner;
public class forDemo {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int i = sc.nextInt();
		//for循环，输出0-10；
		/*for(int i =  0 ; i <= 4 ; i++) {
			System.out.println(i);
		}
		Scanner sc = new Scanner(System.in);
		int j  = sc.nextInt();
		System.out.println(j);
		
		/*
		 * 利用for循环，计算1+4的结果
		 */
		int n = 0;
		for(int m = 1; m <=  100; m++) {
			n = m + n;
		}System.out.println(n);

	}

}
