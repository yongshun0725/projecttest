package dao.impl;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import bean.User;
import util.DBHelper;
import util.MyDataSource;
import dao.UserDao;
public class UserDAOImpl implements UserDao {

	private MyDataSource dataSource = new MyDataSource();

	@Override
	public int insertUser(User user) {
		Connection conn = DBHelper.getConnection();
		String sql = "insert into `user`(`name`,`age`,`password`) values(?,?,?)";
		int i = DBHelper.executeUpdate(conn, sql, user.getName(), user.getAge(), user.getPassword());
		DBHelper.closeConn(conn);
		return i;
	}

	@Override
	public int updateUser(User user) {
		Connection conn = DBHelper.getConnection();
		String sql = "update `user` set `name` = ? , `age` = ? , `password` = ? where id = ?";
		int i = DBHelper.executeUpdate(conn, sql, user.getName(), user.getAge(), user.getPassword(), user.getId());
		DBHelper.closeConn(conn);
		return i;
	}

	@Override
	public int deleteUser(int id) {
		Connection conn = DBHelper.getConnection();
		String sql = "delete from `user` where `id` = ?";
		int i = DBHelper.executeUpdate(conn, sql, id);
		DBHelper.closeConn(conn);
		return i;
	}

	@Override
	public List<User> selectAll() throws SQLException {
		Connection conn = dataSource.getConnection();
		String sql = "select * from `user`";
		List list = DBHelper.executeQuery(conn, sql, User.class);
		DBHelper.closeConn(conn);
		return list;
	}

	@Override
	public User selectUserById(int id) {
		User user = null;
//		Connection conn = DBHelper.getConnection();
//		String sql = "select * from `user` where id = ?";
//		ResultSet rs = DBHelper.executeQuery(conn, sql, id);
//		try {
//			if (rs.next()) {
//				user = new User();
//				user.setId(rs.getInt(1));
//				user.setName(rs.getString(2));
//				user.setAge(rs.getInt(3));
//				user.setPassword(rs.getString(4));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		DBHelper.closeConn(conn);
		return user;
	}
}
