package org.xueyao.demo;

import org.xueyao.bean.JDBCUtils;

import java.sql.*;

/**
 * @author XueYao
 * @date 2017-08-22
 */
public class C3P0Test {
    public static void main(String[] args) {
        update();
    }


    public static void query() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        connection = JDBCUtils.getConnection();
        try {
            statement = connection.createStatement();
            String sql = "UPDATE * FROM test";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(connection, statement, resultSet);
        }
    }
    public  static void update(){
        Connection connection = JDBCUtils.getConnection();
        PreparedStatement statement = null;
        try {
            String sql = "UPDATE user SET name = ? WHERE id = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "小红");
            statement.setInt(2, 2);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(connection, statement, null);
        }
    }
}
