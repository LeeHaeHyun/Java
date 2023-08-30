//문제 2 : 02-02
//하나의 정수를 입력받아서 그 수의 제곱을 출력하는 프로그램을 작성하라. 
//가령 5를 입력받았다면 25가 출력되어야 한다.

package quiz;

import java.util.Scanner;

public class Quiz02_02
{

	public static void main(String[] args)
	{
		try
		{
		System.out.println("하나의 정수를 입력하시면 제곱을 출력합니다.");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println(num1 + "의 제곱" + " = " + (num1 * num1));
		}
		catch(Throwable e)
		{
			System.out.println("정수만 입력이 가능합니다.");
		}
		System.out.println("다시 하시려면 프로그램을 재실행해주세요");
	}
}
