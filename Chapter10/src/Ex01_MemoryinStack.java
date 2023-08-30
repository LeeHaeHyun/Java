/*
 디버깅하며 배우는 스택 영역 원리
 */
public class Ex01_MemoryinStack
{

	public static void main(String[] args) //[toggle breakpoint]를 선택
	{
		int num1 = 10; // step over
		int num2 = 20;
		int num3 = adder(num1, num2); // step into
		System.out.println("-------------------");
	}
	
	public static int adder(int n1, int n2)
	{
//		n1=10, n2=20 입력됨
		int result = n1 + n2; // n1, n2는 지역변수
		return result;
	}
}
