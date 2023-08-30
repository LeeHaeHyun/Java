public class Ex01_printf
{
	public static void main(String[] args)
	{
		// 문자열을 저장할 때 사용하는 자료형 String
		//홍길동 앞에 new가 생략되어 있다.
		//name에는 주소값이 들어가있습니다. ( 문자열이 들어가있지 않다 )
		
		String name = "Hong Gil Dong";
		int age = 20;
		double height = 175.7;
		
		//printf : 줄바꿈 기능이 없어 \n또는 %n를 이용해서 줄바꿈
		//&n는 printf()에서만 사용할 수 있다.
		
		System.out.printf("%s의 나이는 %d이고, 키는 %f입니다.\n", name, age, height);
		
		//실수를 출력하면 너무 길어서 소수점 아래 2자리까지 출력 [%.2f]
		System.out.printf("%s의 나이는 %d이고, 키는 %.2f입니다.%n", name, age, height);
	}
}
