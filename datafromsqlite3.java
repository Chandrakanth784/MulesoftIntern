//Connect to the SQLite database (or any Database you know): Learn how to download SQLiteJDBC driver and connect to an existing SQLite database using JDBC.
package Basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class datafromsqlite3 {
	public static void main(String[] args) {
		String jdbcUrl ="jdbc:sqlite:/C:\\sqlite\\db\\Student.db";
		try {
			Connection con = DriverManager.getConnection(jdbcUrl);
			String sql = "SELECT * from student";
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while(result.next()) {
				int stu_id = result.getInt("stu_id");
				String stu_name = result.getString("stu_name");
				System.out.println(stu_id + " | "+stu_name);
			}
		}catch(SQLException e) {
			System.out.println("Error in connecting to sqlite database");
		}
		
	}

}
