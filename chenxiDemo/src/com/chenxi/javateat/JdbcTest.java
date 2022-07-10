package com.chenxi.javateat;

import java.sql.*;

/**
 * @author chenxi
 * @date 2022/4/14 20:49
 */
public class JdbcTest {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2、获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdemo?useUnicode=true&characterEncoding=utf-8&useSSL=true", "root", "root");
            //3、获取预编译的数据库操作对象
            String sql = "select * from student where Sname like ? ";
            ps = conn.prepareStatement(sql);
            //ps.setString(1, "孙七");
            ps.setString(1, "孙%");
            // 4、执行sql
            rs = ps.executeQuery();
            while (rs.next()) {
                String Sid = rs.getString("Sid");
                String Sname = rs.getString("Sname");
                String Sage = rs.getString("Sage");
                String Ssex = rs.getString("Ssex");
                System.out.println(Sid + Sname + Sage + Ssex);
//               System.out.println(rs.getString("Sid"));   
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //6、释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
