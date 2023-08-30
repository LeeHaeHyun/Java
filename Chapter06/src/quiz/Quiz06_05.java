//문제 06-05
//사용자로부터 계속해서 정수를 입력받는다.
//단 0을 입력받게되면 기존에 입력받은 모든 정수를 더한 후 결과를 출력하시오.


package quiz;

import java.util.Scanner;

public class Quiz06_05
{

	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		int num, count=1, sum=0;
		do
		{
			System.out.println(count+"번째 정수 입력(0 종료):");
			num = scan.nextInt(); //입력 받은 값을 num에 저장
			sum += num; // 입력한 num을 sum에 누적해서 더해감
			count++;
		} while (num != 0); // 0을 입력할 경우 빠져나온다 
		System.out.println("입력한 숫자의 총합: " + sum); // 누적된 값을 보인다.
	}
}
