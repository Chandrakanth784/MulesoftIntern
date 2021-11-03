// use a query with parameter like actor name to select movies based  on the actor's name.


package Basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class actorsorting {
	public static void main(String[] args) throws SQLException {
		String jdbcUrl = "jdbc:sqlite:Movies.db";
		Connection connection = DriverManager.getConnection(jdbcUrl);
		
		String sql = "select rowid,* from movies where movie_actor='Leoardo DiCapario'";
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(sql);
		while(result.next()) {
			int rowId = result.getInt("rowid");
			String movie_name = result.getString("movie_name");
			String movie_actor = result.getString("movie_actor");
			System.out.println(rowId + " | "+ movie_name + " | "+ movie_actor);
	}

}
}
