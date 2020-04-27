package dao;

import java.sql.SQLException;
import java.util.List;

import bean.User;

public interface UserDao {
	int insertUser(User user);

	int updateUser(User user);

	int deleteUser(int id);

	List<User> selectAll() throws SQLException;

	User selectUserById(int id);
}
