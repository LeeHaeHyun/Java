//문제 5 : 02-05
//사용자로부터 두 개의 정수를 입력받아서 곱한 값의 결과를 절대값으로 출력하는 프로그램을 작성하라.

package quiz;

import java.util.Scanner;

public class Quiz02_05
{

	public static void main(String[] args)
	{
		try
		{
		System.out.println("두 정수를 입력하시면 곱셈 후 절대값을 출력합니다.");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = (num1 * num2);
		System.out.println(num1 + " X " + num2 + " = " + num3);
		System.out.println("절대값: " + Math.abs(num3)); // 정수 절대값 구하는 math 함수
		}
		catch(Throwable e)
		{
			System.out.println("정수만 입력이 가능합니다.");
		}
		System.out.println("프로그램을 재실행하여 다시 시도해주세요.");
	}
}
