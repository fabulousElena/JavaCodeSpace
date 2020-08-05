package cn.itcast.demo03;

public class StringBufferDemo {
	public static void main(String[] args) {
		function();
		function2();
		function3();
	}
	/*
	 *StringBuffer
	 * toString()  继承Object 重写toString（）
	 * 将缓冲区的所有字符，变成字符串
	 * 
	 */
	public static void function3() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdefg");
		buffer.append("1212121");
		System.out.println(buffer.toString());
	}
	
	/*
	 * StringBuffer类的方法
	 * reverse（）将缓冲区的字符反转
	 */
	
	/*
	 * StringBuffer类方法
	 * replace（int start ，int end ，String str）
	 * 将指定的索引范围内的所有字符替换成新的字符
	 */
	
	/*
	 * StringBuffer 方法
	 * insert （int index，任意类型）
	 * 将任意类型数据插入到缓冲区的指定索引上
	 */
	
	/*
	 * StringBuffer方法
	 * delete（int start ,int end ）删除缓冲区中的字符
	 * 开始索引的  都是开始包含  结束不包含
	 * 包含头不包含尾
	 * 
	 */
	public static void function2() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdefg");
		buffer.delete(1, buffer.length());
		buffer.insert(1, "dawdada");
		System.out.println(buffer);
	}
	
	/*
	 * StringBuffer类方法
	 * append.将任意的
	 * append返回值  写return this
	 * 调用者是谁，返回值就是谁
	 * 返回值还是自己本身，所以还可以继续调用方法
	 * 
	 * 
	 */
	public static void function() {
		StringBuffer buffer = new StringBuffer();
		//调用StringBuffer方法append向缓冲区追加内容
		buffer.append("3").append(false).append("dadwamasdakdkshk");
		System.out.println(buffer);
	}

}
