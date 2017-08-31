package org.xueyao.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.xueyao.domain.User;
import org.xueyao.utils.JDBCUtils;

public class UserDao {

	public User login(User user) throws SQLException {
		String sql ="SELECT * FROM tmp_170831_user WHERE username=? AND userpass=?";
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		
		return queryRunner.query(sql, new BeanHandler<User>(User.class),user.getUsername(),user.getUserpass());
	}

}
