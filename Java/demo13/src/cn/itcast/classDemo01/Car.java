package cn.itcast.classDemo01;
//�ڲ���
public class Car {
	
	public static void main(String args[]) {
		Car.Engine c = new Car().new Engine();
		c.engineStatus();
	}
	
	private boolean status = true;
	public class Engine {
		public void engineStatus() {
			System.out.println("��������");
		}
	}

}
