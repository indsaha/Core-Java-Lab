import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import mysql-connector-java-5.1.45-bin

/*DROP TABLE IF EXISTS `test`.`car`;

CREATE TABLE  `test`.`car` (
  `MAKE` varchar(45) NOT NULL,
  `MODEL` varchar(45) NOT NULL,
  `MODEL_YEAR` varchar(45) NOT NULL,
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
*/


public class Entry {

	
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
//		TODO 1	Load JDBC Driver in main memory
		String jdbcDriver="com.mysql.jdbc.Driver";
		
		Class.forName(jdbcDriver);
		
		
//		TODO 2	Get DB connection using JDBC URL
//		JDBC URL : Main-Protocol:DB-Spec-Protocol:Database-Info
		
		String jdbcURL = "jdbc:mysql://localhost:3306/test";
		
		Connection dbConnection = DriverManager.getConnection(jdbcURL);
		
		System.out.println(dbConnection);
		
		Statement selectStatement = dbConnection.createStatement(
							ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
		
		String selectQuery = "Select * from Car";
		
		ResultSet result =selectStatement.executeQuery(selectQuery);
		
		result.absolute(3);
		
		result.beforeFirst();
		
		while(result.previous()){
			String make = result.getString(1);
			String model = result.getString(2);
			String modelYear = result.getString("MODEL_YEAR");
			
			int id = result.getInt(4);
			
			
			System.out.println(id + "/"+ model+ "/"+ make + "/"+ modelYear);
		}
		
//		Static SQL Query		
		String insertQuery;
		int rows; 
		
/*		insertQuery = "insert into car values('Lamborghini','Avendor','2018',6)";
		
		Statement insertStatement = dbConnection.createStatement();
		
		rows = insertStatement.executeUpdate(insertQuery);
		
		
		if(rows > 0){
			System.out.println("Row is added in a table");
		}
*/		
		String make = "Rolls Royce";
		String model = "Phantom";
		String modelYear = "2020";
		
//		Dynamic SQL Query
		insertQuery = "insert into Car (make, model, model_year) values(?,?,?)";
		
		PreparedStatement insertStatement2 = dbConnection.prepareStatement(insertQuery);
		
		insertStatement2.setString(1, make);
		insertStatement2.setString(2, model);
		insertStatement2.setString(3, modelYear);
		
		rows = insertStatement2.executeUpdate();
		
		if(rows > 0){
			System.out.println("Row is added in a table");
		}
		
		
		
	}
	
}
