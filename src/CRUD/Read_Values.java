package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DB_Connection;
import common.User_Bean;

public class Read_Values {
	
	public List<User_Bean> getValues()
	{
		DB_Connection db_conn_obj=new DB_Connection();
		Connection connection= db_conn_obj.get_connection();
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<User_Bean> list=new ArrayList<User_Bean>();
		
		try {
			String query="select * from user";
			ps=connection.prepareStatement(query);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
//				System.out.println(rs.getString("sl_no"));
//				System.out.println(rs.getString("user_name"));
//				System.out.println(rs.getString("email"));
//				System.out.println(rs.getString("mobile"));
				
				User_Bean ub=new User_Bean();
				ub.setSl_no(rs.getString("sl_no"));
				ub.setUser_name(rs.getString("user_name"));
				ub.setEmail(rs.getString("email"));
				ub.setMobile(rs.getString("mobile"));
				
				list.add(ub);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
		
	}
	
	public static void main(String[] args) {
		Read_Values rd=new Read_Values();
		rd.getValues();
	}

}


