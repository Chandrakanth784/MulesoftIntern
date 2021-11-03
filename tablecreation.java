
// Creating a new table (Movies) using JDBC / Other Languages – before working with data, you need to create a table called Movies. 
//Learn how to create a new table in an SQLite database from a Java (any language) program.

package Basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class tablecreation { 
	public static void main (String[] args) throws SQLException {
		String jdbcUrl = "jdbc:sqlite:Movies.db";
		Connection connection = DriverManager.getConnection(jdbcUrl);
		
		String sql = "Create table Movies (movie_name varchar(20), movie_actor varchar(20), movie_actress varchar(20), movie_release int, movie_director varchar(20))";
		Statement statement = connection.createStatement();
		statement.executeUpdate(sql);
		
		System.out.println("Table Created");
	}

}
