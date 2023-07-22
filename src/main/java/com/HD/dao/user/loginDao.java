package com.HD.dao.user;

import com.HD.model.Normal_User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @@author vincent
 * @create2023-07-21-7:28
 */
public class loginDao extends baseDao{


    public static Normal_User login(String username, String passwd) throws SQLException, ClassNotFoundException {
        // 打开数据库
        openDb();
        // sql语句
        String sql = "SELECT * from normal_user where username = ? and password = ?";
        // 预编译和处理占位符
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, passwd);
        // 将得到的数据放入normal_user
        Normal_User normal_user = null;
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            normal_user = new Normal_User();

            normal_user.setUserId(rs.getInt("userid"));
            normal_user.setUserName(rs.getString("userName"));
            normal_user.setGender(rs.getString("gender"));
            normal_user.setIdCard(rs.getString("idCard"));
            normal_user.setProvince(rs.getString("city"));
            normal_user.setCounty(rs.getString("county"));
            normal_user.setAddress(rs.getString("address"));
            normal_user.setPhone(rs.getString("phone"));
            normal_user.setPassword(rs.getString("password"));
        }

        // 关闭资源
        rs.close();
        ps.close();
        con.close();

        return normal_user;
    }

    public static void main(String[] args) {
        Normal_User normal_user= null;
        try {
            normal_user = login("zhangsan","123");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(normal_user);
    }

}
