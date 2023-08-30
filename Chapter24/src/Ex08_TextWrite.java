import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex08_TextWrite // 문자 쓰기
{
	public static void main(String[] args)
	{
		/*
		text.txt 파일을 대상으로 문자 출력 스트림을 생성한다
		만약 파일이 없다면 새롭게 생성한다
		FileInputStream은 한글이 깨져 오류가 생긴다 = 1바이트씩 읽는 방법
		FileWriter로 써야 2바이트씩 읽어서 한글이 출력된다
		설정: UTF-8로 함께 설정
		 */
		try (Writer out = new FileWriter("text.txt"))
		{
			/*
			자바는 유니코드를 기반으로 문자를 저장한다. 아래는 문자 스트림을 기반으로
			해당 os의 인코딩 방식에 맞춰 문자를 텍스트파일에 저장한다.
			 */
			for (int ch = (int)'A'; ch < (int)('Z'+1); ch++) // 아스키코드
				//문자를 텍스트 파일에 입력한다.
				out.write(ch);
			
			out.write(13); // 1바이트로 읽음. CR -> \r(커서를 맨 앞으로 보내라)
			out.write(10); // LF -> \n
			
			for (int ch = (int)'A'+32; ch < (int)('Z'+1+32); ch++) // 아스키코드(소문자) A의 32번째부터
				out.write(ch);
			
			out.write(13);
			out.write(10);
			
			out.write("동해물과 백두산이 마르고 닳도록"); // 2바이트로 읽음
			out.write("\r\n");
			out.write("하느님이 보우하사 우리나라 만세");
			out.write("\r\n");
			out.write("무궁화 삼천리 화려강산 대한사람 대한으로 길이보전하세");
			out.write("\r\n");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
