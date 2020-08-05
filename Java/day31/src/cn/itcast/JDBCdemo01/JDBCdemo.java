package cn.itcast.JDBCdemo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 使用PreparedStatement 接口实现数据表的更新操作
 */
public class JDBCdemo {
	public static void main(String[] args) throws Exception{
		// 1 注册驱动,使用反射技术，将驱动类加入到内容
		// 使用java.sql.DriverManager类的静态方法registerDriver(Driver driver)
		// Driver是一个接口，参数传递是 MySQL驱动程序中的实现类。
		// DriverManager.registerDriver(new Driver());
		// 通过驱动源代码，注册了两次驱动程序
		Class.forName("com.mysql.jdbc.Driver");

		// 2获得数据库的连接
		// static Connection getConnection (String url , String user , String password)
		// 返回值是Connection的实现类，在mysql的驱动程序中
		// URL：数据库的地址 jdbc:mysql://连接主机ip:端口号/数据库的名字
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		
		
		//拼写修改的sql语句 采用？站位
		String sql = "UPDATE sort SET sname = ? , sprice = ? WHERE sid = ?";
		
		//调用数据库连接对象con的方法preparedStatement获取sql语句的预编译对象
		PreparedStatement pst =  con.prepareStatement(sql);
		//调用pst方法setXXX设置?站位
		pst.setObject(1, "汽车美容");
		pst.setObject(2, 486655);
		pst.setObject(3, 7);
		//调用pst方法执行sql语句
		pst.executeUpdate();
		
		pst.close();
		con.close();
		
		
	}

}
