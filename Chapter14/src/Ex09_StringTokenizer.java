import java.util.StringTokenizer;

public class Ex09_StringTokenizer
{

	public static void main(String[] args)
	{
//		StringTokenizer st1 = new StringTokenizer("a b c"); // 공백기준 분할
		StringTokenizer st2 = new StringTokenizer("1,2,3",","); //"," (구분자 쉼포)
//		StringTokenizer st3 = new StringTokenizer("1|2|3","|"); 
				
		while (st2.hasMoreTokens()) // 토큰이 있으므로 true
		{
			System.out.println(st2.nextToken());
		}
	}

}
