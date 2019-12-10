package com.hcl.employ;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Connection con=DaoConnection.getConnection();
        System.out.println( "Connected" );
        String cmd="Select * From Employ";
        try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				System.out.println("Employ No  " +rs.getInt("empno"));
				System.out.println("Name " +rs.getString("name"));
				System.out.println("Departrment  " +rs.getString("dept"));
				System.out.println("Designation " +rs.getString("desig"));
				System.out.println("Salary  " +rs.getInt("basic"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
