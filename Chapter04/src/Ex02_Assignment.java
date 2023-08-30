
public class Ex02_Assignment
{
	
	public static void main(String[] args)
	{
//		복합대입연산자는 형변환을 안해줘도 되는 것이 장점
//		10은 int 4바이트지만 short 선언되었으므로 2바이트로 자동형변환
		
		short num = 10;
		num += 77L; // 형변환 없이 연산이 수행된다 ( 장점 )
		System.out.println(num);
		
		num = 10;
		num = (short)(num + 77L); // 이렇게 하는 것이 정상, 3번의 형 변환 필요
		System.out.println(num);
		
		int n = 5;
//		정수와 실수를 연산하면 실수의 결과가 나오므로 n의 대입할 수가 없어 에러
//		n = n * 2.7;
//		위 구문을 정상적으로 처리하기 위해서는 아래와 같이 강제형변환
		
		n = (int)(n*2.7);
		System.out.println(n);
		
//		복합대입연산자는 사용하면 문법의 구조상 
//		변수의 기존자료형을 그대로 유지하는 특성이 있다
//		따라서 연산의 결과는 정수
//		만약 (int)2.7 이후에 계산한다면 
//		2를 곱하게 되므로 2.7을 곱했을 때와 다른 결과가 나올 수 있다
//		그래서 생각해야 함
		n = 5;
		n = n*(int)2.7;
		System.out.println(n);
		
		n = 5;		
		n *= 2.7;
		System.out.println(n);
	}
}
