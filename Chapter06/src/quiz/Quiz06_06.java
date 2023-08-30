//문제 06-06
//사용자로부터 다음 순서대로 정수를 입력받은 후 평균을 구하여 출력하는 프로그램을 작성하시오.
//몇개의 정수를 입력할 지 사용자로부터 입력받는다.
//입력받은 숫자만큼 정수를 입력받는다.(1번에서 3이라고 입력했다면 3개의 정수를 입력받아야 한다)
//입력받은 숫자들의 평균값을 구하여 출력한다. 평균값은 소수점 이하까지 계산해야 한다.


package quiz;

import java.util.Scanner;

public class Quiz06_06
{
	public static void main(String[] args)
	{
		int num; int num1; int count = 0; int result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 개의 정수를 더할까요?: "); //정수를 입력 받음
		num = scan.nextInt(); 
		while (count < num) // num 개수만큼 실행하는 조건
		{
			System.out.println("정수 입력: "); // 더할 정수를 입력
			num1 = scan.nextInt(); 
			result += num1; //num1이 더한만큼 result에 누적
			count++; // 조건을 빠져나갈 증감식
		} 
		Double end = (double)(result / num);
		System.out.println("입력한 정수의 평균값: " + end);
	}
}
