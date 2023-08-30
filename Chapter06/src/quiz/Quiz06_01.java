/*문제 06-01
두 개의 정수를 입력 받아서 두 수의 차를 출력하는 프로그램을 작성하라.
단 입력된 두 수의 순서에 상관없이 출력결과는 항상 0 이상이어야 한다.
1과2를 입력했다면 1 .... 20과10을 입력했다면 10 ....
*/

package quiz;

import java.util.Scanner;

public class Quiz06_01
{

	public static void main(String[] args)
	{
		try
		{
			System.out.println("두 개의 정수를 입력하시면 뺄셈을 출력합니다.");
			Scanner scan = new Scanner(System.in);
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			if (num1 > num2)
			{
				System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			}
			else
			{
				System.out.println(num2 + " - " + num1 + " = " + (num2-num1));
			}
		}
		catch(Throwable e)
		{
			System.out.println("정수만 입력이 가능합니다.");
		}	
		System.out.println("뺄셈을 다시 하려면 프로그램을 재실행해주세요");
	}
}