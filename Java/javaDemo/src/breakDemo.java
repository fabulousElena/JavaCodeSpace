/*
 * break关键字 
 * 作用于循环中，终止循环作用
 */
public class breakDemo {

	public static void main(String[] args) {
		int i = 1 ;
		while (true) {
			if(i==3) {
				break;
			}else {
				System.out.println(i);
			}
			i++;
			
		}
		
	}

}
