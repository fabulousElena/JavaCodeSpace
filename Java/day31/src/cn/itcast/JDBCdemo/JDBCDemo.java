package cn.itcast.JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * JDBC 操作数据库的步骤
 * 1.	注册驱动.
 *   告知JVM使用的是哪一个的数据库驱动
   2.	获得连接.
               使用JDBC中的类，完成对MySQL数据库的链接
   3.	获得语句执行平台
               通过链接对象获取对sql语句的执行者对象
   4.	执行sql语句
               使用执行者对象向数据库中执行sql语句
               获取到数据库的执行后的结果。
   5.	处理结果
   6.	释放资源.
               调用一堆的close（）

 * 
 */
public class JDBCDemo {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		//1 注册驱动,使用反射技术，将驱动类加入到内容
		// 使用java.sql.DriverManager类的静态方法registerDriver(Driver driver)
		//Driver是一个接口，参数传递是 MySQL驱动程序中的实现类。
		//DriverManager.registerDriver(new Driver());
		//通过驱动源代码，注册了两次驱动程序
		Class.forName("com.mysql.jdbc.Driver");
		
		//2获得数据库的连接 
		//static Connection getConnection (String url , String user , String password)
		//返回值是Connection的实现类，在mysql的驱动程序中
		//URL：数据库的地址  jdbc:mysql://连接主机ip:端口号/数据库的名字
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println(con);
		
		//3获得语句执行平台，通过数据库连接对象，获取到sql语句的执行者对象
		//con 对象调用方法 Statement createStatement()获取Statement对象，将sql语句发送到数据库
		//返回值是Statement接口的实现类对象 在mysql驱动程序中
		Statement sta = con.createStatement();
		System.out.println(sta);
		
		//4 执行sql语句
		//通过执行者对象调用方法执行sql语句获取结果
		//int executeUpdate (String sql)
		//执行数据库中的sql语句， insert delete update
		//返回值int 是操作成功数据表有多少行
		int row = sta.executeUpdate
				("INSERT INTO sort(sname,sprice,sdesc) VALUES('骑车',222000,'今天有优惠')");
		System.out.println(row);
		
		//6 释放资源 一堆close（）
		sta.close();
		con.close();
	}
	
}













