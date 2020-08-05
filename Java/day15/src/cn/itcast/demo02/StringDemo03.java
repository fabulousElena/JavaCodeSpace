package cn.itcast.demo02;
/*
 * String类的构造方法
 * String类的构造方法，重载形式
 */
public class StringDemo03 {
    public static void main(String[] args) {
	//定义 String类的构造方法
    	function();
    	
}
    /*
     * 字节是负数，汉字的字节编码就是负数。默认编码表GBK 一个汉字采用两个字节表示
     * 
     * offset 数据的起始索引
     */
    public static void function() {
    	byte[] bytes = {-97,-98,-99,-100,99,100};
    	//调用String的构造方法，传递字节数据
    	String s = new String (bytes);
    	System.out.println(s);
    }
}
