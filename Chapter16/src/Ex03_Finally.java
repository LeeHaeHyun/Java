import java.util.InputMismatchException;
import java.util.Scanner;

/*
 finally절
 : 예외발생과 상관없이 try문으로 진입했을때 반드시 실행해야할 코드
 */
public class Ex03_Finally
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
				System.out.println("숫자가 아닙니다.");
//			e.printStackTrace(); //개발자들이 보는 메세지, 어떤 오류 메세지인지 자세하게 출력 
		}
		finally 	// 예외가 끝나면 무조건 실행하게 함
		{
			/*
			 try절에서 예외가 발생하더라도 혹은 return을 만나게 되도 finally절은 실행된다.
			 */
			System.out.println("Good bye~~!");
		}
	}
}
