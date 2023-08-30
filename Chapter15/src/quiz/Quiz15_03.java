//문제3
//길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서 홀수와 짝수를
//구분해서 출력하라.
//
//출력예시) 총 10개의 숫자를 입력하시오.
//1 2 3 ....... 10개입력
//홀수 : 1, 3, 5, 7
//짝수 : 2, 4, 6, 8, 10

package quiz;

import java.util.Scanner;

public class Quiz15_03
{
	public static void main(String[] args)
	{
		int[] num = new int[10];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 10개를 입력하세요.");
		
		for (int i=0; i<num.length; i++)
		{		
			num[i] = scan.nextInt();
		}
		System.out.println("==========================");
		
		System.out.print("짝수: ");
		for (int i=0; i<num.length; i++)
		{
			
			if( num[i] % 2 == 0 )
			{
				System.out.print(num[i] + " ");
			}
		}
		System.out.println();
		System.out.println("==========================");
		
		System.out.print("홀수: ");
		for (int i=0; i<num.length; i++)
		{
			
			if( num[i] % 2 == 1 )
			{
				System.out.print(num[i] + " ");
			}
		}
		System.out.println();
		System.out.println("==========================");
	}
}
