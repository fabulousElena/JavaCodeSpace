package cn.itcast.Demo01;

public class Person extends Object{
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Person p = new Person();
		p.age = 1000;
		System.out.println(p.toString());
		System.out.println(p.equals(1000));
	}
	
	/*public String toString() {
		return "Person [age=" + age + "]";
	}*/
	int age = 1000;
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		
		Person p = (Person)obj;
		return this.age == p.age ;
	}
}
