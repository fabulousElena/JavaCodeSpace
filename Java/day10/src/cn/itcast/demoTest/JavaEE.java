package cn.itcast.demoTest;
/*
 * 描述JavaEE开发工程师类
 *   工号，姓名 ，工作方法
 * 其他员工也具备这些共性，抽取到父类中，自己就不需要定义了
 * 是研发部员工的一种。继承研发部类
 * 
 */
public class JavaEE extends Develop{
	//重写他父类的父类的抽象方法
	public void work() {
		//调用父类的get方法，获取name id值
		System.out.println("JavaEE工程师在开发。"+ super.getName() + super.getID());
	}

}
