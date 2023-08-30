import java.sql.*;

public class Main
{
	static
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");		
		}
		catch (ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		try
		{
			Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"scott",
				"TIGER");
			Statement stmt = con.createStatement();
			
			StringBuffer sb = new StringBuffer();
			// 쿼리문 작성
			// 작성시 줄바꿈을 할 때 앞 뒤로 스페이스를 삽입하는 것이 좋다.
			sb.append("select * from emp");
			
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next())
			{
				System.out.print("eno : " + rs.getInt(1) + ", ");
				System.out.println("ename : " + rs.getString("ename"));
			}
			
			/*
			 자원반납(해제) : 모든 작업을 마친 후에 메모리 절약을 위해
			 반환한다 */
			rs.close();
			stmt.close();
			con.close();
		} 
		catch(SQLException sqle)
		{
			System.out.println("Connection Error");
			sqle.printStackTrace();
		}
	}
}
