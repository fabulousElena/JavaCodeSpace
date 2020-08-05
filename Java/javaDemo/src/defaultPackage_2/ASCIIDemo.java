package defaultPackage_2;
/*
 * 字符Java数据类型  char
 * 整数Java数据类型  int
 * 
 * int类型和 char类型转化
 * char 两个字节  int  四个字节
 * 
 * char 转成int类型的时候，自动转换，char数据类型，会查询编码表，得到整数
 * int转成char类型的时候，强制转换 ，会查询编码表
 * 
 * char可以和int计算，提升为int类型，在内存中为两个字节
 * char取值范围 0 - 65535；无符号数据类型
 */
public class ASCIIDemo {
	public static void main (String[] args) {
		char c = 'の';
		int i = c + 1 ;
		System.out.println(i);
		int j = 90;
		char h = (char)j;
		System.out.println(h);
		
		System.out.println((char)1);
		
		char k = '你';  
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
