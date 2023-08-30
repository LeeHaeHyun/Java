
public class Ex02_RefCompare
{
	public static void main(String[] args)
	{
		String str1 = new String("자바프로그래밍");
		String str2 = new String("자바프로그래밍");
		String str3 = "자바프로그래밍";
		String str4 = "자바프로그래밍";
		
		/*
		str1, str2는 스트링 객체의 참조값을 가지고 있으므로
		참조값(주소값)에 대한 비교를 하게 된다. new가 들어가면 방을 각자
		따로 생성하므로 다른 주소값을 가진다
		 */
		
		if (str1 == str2) // ==(같다) : stack 영역에 있는 값을 비교
			System.out.println("str1과 str2는 동일 객체 참조");
		else
			System.out.println("str1과 str2는 다른 객체 참조");
		
		// 하나의 메모리를 공유하므로 같다라는 결과 출력
		if (str3 == str4)
			System.out.println("str3과 str4는 동일 객체 참조");
		else
			System.out.println("str3과 str4는 다른 객체 참조");
	}
}
