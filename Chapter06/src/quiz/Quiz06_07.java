//문제 06-07 
//1이상 100미만의 정수 중에서 7의배수와 9의배수를 출력하는 프로그램을 작성하라.
//단, 7의 배수이면서 동시에 9의 배수인 정수는 한번만 출력해야 한다.

package quiz;

import java.util.Scanner;

public class Quiz06_07
{
	public static void main(String[] args)
	{
		// while문을 이용한 반복
		int num = 0; 
		int count = 0;
		System.out.println("정수 입력(63의 배수): ");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		//반복을 위한 조건식 ( 0 ~ i까지의 범위 )
		while ((num++) < i)
		{
			if(((num % 7) != 0) || ((num % 9) != 0))
				continue;
			System.out.println(num);
		}
	}
}
