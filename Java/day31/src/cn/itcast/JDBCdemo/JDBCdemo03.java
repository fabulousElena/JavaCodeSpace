package cn.itcast.JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
 * java程序实现用户登录，用户名和密码，数据库检查
 * 防止被注入攻击
 * Statement接口实现类  作用  执行sql语句 返回结果集
 * 有一个子接口PreparedStatement （sql预编译存储，多次高效的执行sql）
 * 子接口的实现类  也mysql的驱动中  如何获取接口的实现类
 * 
 * 此方法是Connection数据库连接对象的方法
 * PreparedStatement preparedStatement（String sql）
 */
public class JDBCdemo03{
	public static void main(String[] args)  throws Exception{
		//1 注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 2获取链接对象
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		// 3获取执行sql语句对象
		
		
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		String pass = sc.nextLine();
		
		//执行sql语句 到数据表中查询用户名和密码
		//如果存在 登录成功  反之登录失败
		String sql = "SELECT * FROM users WHERE username = ? AND PASSWORD = ?";
		PreparedStatement pst = con.prepareStatement(sql);
		System.out.println(sql);
		//调用Connection接口的方法 PreparedStatement 获取 PreparedStatement 接口的实现类
		//方法中参数，sql语句中的参数全部采用问号占位符
		//调用pst对象set方法，设置问号占位符上的参数
		pst.setObject(1, user);
		pst.setObject(2, pass);
		//调用方法 执行sql语句获取结果集
		System.out.println(user + pass);
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString("username")+ " " + rs.getString("password"));
		}
		
		System.out.println(user);
		rs.close();
		con.close();
		pst.close();
	}

}
