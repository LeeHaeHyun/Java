
public class Ex07_Length
{
	public static void main(String[] args)
	{
		String str = "apple";
		/*
		 length() : 문자열의 길이를 반환
		 */
		for (int i = 0; i<str.length(); i++)
		{
			/*
			 charAt(인덱스) : 문자열에서 특정 index에 해당하는 문자 하나를 반환. index는 배열과 같이 0부터 시작
			 */
			char ch = str.charAt(i);
			if (ch == 'p' )
				break;
			System.out.println(ch);
		}
	}
}
