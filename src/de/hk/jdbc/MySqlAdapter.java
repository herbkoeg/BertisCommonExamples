package de.hk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author palmherby
 *
 */
public class MySqlAdapter {
	// private static final String DB_DRIVER = "com.ibm.db2.jcc.DB2Driver";
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/herbert";

	public Connection getDBConnection(String db_connection, String db_user, String db_pw)
			throws ClassNotFoundException, SQLException {
		Connection dbConnection = null;
		Class.forName(JDBC_DRIVER);
		dbConnection = DriverManager.getConnection(db_connection, "Herbert", "herbertPaul123+");
		return dbConnection;
	}

}