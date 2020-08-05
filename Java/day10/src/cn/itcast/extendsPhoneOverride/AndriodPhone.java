package cn.itcast.extendsPhoneOverride;
/*
 * 定义好的只能手机类
 * 
 *   功能 ：打电话  发短信 
 *       来电显示：显示号码，姓名，头像
 *       
 *   新来的智能手机，两个 功能没有变化，只有来电功能发生变化 
 *   直接使用原先手机中的打电话和发短信功能  
 *   在新的功能上添加  显示号码  姓名 头像
 *   
 *   用新的手机继承原来的手机,直接使用Phone类的打电话和发短信功能  
 *   但是，将原来的来电功能，进行重写，加入新的内容
 *   
 *   子类重写父类的方法，
 *   必须保证子类方法的权限大于或者等于父类方法的权限
 *   
 *   java中的四大权限
 *     public  protected（受保护） default（默认，不写就是默认权限） private（私有）
 */
public class AndriodPhone extends Phone{
	public void showNum() {
		//父类中的方法showNum已经可以显示号码了。
		//子类中直接使用就好了
		super.showNum();
		System.out.println("显示 姓名");
		System.out.println("显示 头像");
	}

}
