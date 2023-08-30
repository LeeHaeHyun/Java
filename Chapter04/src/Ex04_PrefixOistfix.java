public class Ex04_PrefixOistfix
{
	public static void main(String[] args)
	{
		int num = 10;
		System.out.println(++num); //num의 값이 하나 증가 후 출력
		System.out.println(num); // 증가되어있는 상태 그대로 출력
		
		System.out.println(num++); // 출력 후에 값이 증가
		System.out.println(num); // 증가되어 있는 num을 그대로 출력
		
//		int result = num++; 이렇게 사용하지 말 것, 의미가 없다
//		다음처럼 반복문에서 단독으로 사용하는 것이 좋습니다
		
//		int num=0;
//		while (num > 10)
//		{
//			++num;			
//		}
		
//		for(int i = 0; i<10; i++)
//		{
//			
//		}
		
		int num1 = 7;
		int num2, num3;
		num2 = ++num1; // 1증가 후 대입
		
		num3 = --num1; // 1감소 후 대입
		
		System.out.println("전위증가/감소시");
		System.out.printf("num1=%d, num2=%d, num3=%d", num1, num2, num3);
		
		num1 = 7;
		num2 = num1++; // 대입 후 1 증가
		
		num3 = num1--; // 대입 후 1 감소
		System.out.println();
		System.out.println("후위증가/감소시");
		System.out.printf("num1=%d, num2=%d, num3=%d", num1, num2, num3);
	}
}
