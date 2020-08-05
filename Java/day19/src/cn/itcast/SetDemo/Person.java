package cn.itcast.SetDemo;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
		// TODO 自动生成的构造函数存根
	}

	/*
	 * 如果没有做重写父类，每次哈希值运行结果都是不同的整数
	 * 如果子类重写父类方法，哈希值就是自定义的 数值
	 * 哈希值 是存储到HashSet集合的依据
	 */
	public int hashCode() {
		return 1;
	}

}
