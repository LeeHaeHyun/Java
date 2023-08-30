//문제 06-10
//사용자로부터 5개의 정수를 입력받아서 합을 구하여 출력한다.
//만약 입력받는 숫자가 1미만의 숫자라면 재입력을 요구해야 한다. 
//그래서 1이상의 정수 5개를 입력받아야 프로그램이 완성된다.

package quiz;

import java.util.Scanner;

public class Quiz06_10
{

	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		int num; int num1; int count = 1; int sum = 0; int count1 = 0;
		System.out.println("몇 개의 정수를 더할까요?: "); 
		num1 = scan.nextInt(); 
		while (count1 < num1)
		{
			System.out.println(count+"번째 정수 입력:");
			num = scan.nextInt(); //입력 받은 값을 num에 저장
			if(num > 0)
			{
				sum += num; // 입력한 num을 sum에 누적해서 더해감
				count++;
				count1++;
			}
			else
			{
				System.out.println("0이상의 수를 입력해주시오.");
				continue;
			}
		System.out.println("입력한 숫자의 총합: " + sum); // 누적된 값을 보인다.
		}
	}
}
