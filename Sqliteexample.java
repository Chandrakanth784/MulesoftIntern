package Basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqliteexample { 
	public static void main (String[] args) throws SQLException {
		String jdbcUrl = "jdbc:sqlite:Movies.db";
		Connection connection = DriverManager.getConnection(jdbcUrl);
		
		String sql = "select rowid,* from Movies";
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(sql);
		while(result.next()) {
			int rowId = result.getInt("rowid");
			String movie_name = result.getString("movie_name");
			String movie_actor = result.getString("movie_actor");
			String movie_actress = result.getString("movie_actress");
			int movie_release = result.getInt("movie_release");
			String movie_director = result.getString("movie_director");
			System.out.println(rowId + " | "+ movie_name + " | " + movie_actor + " | "+ movie_actress + " | "+ movie_release + " | " + movie_director);
			
		}
		
	}

}
