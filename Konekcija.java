package Projekat_OOP;

import java.sql.*;

public class Konekcija {
	    
	Connection con = null;
	public static Connection konektuj_bazu_podataka(){
	        try {
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projekat","root", "");
	            return con;
	        }
	        catch (SQLException e) {
	        	System.out.println(e);
	        }
	        return null;
	    }
}
