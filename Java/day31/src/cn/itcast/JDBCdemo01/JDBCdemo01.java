package cn.itcast.JDBCdemo01;
/*
 * PrepareStatement接口实现数据表的查询操作
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class JDBCdemo01{
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
		
		String sql = "SELECT * FROM sort";
		
		PreparedStatement pst = con.prepareStatement(sql);
		
		//调用pst对象的发方法，执行查询语句 Select 语句
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
//			System.out.println(rs.getString("sid") + " "+ rs.getString("sname")
//			+ " " + rs.getString("sprice")+"  " + rs.getString("sdesc"));
			System.out.println(rs.getString("sname"));
		}
		
		rs.close();
		con.close();
		pst.close();
		
		
	}
	

}
