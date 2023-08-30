import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex04_FileRead
{
	public static void main(String[] args)
	{
		//data.txt에 있는 내용을 읽음(in), close하지 않아도 자바가 닫아준다.
		try (InputStream in = new FileInputStream("data.txt")) // 자식을 부모에 대입
		{
			// 데이터를 1바이트로 읽음.
			int dat = in.read();
			// 10진수로 출력
			System.out.println(dat);
			// 글자로 출력
			System.out.printf("%c \n", dat);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
