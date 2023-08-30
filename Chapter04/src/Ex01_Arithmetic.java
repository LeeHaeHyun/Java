public class Ex01_Arithmetic
{
	public static void main(String[] args)
	{
		int num1 = 7;
		int num2 = 3;
		
		// 연산한 int 정수 10
		System.out.println("num1 + num2 = " + (num1 + num2));
		// 문자 10
		System.out.println("num1 + num2 = " + 10);
		
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		
		//나눗셈 1/2는 0이 나온다. int 정수형 계산기라서
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
	}
}
