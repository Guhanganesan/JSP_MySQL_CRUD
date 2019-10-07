package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import common.DB_Connection;
import common.User_Bean;

public class Delete_Values {
	
	
	public void deleteValue(String sl_no)
	{
		DB_Connection db_conn_obj=new DB_Connection();
		Connection connection= db_conn_obj.get_connection();
		
		PreparedStatement ps=null;
		
		try {
			String query="delete from user where sl_no=?";
			ps=connection.prepareStatement(query);
			ps.setString(1, sl_no);
		     ps.executeUpdate();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
