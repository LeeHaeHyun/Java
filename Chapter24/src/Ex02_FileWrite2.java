import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 예외를 throws하는 것보다 try-catch로 예외처리를 해주는 것을 권장한다
 예외를 무시하면 문제가 생겼을 때 적절한 조치를 취하기 힘들기 때문이다.
 */
public class Ex02_FileWrite2
{

	public static void main(String[] args)
	{
		OutputStream out = null;
		
		try
		{
			// 출력스트림 생성
			out = new FileOutputStream("data.txt");
			out.write(66); //아스키코드 66 = 'B' LOCK이 걸려 있는 상황
			//out.close(); //finally 구문으로 옮김, 여기보다 trycatch에서 닫는 것을 권장
		}
		catch (IOException e)
		{
			
		}
		finally
		{
			/*
			 Try문으로 진입하여 스트림을 생성했다면 finally구문에서는 스트림을 닫아준다.
			 try구문으로 진입했을때 무조건 실행되는 구문이 finally절이다.
			 */
			if (out != null)
			{
				try
				{
					out.close();
				}
				catch (IOException e2)
				{
					
				}
			}
		}
	}
 // 너무 복잡함. 다음 예제에서...
}
