//메서드는 class 내부에 정의
//메서드 안에 다른 메서드를 정의할 수 없다.
//반환값이 없으면 반드시 void 선언해야 한다
//
//클래스명은 대문자로 시작하는 camel case로 작성
//메서드 혹은 변수명 > 소문자로 시작한다
//상수명은 전체 대문자로 쓴다
//패키지명은 전체를 소문자로 기술하고 연결단어는 .(닷)으로 구분한다.

public class Ex02_ReturnForExit
{
	public static void main(String[] args)
	{
		devide(4, 2);
		devide(6, 2);
		devide(8, 0);
	}
	
	public static void devide(int num1, int num2)
	{
		if (num2 == 0)
		{
			System.out.println("0으로 나눌 수 없습니다.");
			return; // 메서드 종료
		}
		
		System.out.println("나눗셈 결과: " + (num1 / num2));	
	}
}
