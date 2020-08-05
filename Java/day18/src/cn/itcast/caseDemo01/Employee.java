package cn.itcast.caseDemo01;

public abstract class Employee {
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
	private String name;
	private String ID;
	
	

	public Employee() {
		super();
		
	}
	public Employee(String name, String iD) {
		super();
		this.name = name;
		ID = iD;
	}

}
