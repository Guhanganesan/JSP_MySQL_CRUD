package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DB_Connection;
import common.User_Bean;

public class Edit_Values {
	
	
	public User_Bean getValuesOfUser(String sl_no)
	{
		DB_Connection db_conn_obj=new DB_Connection();
		Connection connection= db_conn_obj.get_connection();
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		User_Bean ub=new User_Bean();
		
		
		try {
			String query="select * from user where sl_no=?";
			ps=connection.prepareStatement(query);
			ps.setString(1, sl_no);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
			
				ub.setSl_no(rs.getString("sl_no"));
				ub.setUser_name(rs.getString("user_name"));
				ub.setEmail(rs.getString("email"));
				ub.setMobile(rs.getString("mobile"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ub;
		
	}

	/*---------------------------------------------------*/
	
	public void editUser(User_Bean ub)
	{
		DB_Connection db_conn_obj=new DB_Connection();
		Connection connection= db_conn_obj.get_connection();
		
		PreparedStatement ps=null;
		
				
		try {
			String query="update user set user_name=?, email=?, mobile=? where sl_no=?";
			ps=connection.prepareStatement(query);
			ps.setString(1, ub.getUser_name());
			ps.setString(2, ub.getEmail());
			ps.setString(3, ub.getMobile());
			ps.setString(4, ub.getSl_no());
			
	        ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}
