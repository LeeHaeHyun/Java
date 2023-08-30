package ex20io;

import java.io.BufferedReader;
import java.io.FileReader;

public class E09StringReader
{

	public static void main(String[] args)
	{
		try {
			// 문자열을 읽기 위한 입력스트림 생성
			BufferedReader in = new BufferedReader(new FileReader("src/ex20io/String.txt"));
			
			String str;
			while(true)
			{
				/*
				 개행(줄바꿈)이 등장하기 전까지의 데이터를 한번에 읽어온다.
				 즉, 한줄씩 읽는다.
				 */
				str = in.readLine();
				
				// 더이상 읽는 내용이 없다면 while루프를 탈출한다.
				if(str==null)
				{
					break;
				}
				
				/*
				 입력시 nextLine()을 통해 개행정보가 입력되지만,
				 읽어드린 문자열에는 개행정부가 포함되지 않는다. 따라서
				 개행을 하려면 printIn()을 사용해야 한다. 
				 */
				System.out.println(str);
			}
			in.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
