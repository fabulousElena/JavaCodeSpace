/*
 * do...while  循环
 *   do {
 *        循环体
 *   }while(条件);
 *   特点：无条件先执行第一次，如果条件为真，则继续执行，若为假，则调出。
 */
public class do_whileDemo {

	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}while(i < 5);

	}

}
