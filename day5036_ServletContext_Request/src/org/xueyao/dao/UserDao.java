package org.xueyao.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.xueyao.domain.User;
import org.xueyao.utils.JDBCUtils;

public class UserDao {

	
	public void addUser(User user) throws SQLException {
		//INSERT INTO tb_user VALUES(NULL, 'tom', '1234', '1234@qq.com', 'tomcat', '男', '1992-02-02');
		String sql = "INSERT INTO tb_user VALUES(NULL, ?, ?, ?, ?, ?, ?)";
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		Object[] param = {user.getUsername(),user.getUserpass(),user.getUseremail(),user.getNickname(),user.getUsersex(),user.getBirthday()};
		queryRunner.update(sql, param);
	}

}
