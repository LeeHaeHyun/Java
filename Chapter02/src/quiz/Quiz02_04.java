//문제 4 : 02-04
//사용자로부터 두 개의 정수를 입력받아서 큰 값을 출력하는 프로그램을 작성하라.

package quiz;

import java.util.Scanner;

public class Quiz02_04
{

	public static void main(String[] args)
	{
		try
		{
		System.out.println("정수 두 개를 입력하시면 크기를 비교합니다.");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if (num1 > num2)
		{
			System.out.println("입력한 숫자: "+ num1 + "와(과) " + num2);
			System.out.println(num1 + "이 더 큽니다");
		}
		else
		{
			System.out.println("입력한 숫자: "+ num1 + "와(과) " + num2);
			System.out.println(num2 + "이 더 큽니다");
		}
		}
		catch (Throwable e)
		{
			System.out.println("두 정수만 입력이 가능합니다.");
		}
		System.out.println("다시 실행하려면 프로그램을 재실행해주세요.");
	}
}
