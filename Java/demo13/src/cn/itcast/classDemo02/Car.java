package cn.itcast.classDemo02;

public class Car {
	
	public static void main(String[] args) {
		Car c = new Car();
		c.engineOn();
	}
	
	public void engineOn() {
		 class run extends Fire{
			 public void fire() {
				 System.out.println("�������������");
			 }
			
			
		}
		 new run().fire();
	}

}
