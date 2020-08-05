package cn.itcast.jdbcutilDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.itcast.jdbcutil.JDBCUtils;

public class Test {
	public static void main(String[] args)throws Exception{
		Connection con = JDBCUtils.getConnection();
		String sql = "SELECT sname FROM sort";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString("sname"));
		}
		
		JDBCUtils.close(con, pst, rs);
	}

}
