package cn.itcast.caseDemo02;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.getID());
		e.show();
		
		new Employee("уехЩ","dwadfajfkahfkjahf",3000000).show();
		
	}
}
