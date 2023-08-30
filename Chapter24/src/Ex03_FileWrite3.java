import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 반드시 예외 처리를 해야 한다. 제일 많이 사용( 앞의 예제의 개선 )
public class Ex03_FileWrite3 // 예외 try catch 개선된 처리 try with resource라 함
{

	public static void main(String[] args)
	{
		//리소스를 소괄호안에서 다루면 따로 닫아주지 않아도 자바에서 자동으로 처리해줌
		try (OutputStream out = new FileOutputStream("data.txt"))
		{
			out.write(67); //아스키코드 67 = 'C' Lock이 걸려있는 상황
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
