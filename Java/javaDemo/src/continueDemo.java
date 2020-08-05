/*
 * continue关键字
 * 作用，在循环中，终止本次循环，不执行continue下面的语句，直接开始下一次语句
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
