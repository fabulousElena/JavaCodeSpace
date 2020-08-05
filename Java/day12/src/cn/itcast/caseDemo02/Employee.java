package cn.itcast.caseDemo02;

public class Employee {
	private String name;
	private String ID;
	private int salary;
	
	public Employee() {
		super();
	}
	
	public Employee(String name ,String ID, int salary) {
		super();
		this.name = name;
		this.ID = ID;
		this.salary = salary;
	}
	
	public void show() {
		System.out.println(this.name + this.ID + this.salary);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
