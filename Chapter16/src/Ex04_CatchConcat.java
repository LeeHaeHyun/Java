import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04_CatchConcat
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		/*
		예외가 발생할 수 있는 지역을 try문으로 먼저 묶어준다
		 */
		try
		{
			int num1 = sc.nextInt();
			/*
			예외가 발생되는 지점
			해당 코드가 실행될때 예외가 발생하게 되고 JVM 예외객체를 생성해서 프로그램을 던진다
			 */
			int num2 = 10 / num1;
			System.out.println(num2);
		}
		catch(ArithmeticException | InputMismatchException e) // 여러개의 예외 실행 발생
		{
			/*
			 JVM이 던진 예외객체를 Catch절에서 잡아 처리한다. 그러면 예외가 발생되어도 프로그램 실행이 유지
			 */
			
			//간략한 설명을 출력
//			System.out.println(e.getMessage());
			
			// 예외에 대한 디테일한 설명을 출력 ( 가장 많이 사용)
//			e.printStackTrace();
			
			// 개발자가 임의로 메세지를 출력
			System.out.println("잘못 입력하셨습니다.");
		}
		// 예외 처리를 통해 실행의 흐름이 중단되지 않아서 아래 문장이 정상 출력
		System.out.println("Good bye~~!");
	}
}
