package cn.itcast.JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
 * java程序实现用户登录，用户名和密码，数据库检查
 * 演示被别人注入攻击
 */
public class JDBCdemo02{
	public static void main(String[] args)  throws Exception{
		//1 注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 2获取链接对象
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		// 3获取执行sql语句对象
		Statement stat = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		String pass = sc.nextLine();
		
		//执行sql语句 到数据表中查询用户名和密码
		//如果存在 登录成功  反之登录失败
		String sql = "SELECT * FROM users WHERE username = '"+user+"' AND PASSWORD = '"+pass+"'\r\n";
		System.out.println(sql);
		ResultSet rs = stat.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getString("username")+ " " + rs.getString("password"));
		}
		
		rs.close();
		con.close();
		stat.close();
	}

}
