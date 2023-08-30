
public class Ex06_ExceptionThrow
{

	public static void myMethod1(int n) // 예외 처리가 없음
	{
		myMethod2(n, 0); // 3,0을 메소드2로 보냄
	}
	
	public static void myMethod2(int n1, int n2)
	{
		int r = n1 / n2; //0으로 나눌 수 없음, 예외 발생 지점. 예외처리 없음
		
	}
	
	public static void main(String[] args)
	{
		myMethod1(3); // 예외 처리 없음, 예외를 jvm으로 던짐. 실행 종료
		System.out.println("Exception Throw !!!"); // 그래서 실행이 안됨
	}
}
