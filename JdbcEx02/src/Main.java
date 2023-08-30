import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main
{
	static
	{
		try
		{
			// 드라이브 로드
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
			// 오라클 DB 연결
			Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"scott",
				"TIGER");
			// 정적 쿼리문을 전송 및 실행하기 위한 객체 생성 및 메소드 호출
			Statement stmt = con.createStatement();
			
			//--------------------------------------------------
			StringBuffer sb = new StringBuffer();
			sb.append("create table test1 ( "); // SQL문을 여기다 적용
			sb.append("  id varchar2(10),    ");
			sb.append("  age number )       ");
			
			int updateCount =
					stmt.executeUpdate(sb.toString());
			System.out.println("createCount : " + updateCount);
			
			
			//------------------------------------------------
			sb.setLength(0);
			// 정적 insert 쿼리문 작성(인파라미터가 없는 쿼리문) => ?가 아닌 쿼리
			sb.append("insert into test1 ");
			sb.append("values ('홍길동', 10)");
			updateCount = stmt.executeUpdate(sb.toString());
			System.out.println("insertCount : " + updateCount);
			
			//------------------------------------------------
			sb.setLength(0);
			sb.append("select * from test1");
			
			/*
			ResultSet 인터페이스
			: select문 실행시 쿼리의 실행결과를 ResultSet객체를 통해
			받는다. 결과로 반환된 레코드의 처음부터 끝까지 next()메소드를 통해
			반복 인출한다.
			 */
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next())
			{
				System.out.print("id : " + rs.getString(1) + ", ");
				System.out.println("age : " + rs.getString("age"));
			}
			//-----------------------------------------------
			sb.setLength(0);
			sb.append("update test1");
			sb.append("   set id='전우치', ");
			sb.append("       age=20 ");
			sb.append(" where id='홍길동'");
			updateCount = stmt.executeUpdate(sb.toString());
			System.out.println("updateCount : " + updateCount);

			//------------------------------------------------
			sb.setLength(0);
			sb.append("select * from test1");
			rs = stmt.executeQuery(sb.toString());
			while(rs.next())
			{
				System.out.print("id : " + rs.getString(1) + ", ");
				System.out.println("age : " + rs.getString("age"));
			}
			
			//-----------------------------------------------
			sb.setLength(0);
			sb.append("delete from test1");
			updateCount = stmt.executeUpdate(sb.toString());
			System.out.println("deleteCount : " + updateCount);

			//----------------------------------------------
			sb.setLength(0);
			sb.append("drop table test1");
			updateCount = stmt.executeUpdate(sb.toString());
			System.out.println("dropCount : " + updateCount);
			
			//----------------------------------------------
			rs.close();
			stmt.close();
			con.close();
		} 
		catch (SQLException sqle)
		{
			System.out.println("Connection Error");
			sqle.printStackTrace();
		}	
	}
}
