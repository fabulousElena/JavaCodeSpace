package cn.itcast.JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * JDBC技术查询数据表  获取结果集
 */
public class JDBCdemo01 {
	public static void main(String[] args) throws Exception {
		//1 注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2获取链接对象
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url,username,password);
		//3获取执行sql语句对象
		Statement stat = con.createStatement();
		//拼写查询的sql
		String sql = "SELECT * FROM sort";
		//4调用执行者对象方法，执行sql语句获取结果集
		// ResultSet executeQuery(String sql)执行sql语句中的select查询
		//返回值ResultSet接口的实现类对象,实现类在mysql驱动中
		ResultSet rs = stat.executeQuery(sql);
		//5处理结果集
		//ResultSet 接口方法 boolean next() 返回true 有结果集  反之则没有
		//System.out.println(rs.next());
		while(rs.next()) {
			//获取每列数据，使用的是ResultSet接口的方法 getxx 方法参数中 建议写String列名
			//rs.getInt(0);  
			System.out.println(rs.getInt("sid") + " " + rs.getString("sname") 
			+ "  " + rs.getDouble("sprice") + "  " + rs.getString("sdesc"));
			
		}
		
		
		rs.close();
		stat.close();
		con.close();
		
		
		
	}

}
