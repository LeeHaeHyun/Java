import java.util.Scanner;

public class Ex05_Exception
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			int num1 = sc.nextInt();
			int num2 = 10 / num1;
			System.out.println(num2);
		}
		catch(Exception e) // 한꺼번에 처리가능 이부분만 바뀜
		{
			/*
			Exception 클래스는 모든 예외 클래스의 부모이므로 catch절의 마지막에 기술해야 한다
			위로 이동시키면 에러가 발생한다.
			 */
//			System.out.println(e.getMessage());
//			e.printStackTrace();
			System.out.println("잘못 입력 하셨습니다.");
		}
		System.out.println("Good bye~~!");
	}
}
