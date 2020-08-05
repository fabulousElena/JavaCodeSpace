package cn.itcast.SystemDemo;

public class SystemDemo {
	public static void main(String[] args) {
		function4();
	}
	
	/*
	 * system 类方法  复制数组arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
	 * Object src  要复制 的源数组
	 * int srcPos  数组源的起始索引
	 * Object dest  复制后的目标数组
	 * int destPos  目标数组的起始索引
	 * int length   复制几个
	 */
	public static void function4() {
		int[] src = {11,25,221,33,44,55,6,66,22};
		int[] desc = {33,424,2,33};
		System.arraycopy(src, 1, desc, 1, 2);
		for(int i = 0 ; i < desc.length ; i ++) {
			System.out.println(desc[i]);
		}
	}
	
	/*
	 * JVM在内存中，收取对象的垃圾
	 * static void gc()
	 */
	public static void function2() {
		new PersonLaJi();
		new PersonLaJi();
		new PersonLaJi();
		new PersonLaJi();
		new PersonLaJi();
		new PersonLaJi();
		new PersonLaJi();
		new PersonLaJi();
		new PersonLaJi();
		new PersonLaJi();
		System.gc();
	}
	
	/*
	 * 获取当前操作系统的属性
	 * 静态方法  static Properties getProperties()
	 */
	public static void function3() {
		System.out.println(System.getProperties());
	}
	
	/*
	 * 获取系统当前毫秒值
	 * static long currentTimeMillis()
	 * 对程序执行时间测试
	 */
	public static void function() {
		long start = System.currentTimeMillis();
		
		for(int i = 0 ; i < 1000 ; i ++) {
			for(int j = 0 ; j < 100 ; j ++) {
				System.out.println(i);
				if(i == 50) {
					System.exit(0);//退出当前虚拟机
				}
			}
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
	}

}
