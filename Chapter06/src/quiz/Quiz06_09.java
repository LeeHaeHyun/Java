//문제 06-09
//사용자로부터 정수 하나를 입력받은 후 그 수에 해당하는 구구단을 역순으로 출력하시오.	

package quiz;

import java.util.Scanner;

public class Quiz06_09
{

	public static void main(String[] args)
	{
		System.out.println("입력한 숫자의 구구단 출력: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int dan = num; dan <= num; dan++) // 단을 입력한 단부터 시작하여, 입력한 단까지를 출력
		{
			for (int su = 9; su >= 1; su--) // 9단부터 시작하여 1개씩 작아지면서 1까지 출력
			{
				System.out.print(dan + "*" + su + " = "  + (dan*su));
				System.out.println();
			}
		}

	}

}
