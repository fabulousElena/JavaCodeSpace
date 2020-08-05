package cn.itcast.SetDemo;
/*
 * 对象的哈希值，普通的十进制整数
 * 父类Object，方法public int hashCode() 计算的结果是int类型整数
 */
public class HashDemo01 {
	public static void main(String[] args) {
		Person p = new Person();
		int i = p.hashCode();
		System.out.println(i);
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}
