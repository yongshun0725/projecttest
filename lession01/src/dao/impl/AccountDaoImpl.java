package dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import bean.User;
import dao.AccountDao;
import util.DBUtil;
import util.MyDataSource;

public class AccountDaoImpl implements AccountDao {
	private QueryRunner queryRunner = new QueryRunner(DBUtil.getDataSource());
	@Override
	public int regist(User user) {
		int i = -1;
		try {
			i =  queryRunner.update("insert into `user`(`name`,`age`,`password`) values(?,?,?)",
					user.getName(),user.getAge(),user.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

}
