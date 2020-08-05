package cn.itcast.InterfaceDemo02;

public class Test {
	public static Smoke method() {
		Smoke s = new Student();
		return s;
	}
	public static void main(String[] args) {
		method().smoking();
		
	}

}
