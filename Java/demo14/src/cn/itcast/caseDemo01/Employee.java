package cn.itcast.caseDemo01;

public abstract class Employee {
	private String name;
	private String ID;
	public abstract void Server();
	public Employee() {
		super();
	}
	public Employee(String name , String ID) {
		this.name = name;
		this.ID = ID;
		
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

}
