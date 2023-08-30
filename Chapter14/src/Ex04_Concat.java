public class Ex04_Concat
{
	public static void main(String[] args)
	{
		String str1 = "기초"; // 다른 문자열이기에 다른 주소값을 가진다
		String str2 = "프로그래밍";

		/*
		 concat() : 두개의 문자열을 연결할 때 사용. print문에서 +와 동일한 역할
		 */
		String str3 = str1.concat(str2);
		System.out.println(str3);
		
		// 문자열 리터럴에 메소드를 바로 사용할 수 있다.
		String str4 = "자바".concat(str3);
		System.out.println(str4);
	}
}
