package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBHelper {
	private static String dirverClass;
	private static String url;
	private static String username;
	private static String password;

	/**
	 * ���س���
	 */
	static {
		FileReader fr;
		try {
			fr = new FileReader("db.properties");
			Properties p = new Properties();
			p.load(fr);

			dirverClass = p.getProperty("dirverClass");
			url = p.getProperty("url");
			username = p.getProperty("username");
			password = p.getProperty("password");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ȡ���Ӷ���
	 * 
	 * @return ��ǰ�����Ӷ���
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(dirverClass);
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * �ύ��ɾ�������
	 * 
	 * @param conn   ���Ӷ���
	 * @param sql    sql���
	 * @param values Ԥ�������ռλ������
	 * @return �������ݵ�����
	 */
	public static int executeUpdate(Connection conn, String sql, Object... values) {
		int i = -1;
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			for (int index = 0; index < values.length; index++) {
				ps.setObject(index + 1, values[index]);
			}
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	/**
	 * �ύ��ѯ���
	 * 
	 * @param conn   ���Ӷ���
	 * @param sql    sql���
	 * @param values Ԥ�������ռλ������
	 * @return ��ѯ�Ľ����
	 */
	public static <T> List executeQuery(Connection conn, String sql, T t, Object... values) {
		List list = new ArrayList();
		ResultSet rs = null;
		PreparedStatement ps = null;
		Class clazz = (Class) t;
		try {
			ps = conn.prepareStatement(sql);
			for (int index = 0; index < values.length; index++) {
				ps.setObject(index + 1, values[index]);
			}
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			while (rs.next()) {
				Constructor constructor = clazz.getDeclaredConstructor();
				Object obj = constructor.newInstance();

				Field[] fields = clazz.getDeclaredFields();
				for (Field field : fields) {
					for (int i = 1; i <= rsmd.getColumnCount(); i++) {
						if (rsmd.getColumnName(i).equalsIgnoreCase(field.getName())) {
							field.setAccessible(true);
							field.set(obj, rs.getObject(i));
							break;
						}
					}
				}
				list.add(obj);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return list;
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
public static void main(String[] args) {
	System.out.println(getConnection());
}
}
