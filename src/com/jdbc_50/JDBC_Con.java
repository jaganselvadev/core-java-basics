package com.jdbc_50;

import java.sql.*;

public class JDBC_Con {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://192.168.2.11:3306/HARISHDB", "0039", "Aalam@123");
			Statement st=con.createStatement();
			/*String str="insert into emp values(1,'Harish',23)";
			int res=st.executeUpdate(str);
			System.out.println(res+ " row added");
			
			String s="Select * from emp";*/
			ResultSet rs=st.executeQuery("Select * from emp");
			while(rs.next())
			{
				System.out.println("ID:"+rs.getInt(1)+" Name:"+rs.getString(2)+" Age:"+rs.getInt(3));
			}
			
		}
	catch(Exception e)
		{
		System.out.println(e);
		}
		
	}

}
