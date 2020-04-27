package util;

import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class MyDataSource implements DataSource {

	// 连接的列表
	private LinkedList<Connection> connections = new LinkedList<Connection>();

	public MyDataSource() {
		for (int i = 0; i < 15; i++) {
			Connection connection = DBHelper.getConnection();
			connections.add(connection);
		}
	}

	@Override
	public Connection getConnection() throws SQLException {
		if (connections.isEmpty()) {
			for (int i = 0; i < 10; i++) {
				Connection connection = DBHelper.getConnection();
				connections.add(connection);
			}
		}
		Connection connection = connections.removeFirst();
		Class[] interfaces = connection.getClass().getInterfaces();
		if (interfaces == null || interfaces.length == 0) {
			interfaces = new Class[1];
			interfaces[0] = Connection.class;
		}
		Connection proxyConnection = (Connection) Proxy.newProxyInstance(connection.getClass().getClassLoader(),
				interfaces, new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						if (method.getName().equals("close")) {
							addPool(connection);
							return null;
						}
						return method.invoke(connection, args);
					}
				});
		return proxyConnection;
	}

	public void addPool(Connection connection) {
		connections.add(connection);
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		return null;
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {

	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {

	}

	@Override
	public int getLoginTimeout() throws SQLException {
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return false;
	}

}
