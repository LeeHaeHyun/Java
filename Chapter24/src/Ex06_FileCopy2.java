import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;

/*
1바이트씩 읽어서 복사하는 것보다 1kb(1024바이트)씩 읽어 저장ㅇ할 수 있는 버퍼(buffer)를
이용하기 때문에 복사 속도가 훨씬 빨라진다.
스트림 혹은 네트워크를 통해 파일을 전송할때도 버퍼를 사용하는 이유는 바로 이런 속도차 때문이다.
 */
public class Ex06_FileCopy2
{

	public static void main(String[] args)
	// 원초적인 buffer를 이용한 파일 복사 프로그램 앞의 예제보다 빠름
	{
		String src = "./src/Ex04_FileRead.java"; // 이 내용을
		String dst = "FileRead2.txt"; // 여기에 붙여넣어라
		
		//원본파일과 복사본파일에 각각 입출력 스트림을 생성한다. 여러개를 저장할 수 있다
		try (InputStream in = new FileInputStream(src); // 문자를 구분하는데 사용
			OutputStream out = new FileOutputStream(dst)) // close할 필요가 없이 편하다
		{
			//1kbyte씩 파일의 내용을 읽어 저장하기 위한 버퍼생성(byte형배열)
			byte[] buf = new byte[1024]; // 1024 byte를 사용하여 data 읽기
			int len;
			
			Instant start = Instant.now();
			
			// 파일의 내용 전체를 읽기 위해 무한루프 구성
			while(true) // data를 읽음
			{
				//배열의 크기 즉 1kbyte씩 파일을 읽어온다.
				len = in.read(buf);
				
				//buf를 활용하여 data 읽기 1024 byte를 채울때까지 읽음
				if(len == -1) // 마지막 data 확인하기. 더이상 못읽으면 -1 반환
					break; // 중단
				
				/*
				읽어온 내용을 파일에 입력한다. 버퍼에 저장된 데이터를 
				인덱스 0의 위치에서 len의 크기만큼 전송한다
				 */
				out.write(buf, 0, len); //파일에 저장
			}
			
			// 총 복사한 시간 체크. 끝나는 현재시간을 구함
			Instant end = Instant.now();
			
			// 1/1000초 단위로 보여주기
			System.out.println("복사에 걸린 시간: " +
				Duration.between(start, end).toMillis());	
			//속도가 줄어드는 것을 확인할 수 있다.
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
