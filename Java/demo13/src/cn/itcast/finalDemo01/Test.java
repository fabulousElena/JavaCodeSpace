package cn.itcast.finalDemo01;

public class Test {
	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(2323);
		s.setName("wqewq");
		s.eat();
		String s1 = s.getName();
		System.out.println(s.getAge() +"-------" +  s1);
	}

}
