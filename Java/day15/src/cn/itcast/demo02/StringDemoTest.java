package cn.itcast.demo02;

public class StringDemoTest {
	public static void main(String[] args) {
		String str = "hellojava.nihaojava.javazhenbang.woaijava";
		int javaCount = 0;
		String str1 = "java";
		for(int i = 0 ; i < str.length() ; i ++) {
			
			if(str.contains(str1)) {
				int index1 = str.indexOf("java");
				javaCount ++;
				str = str.substring(index1+str1.length());
				
			}else {
				return;
			}
		}
		
		System.out.println(javaCount);
		
	}

}
