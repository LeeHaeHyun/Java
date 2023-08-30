//문제 3 : 02-03
//두 개의 정수를 입력받아서 다음과 같은 출력결과를 만들어보자.
//출력예) 두개의 정수를 입력하세요.
//25    4 
//25 나누기 4 의 몫은 6 입니다.
//25 나누기 4 의 나머지는 1 입니다.

package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz02_03
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("정수 2개를 입력하시면 나눗셈을 출력합니다.");
			Scanner scan = new Scanner(System.in);
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			System.out.println(num1 + " 나누기 " + num2 + "의 몫: " + (num1 / num2));
			System.out.println(num1 + " 나누기 " + num2 + "의 나머지: " + (num1 % num2));
		}
		catch(ArithmeticException e) // 0을 입력했을 때 실행
		{
			System.out.println("0은 나눌 수가 없습니다.");
		}
		catch(InputMismatchException e) // 문자 및 잘못 입력
		{
			System.out.println("잘못된 입력입니다.");
		}
		System.out.println("나눗셈을 다시 하려면 프로그램을 재실행해주세요.");
	}
}
