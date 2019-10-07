package common;
import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {
	
	public Connection get_connection()
	{
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3308/jsp_crud","root","");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return connection;
	}

	
	public static void main(String[] args) {
		DB_Connection db_conn_obj=new DB_Connection();
		System.out.println(db_conn_obj.get_connection());
	}
	
	
}
