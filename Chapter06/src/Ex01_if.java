public class Ex01_if
{
	public static void main(String[] args)
	{
		// if문
		int num = 100;
		
		if (num > 50)
		{
			System.out.println("num 변수의 값이 50보다 큽니다.");
		}
		
		// 한 줄만 실행하면 중괄호를 생략 가능
		if (num > 50)
			System.out.println("num 변수의 값이 50보다 큽니다.");

		// 같은 줄에 작성 가능, 문장의 끝은 세미콜론(;)
		if (num > 50) System.out.println("num 변수의 값이 50보다 큽니다.");
		
		// 조건이 충족되지 않아서 실행 안됨
		if (num < 50)
			System.out.println(num);
		
		// 바로 위에서 세미콜론(;)으로 인해 if문이 끝나서 아래 프린트가 출력된다. 
		// 의도치 않은 결과가 발생
		// 중괄호를 해야 하는 이유
			System.out.println("num 변수의 값이 50보다 작습니다.");

		// if~else문
			
		if (num > 120)
		{
			System.out.println("num 변수의 값이 50보다 큽니다.");			
		} else
		{
			System.out.println("num 변수의 값이 50보다 작습니다.");
		}
	}
}
