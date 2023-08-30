import java.util.InputMismatchException;
import java.util.Scanner;

/*
예외가 발생한 지점에서 예외를 직접 처리한다 개발시 가장 많이 사용되는 방법
try~catch문을 통해 예외가 발생될 수 있는 지점을 명시적으로 알 수 있다.
 */
public class Ex02_TryCatch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			int num1 = sc.nextInt();
			int num2 = 10 / num1;
			System.out.println(num2);
			System.out.println("Good bye~~!");
		}
		catch(ArithmeticException e) // 0을 입력했을 때 실행
		{
			String str = e.getMessage();
			System.out.println(str); // 로그 확인용
			if(str.equals("/ by zero"))
				System.out.println("0으로 나눌 수 없습니다."); // 우리가 만든 메세지가 나감
		}
		catch(InputMismatchException e) // import 안하면 에러, 정수 값이 아니면 실행
		{
			System.out.println(e.getMessage());
			
			// 우리가 만든 메세지가 나감 (고객들이 보는 메세지)
			System.out.println("숫자가 아닙니다.");
//			e.printStackTrace(); //개발자들이 보는 메세지, 어떤 오류 메세지인지 자세하게 출력 
		}
	}
}
