import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
스트림: IO모델의 핵심개념이라 할 수 있는 스트림은 '데이터의 흐름'
 */
public class Ex01_FileWrite1
{
	public static void main(String[] args) throws IOException // 만들어지지 않을 경우를 대비하여 예외 처리해야함
	{
		// 기본 스트림
		OutputStream out = new FileOutputStream("data.txt"); //OutputStream 이것만 사용
		//스트림을 통해 데이터를 보냄
		out.write(65); //아스키코드 65 = 'A' Lock이 걸려있는 상황
		out.close(); // 문서 닫음 반드시 해야함 그래야 lock이 풀림
	}
}
