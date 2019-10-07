package CRUD;

import java.sql.PreparedStatement;

import java.sql.Connection;

import common.DB_Connection;

public class Insert_Values {
	
	
	public void insertValues(String sl_no, String user_name, String email, String mobile)
	{
		DB_Connection db_conn_obj=new DB_Connection();
		Connection connection= db_conn_obj.get_connection();
		
		PreparedStatement ps=null;
		
		try
		{
			String query="insert into user(sl_no,user_name,email,mobile) values(?,?,?,?)";
			ps= connection.prepareStatement(query);
			ps.setString(1, sl_no);
			ps.setString(2, user_name);
			ps.setString(3, email);
			ps.setString(4, mobile);
			ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
