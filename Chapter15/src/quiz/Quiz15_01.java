//문제1
//길이가 5인 int형 배열을 선언해서 사용자로부터 5개의 정수를 입력받는다.	
//그리고 최대값, 최소값, 모든 수의 합을 구하라. 함수(최대,최소,합)를 정의하여 구현하시오.

package quiz;

import java.util.Scanner;

// 배열은 반복문으로 탐색한다
public class Quiz15_01
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		
		System.out.println("정수 5개를 입력하세요.");
		for (int i=0; i<5; i++)
		{
			num[i] = scan.nextInt();
		}
		System.out.println("======================");
		System.out.println("최대값은 : " + maxNum(num));
		System.out.println("최소값은 : " + minNum(num));
		System.out.println("모든수의 합 : " + sum(num));
		System.out.println("======================");
	}
	
	static int maxNum(int[] num)
	{
		int result = num[0]; // 지역변수는 초기화 시키고 사용해야 한다
		for(int i=0; i<5; i++)
		{
			if(result < num[i])
				result = num[i];
		}
		return result;
	}

	static int minNum(int[] num)
	{
		int result = num[0]; // 지역변수는 초기화 시키고 사용해야 한다
		for(int i=0; i<5; i++)
		{
			if(result > num[i])
				result = num[i];
		}
		return result;
	}
	
	static int sum(int[] num)
	{
		int result = 0; // 지역변수는 초기화 시키고 사용해야 한다
		for(int i=0; i<5; i++)
		{
			result =+ num[i];
		}
		return result;
	}
//	public static int big(int[] num)
//	{
//		int big = num[0]; // 지역변수는 초기화 시키고 사용해야 한다
//		for(int i=0; i<num.length; i++)
//		{
//			if(big < num[i])
//				big = num[i];
//		}
//		return big;
//	}
}
