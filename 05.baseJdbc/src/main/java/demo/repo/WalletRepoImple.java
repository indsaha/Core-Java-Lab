package demo.repo;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import demo.beans.Customer;
import demo.beans.Wallet;

import java.lang.annotation.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//@Repository

public class WalletRepoImple implements WalletRepoInterface {
	//public boolean save(Customer c){
	//@Resource(name="map") //through
	
//private Map<String,Customer> data;
//
//	
//	public WalletRepoImple(Map data) {
//	
//		this.data = data;
//		//super();
//		// TODO Auto-generated constructor stub
//	}
	 static int id;
	// static int Walletid;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/test";

	  
	  
	   Connection conn = null;
	   Statement stmt = null;
	   Statement stmt1 = null;
	
	      //STEP 2: Register JDBC driver
	public boolean save(Customer c) throws SQLException, ClassNotFoundException{  
	    	  Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL);
		      System.out.println("Connected database successfully...");
		      
		      
		    // data.put(c.getMobileNumber(), c);
//		      String name = 
//		      insertQuery = "insert into Customer values(?,?,?)";
//				
//				PreparedStatement insertStatement2 = dbConnection.prepareStatement(insertQuery);
//				
//				insertStatement2.setString(1, make);
//				insertStatement2.setString(2, model);
//				insertStatement2.setString(3, modelYear);
//				
//				rows = insertStatement2.executeUpdate();
		      
		      
		      
		      
		      int rows; 
		      id++;
		     
		      String name = c.getName();
		      String mobileNo= c.getMobileNumber();
		      Wallet w = c.getWallet();
		      float balance = w.getBalance();
		      
			String insertQuery1;
			insertQuery1 = "insert into Wallet values("+ id +","+ balance +")";
			Statement insertStatement = conn.createStatement();
			rows = insertStatement.executeUpdate(insertQuery1);
			
            String insertQuery2 = "insert into Customer values(" + id +",'"+ name +"',"+ mobileNo + ","+ id +")";
			Statement insertStatement1 = conn.createStatement();
			rows = insertStatement1.executeUpdate(insertQuery2);
			
			
			
				if(rows > 0){
					System.out.println("Row is added in a table");
				}
		     return true;
	}
	public Customer findOne(String mobileNumber) throws SQLException{
		 String query = "select *  " +
	             "from Wallet, Customer " +
	             "where mobileNo like "+ mobileNumber + " and " +
	             "  Wallet.id = Customer.id ";
//return data.get(mobileNumber);
//return c;
		
		Statement insertStatement = conn.createStatement();
		 insertStatement.executeQuery(query);
		
		return  c;
	}
	
	
}
