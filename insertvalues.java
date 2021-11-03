//Inserting data into Movies table from a Java (any language) program
// Querying data from Movies table with or without parameters – after having the movies data in the table,
//you need to query the movie details (name, actor, actress, director, year of release) using a SELECT statement.
package Basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertvalues { 
	public static void main (String[] args) throws SQLException {
		String jdbcUrl = "jdbc:sqlite:Movies.db";
		Connection connection = DriverManager.getConnection(jdbcUrl);
		
		String sql = "insert into Movies values('The Wolf of Wallstreet','Leoardo DiCapario','Margot Robbie',2013,'Martin Scorsese')";
		Statement statement = connection.createStatement();
		int rows  = statement.executeUpdate(sql);
		if(rows > 0) {
			System.out.println("A Row Created");
		}
		
	}

}
