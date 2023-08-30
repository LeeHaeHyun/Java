import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Buffer가 있으면 빠르다
public class Ex11_BufferedReader
{

	public static void main(String[] args)
	{
		/*
		BufferedReader
			: Scanner와 유사
			속도가 훨씬 빠르기 때문에 많은 양의 데이터를 처리할 때 유리하다
			Enter만 경계로 인식하고 받은 데이터가 String으로 고정되기 때문에
			입력받은 데이터를 가공(형변환)하는 작업이 필요한 경우가 많다.
		 */
		try (BufferedReader br = new BufferedReader(new FileReader("text2.txt")))
		{
			String str;
			
			while(true)
			{
				/*
				개행(줄바꿈)이 등장하기 전까지의 데이터를 한번에 읽어온다.
				즉 한줄씩 읽는다.
				 */
				str = br.readLine(); // 한 줄씩 읽음. 라인 단위로 읽음
				
				//더이상 읽을 내용이 없다면 while 루프를 탈출한다 null
				if (str == null)
					break;
				/*
				입력시 newLine()을 통해 줄바꿈 정보가 입력되지만,
				읽어들인 문자열에는 줄바꿈 정보가 포함되지 않는다.
				따라서 줄바꿈을 하려면 printIn()을 사용해야한다
				즉, 입력시 줄바꿈 정보는 문자열을 라일별로 구분하는 용도로만 사용된다
				 */
				System.out.println(str); // 하나 출력하면 다음으로 넘어가게 println
			}
		}
		catch(IOException e) //IOException 반드시 해야함
		{
			e.printStackTrace();
		}
	}
}
