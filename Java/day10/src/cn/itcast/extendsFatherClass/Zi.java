package cn.itcast.extendsFatherClass;

public class Zi extends Fu {
	int i = 2;
	
	public void show() {
		int i = 3;
		System.out.println(super.i);
	}

}
