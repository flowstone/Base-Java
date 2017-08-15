package org.xueyao.jdbc.utils.best;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Yao Xue
 * @date Aug 15, 2017 8:35:51 PM
 */
public class JdbcUtilsTest {
    public static void main(String[] args) {
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            con = JdbcUtils.getConnection();
            statement = con.createStatement();
            String sql = "SELECT * FROM user";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            JdbcUtils.release(con, statement, resultSet);
        }
        
    }
}
