package cn.itcast.demoTest;
/*
 * 定义员工类 
 *   内容都是所有子类的共性抽取
 *     属性 ：姓名  工号
 *     方法：工作
 */
public abstract class Employee {
	//定义属性  成员变量
	private String name;
	//定义成员变量工号
	private String ID;
	
	//定义工作方法
	public abstract void work();

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
