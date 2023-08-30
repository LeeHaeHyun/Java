import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09_ThrowsInMethod
{
	public static void myMethod1() 
	{
		myMethod2(); 
	}
	
	public static void myMethod2() throws ArithmeticException, InputMismatchException
	{
		Scanner sc = new Scanner(System.in);
			
		int num1 = sc.nextInt(); //에러 발생 지점
		int num2 = 10 / num1; //에러 발생 지점
		System.out.println(num2);
	}
	
	public static void main(String[] args)
	{
		try
		{
			myMethod1(); //예외 넘어옴
		}
		catch(ArithmeticException | InputMismatchException e)
		{
			e.printStackTrace();
		}
		
		/*
		 앞에서 예외가 발생하더라도 예외처리를 했으므로 프로그램은 끝까지 실행된 후 정상적 종료
		 실행의 흐름이 마지막까지 이어지게 하는 것이 예외처리의 목적이다.
		 */
		System.out.println("--------");
	}
}