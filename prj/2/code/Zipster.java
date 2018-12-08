package zipster;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Zipster {
	static Scanner input = new Scanner(System.in);
	//The SQL Server JDBC Driver is in 
	private static final String jdbcDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	//The JDBC connection URL which allows for Windows authentication is defined below.
	private static final String jdbcURL = "jdbc:sqlserver://localhost:1433; databasename = Zipster; integratedSecurity = true;";
	public static void main(String [] args) {
		System.out.println("Program started");
		try {
			Class.forName(jdbcDriver).newInstance();
			System.out.println("JDBC driver loaded");
		}
		catch (Exception err) { 
			System.err.println("Error loading JDBC driver");
			err.printStackTrace(System.err);
			System.exit(0);
		}

		Connection databaseConnection = null;
		try {
			//Connect to the database
			databaseConnection = DriverManager.getConnection(jdbcURL);
			System.out.println("Connected to the database");

			//declare the statement object
			Statement sqlStatement = databaseConnection.createStatement();

			//declare the result set    
			ResultSet rs = null;

			//Prompt user to enter information
			System.out.print("\nEnter a city: ");    
			String city = input.nextLine();

			System.out.print("Enter a state: ");
			String state = input.nextLine();
					
			//Build the query string, making sure to use column aliases
			String queryString = "SELECT b.zip ";
			queryString += "FROM city a ";
			queryString += "JOIN zip_code b ";
			queryString += "ON a.city_id = b.city_id ";
			queryString += "WHERE UPPER(city_name) = '" + city +"'" + " and UPPER(state) = '" + state + "'" ;

			System.out.println("You entered: " + city + ", " + state);
			System.out.print("The zip code for " + city + ", " + state + " is: ");

			//execute the query
			rs=sqlStatement.executeQuery(queryString);

			//loop through the result set and call method to print the result set row
			while (rs.next()) {
				printResultSetRow(rs);
			}    

			//close the result set
			rs.close();
			System.out.println("\nClosing database connection");

			//close the database connection
			databaseConnection.close();
		}
		
		catch (SQLException err) {
			System.err.println("Error connecting to the database");
			err.printStackTrace(System.err);
			System.exit(0);
		}
		System.out.println("Program finished");
	}
 
	public static void printResultSetRow(ResultSet rs) throws SQLException {
		String zip = rs.getString("zip"); 
		System.out.println(zip); 
	}
}