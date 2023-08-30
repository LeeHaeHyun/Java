public class Ex09_Order
{
	public static void main(String[] args)
	{
//		연산자 우선순위
//		printIn : 내용 출력 후 enter ( 줄바꿈 )
//		print : 출력만 한다. 줄바꿈 필요하면 \n 추가
//		\n = LF ( 아스키 코드:10 )
		
		System.out.println();
		System.out.print("\n");
		System.out.println("--------------");
		
		int num = 5;
		
		System.out.println(num + '\n');
		System.out.println("--------------");
		// 결과 '5\n' 특수문자(\n)가 있으므로 줄바꿈
		
		System.out.print(num + "\n");
		
		// 논리연산자인 ( 3 >= 2 )이 먼저 계산
		System.out.println("3 >= 2 : " + (3 >= 2));
		
		// 비교를 할 수 없다
		// "3>=2 : 3"으로 두 문자열이 먼저 합해짐
//		System.out.println("3 > =2 :" + 3 >= 2);		
	}
}
