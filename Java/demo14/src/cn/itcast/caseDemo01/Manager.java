package cn.itcast.caseDemo01;

public class Manager extends Employee{
	private int bonus;
	
	public void Server() {
		System.out.println("经理在服务！");
	}
	public Manager() {
		super();
	}
	
	public Manager(String name,String ID,int bonus) {
		super(name,ID);
		this.bonus = bonus;
		//this.setName(name);
		//this.setID(ID);
		
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
