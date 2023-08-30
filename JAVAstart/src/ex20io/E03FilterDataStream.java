package ex20io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class E03FilterDataStream
{

	public static void main(String[] args)
	{
		//필터 스트림을 통해 정수를 저장할 바이너리파일의 경로
		String src = "src/ex20io/FilterdataStream.bin";
		
		try {
			// 파일 생성을 위한 출력 스트림 생성
			OutputStream out = new FileOutputStream(src);
			// 파일 스트림의 내용을 조합할 필터스트림 생성
			DataOutputStream filterOut = new DataOutputStream(out);
			//2개의 스트림을 사용한다
			
			//write()를 통해 숫자데이터를 전송하여 저장한다
			filterOut.writeInt(123);
			filterOut.writeDouble(12.4);
			filterOut.writeInt(456);
			filterOut.writeDouble(56.78);
			
			//필터스트림을 통해 바이트 단위가 아니라 int,double과 같은 기본 자료형 단위로 데이터를 읽는다
			DataInputStream filterIn = new DataInputStream(new FileInputStream(src));
			
			int num1 = filterIn.readInt(); // 정수를 읽어옴
			double dNum1 = filterIn.readDouble(); //실수를 읽어옴
			int num2 = filterIn.readInt();
			double dNum2 = filterIn.readDouble();
			
			// 개발자 로그 확인용
			System.out.println("num1="+ num1);
			System.out.println("dNum1="+ dNum1);
			System.out.println("num2="+ num2);
			System.out.println("dNum2="+ dNum2);
			
			//모든 작업이 완료되면 스트림 소멸시킨다.
			if(filterOut!=null) filterOut.close();
			if(filterIn!=null) filterIn.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("해당 파일 없음");
		}
		catch(IOException e)
		{
			System.out.println("IO오류발생");
		}

	}

}
