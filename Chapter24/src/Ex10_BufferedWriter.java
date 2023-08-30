import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex10_BufferedWriter
{
	public static void main(String[] args)
	{
		String str1 = "동해물과 백두산이 마르고 닳도록";
		String str2 = "하느님이 보우하사 우리나라 만세";
		String str3 = "무궁화 삼천리 화려강산 대한사람 대한으로 길이보전하세";
		
		/*
		BufferedWriter
			: System.out.printIn();과 유사
			속도는 훨씬 빠르기 때문에(입력한 데이터가 바로 전달되지 않고
			버퍼를 거쳐 전달되므로 데이터 처리 효율성을 높임)
			많은 양의 데이터를 처리할 때 유리하다.
		 */
		/*
		문자열을 저장하기 위한 출력스트림의 생성
		문자열의 입력은 버퍼에 따라 성능의 차이가 크기 때문에
		버퍼 필터 스트림을 추가적으로 연결해서 사용 ( FileWriter )
		 */
		try (BufferedWriter bw =
				new BufferedWriter(new FileWriter("text2.txt")))
		{
			/*
			Write를 통해 문자열 저장하고 newLine을 통해 '줄바꿈'을 한다
			\n은 허용되지 않는 곳이 있을 수 있기 때문에
			 */
			bw.write(str1, 0, str1.length());
			bw.newLine(); // OS에 맞는 라인을 넣어서 줄바꿈, 문자를 스트림으로 저장
			bw.write(str2, 0, str2.length());
			bw.newLine();
			bw.write(str3, 0, str3.length());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
