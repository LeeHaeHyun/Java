//문제 1 : 02-01
//사용자로부터 두 개의 정수를 입력받아서 사칙연산에 대한 결과를 출력하는 프로그램을 작성하라.

package quiz;

import java.util.Scanner;

public class Quiz02_01
{

	public static void main(String[] args)
	{
		try
		{
			System.out.println("정수를 두 개를 입력하고 엔터를 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			System.out.println(num1 + " X " + num2 + " = " + (num1 * num2));
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) + " (몫)");
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2) + " (나머지)");		
		}
		catch(Throwable e)
		{
			System.out.println("잘못된 입력입니다");
		}
		System.out.println("프로그램을 재실행하시면 연산을 다시 시작합니다");
	}
}
