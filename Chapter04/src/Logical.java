public class Logical
{
	public static void main(String[] args)
	{
//		논리연산자
//		&& : 양쪽 모두 true여야 true
//		|| : 논리or, 한쪽만 true면 true
//		! : 논리not
		
		int num1 = 11; // 4바이트
		int num2 = 22; // 4바이트
		boolean result; // 1바이트
		
		result = (num1 > 1) && (num1 < 10);
		System.out.println("1 초과 10 미만인가? " + result);

		result = ((num2 % 2) == 0) || ((num2 % 3) == 0);
		System.out.println("2 또는 3의 배수인가? " + result);
	}
}
