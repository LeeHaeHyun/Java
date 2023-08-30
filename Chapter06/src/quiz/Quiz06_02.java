//문제 06-02
//학생 한 명의 전체 평균점수에 대한 학점을 출력하는 프로그램을 작성하라.
//실행시 국어, 영어, 수학의 점수를 차례로 입력받은 후 평균을 구한 후
//90점이상 A, 80점이상 B, 70점이상 C, 50점이상 D, 그 미만이면 F를 출력한다.

package quiz;

import java.util.Scanner;

public class Quiz06_02
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수:");
		int num1 = scan.nextInt();
		System.out.print("영어 점수:");
		int num2 = scan.nextInt();
		System.out.print("수학 점수:");
		int num3 = scan.nextInt();
		int num4 = (num1 + num2 + num3) / 3;
		System.out.println("평균 점수는 " + num4 + "점 입니다.");
		if (num4 >= 90)
		{
			System.out.println("당신은 A학점 입니다");
		}
		else if (num4 >= 80 && num4 < 90)
		{
			System.out.println("당신은 B학점 입니다");
		}
		else if (num4 >= 70 && num4 < 80)
		{
			System.out.println("당신은 C학점 입니다");
		}
		else if (num4 >= 50 && num4 < 70)
		{
			System.out.println("당신은 D학점 입니다");
		}
		else if (num4 >= 0 && num4 < 50)
		{
			System.out.println("당신은 F학점 입니다");
		}
	}
}
