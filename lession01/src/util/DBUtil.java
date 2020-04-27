package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

public class DBUtil {

	private static DruidDataSource dataSource;
	/**
	 * ���س���
	 */
	static {
		FileReader fr;
		try {
			fr = new FileReader("H:\\eclipse\\workspace-web\\lession01\\src\\druid.properties");
			Properties p = new Properties();
			p.load(fr);

			dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(p);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ȡ���ӳ�
	 * 
	 * @return ���ص����ӳ�
	 */
	public static DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * ��ȡ���Ӷ���
	 * 
	 * @return ��ǰ�����Ӷ���
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * �ر����Ӷ���
	 * 
	 * @param conn ��ǰ�����Ӷ���
	 */
	public static void closeConn(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
