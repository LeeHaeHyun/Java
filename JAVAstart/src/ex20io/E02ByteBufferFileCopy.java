package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
1바이트씩 읽어서 복사하는 것보다 1kb씩 읽어 저장할 수 있는 버퍼를 이용하기에
복사 속도가 훨씬 빠르다.
스트림 혹은 네트워크를 통해 파일을 전송할떄도 버퍼를 사용하는 이유는 바로 이런 속도차이 떄문에
 */
public class E02ByteBufferFileCopy
{
	public static void main(String[] args)
	{
		try
		{		
			// 원본파일 읽어오기 위한 입력 스트림
			InputStream in = new FileInputStream("src/ex20io/npp.8.4.5.portable.x64.zip");
			// 복사본을 만들기 위한 출력 스트림
			OutputStream out = new FileOutputStream("src/ex20io/npp.8.4.5.portable2.x64_copy.zip");
			
			// 복사된 크기를 한번에 읽어올 크기
			int copyByte = 0;
			int readLen;
			
			//1kbyte씩 파일의 내용을 읽어 저장하기 위한 버퍼 생성
			byte buffer[] = new byte[1024];
		
			// 파일의 전체 내용을 읽기 위해 무한루프 구성
			while(true)
			{
				//1kb씩 읽어옵니다.
				readLen = in.read(buffer);
				
				//파일을 끝까지 읽으면 -1을 반환하므로 반복문 탈출
				if(readLen==-1)
				{
					break;
				}
				
				// 읽은 데이터를 복사본으로 출력
				// 0부터 readLen의 크기만큼 쓰기
				out.write(buffer, 0, readLen);
				//1바이트를 읽을 때마다 1씩 증가
				copyByte += readLen;	
			}
			if(in!=null) in.close();
			if(out!=null) out.close();
			
			System.out.println("복사된 파일크기:"+ copyByte + "byte");
			System.out.println("복사된 파일크기:"+ (copyByte/1024) + "Kbyte");
			System.out.println("복사된 파일크기:"+ (copyByte/1024*1024) + "Mbyte");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch(IOException e)
		{
			System.out.println("IO작업중 예외가 발생되었습니다.");
		}
		catch(Exception e)
		{
			System.out.println("알 수 없는 예외가 발생되었습니다.");
		}
	}
}

