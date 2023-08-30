package ex20io;

// 파일 복사 프로그램
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
스트림: IO모델의 핵심, 스트림은 데이터의 흐름을 생성해주는 통로
입력(Input) 출력(output)으로 나뉜다
 */
public class E01ByteFileCopy
{

	public static void main(String[] args)
	{
		InputStream in = null;
		OutputStream out = null;
		int copyByte = 0;
		
		/*
		 IO관련 작업에서는 많은 부분에서 예외처리가 필요하다 Try-catch 권장
		 */
		try
		{
			// 원본파일 읽어오기 위한 입력 스트림
			in = new FileInputStream("src/ex20io/npp.8.4.5.portable.x64.zip");
			// 복사본을 만들기 위한 출력 스트림
			out = new FileOutputStream("src/ex20io/npp.8.4.5.portable.x64_copy.zip");
			// 원본 파일에서 1바이트씩 읽어 저장하기 위한 변수
			int bData;
			// 파일의 전체 내용을 읽기 위해 무한루프 구성
			while(true)
			{
				//원본파일에서 1바이트를 읽어온다.
				bData = in.read();
				
				//파일을 끝까지 읽으면 -1을 반환하므로 반복문 탈출
				if(bData==-1)
				{
					break;
				}
				
				// 읽은 데이터를 복사본으로 출력
				out.write(bData);
				//1바이트를 읽을 때마다 1씩 증가
				copyByte++;			
			}			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch(IOException e)
		{
			System.out.println("파일스트림 생성시 오류 발생됨");
		}
		finally 
		{
		try 
		{
			in.close();
			out.close();
			
			System.out.println("복사된 KByte 크기:"+ (copyByte/1024));
		}
		catch(IOException E) 
		{
			System.out.println("파일스트림닫기 오류");
		}
		}
	}
}
