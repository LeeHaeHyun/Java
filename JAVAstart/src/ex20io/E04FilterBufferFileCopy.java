package ex20io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
버퍼 필터 스트림을 통한 파일복사 프로그램
 */
public class E04FilterBufferFileCopy
{

	public static void main(String[] args)
	{
		try
		{		
			// 원본파일 읽어오기 위한 입력 스트림
			InputStream in = new FileInputStream("src/ex20io/npp.8.4.5.portable.x64.zip");
			// 복사본을 만들기 위한 출력 스트림
			OutputStream out = new FileOutputStream("src/ex20io/npp.8.4.5.portable3.x64_copy.zip");
			
			//파일과 자바 사이에서 버퍼 역할을 하는 버퍼필터 스트림 추가
			BufferedInputStream bufIn = new BufferedInputStream(in);
			BufferedOutputStream bufOut = new BufferedOutputStream(out);
			
			int copyByte = 0;
			int bData;
			
			/*
			 버퍼 필터 스트림을 통해 파일을 읽어 저장하므로, 읽기/쓰기 속도가 매우 빠르다.
			 */
			while(true)
			{
				bData = bufIn.read();
				
				if(bData==-1)
				{
					break;
				}
				
				bufOut.write(bData);
				copyByte++;
			}
			
			bufIn.close();
			bufOut.close();
			System.out.println("복사된 파일크기:"+ (copyByte/1024)+ "Kbyte");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
