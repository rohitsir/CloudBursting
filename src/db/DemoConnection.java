package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DemoConnection {
	public static Connection DB() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		//	con = DriverManager.getConnection("jdbc:mysql://127.12.35.2:3306/public", "adminfbknakc", "wxgmveHt6SGv");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cloud_bursting", "root", "");
		} catch (Exception ex) {
			
		}
		return con;
	}
}
