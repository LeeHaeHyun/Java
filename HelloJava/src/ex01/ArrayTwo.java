package ex01;

import java.util.Scanner;

public class ArrayTwo
{

	public static void main(String[] args)
	{
		/* 
			2. 길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서 홀수와 짝수를
			구분해서 출력하시오.
		 */
		
		Scanner scan = new Scanner(System.in); // 사용자로부터 정수를 입력받는다
		int[] arr = new int[10]; // 정수 int형 10개 숫자가 들어갈 수 있는 배열 생성
		System.out.println("정수 10개를 입력하시오: ");
		for(int i=0; i<10; i++) // 전체 배열을 확인한다 (반복문으로)
		{
			arr[i] = scan.nextInt(); //(사용자가 입력한 값을 arr배열에 저장한다.)
			
		}
		System.out.println("========================"); // 보기 좋게 구분하기 위한 선
		System.out.print("나는 홀수: "); // 홀수 안내하기 위한 문자열 (for문 밖에다 만듬)
		for(int i=0; i<10; i++) // 전체 배열을 다시 확인한다 (반복문으로)
		{
			if(arr[i] % 2 == 1) // 홀수의 조건: 2로 나누었을때 나머지가 1
			{
				System.out.print(arr[i] + " "); // 연속되어 입력하기 위해 print로 사용 후 스페이스바
			}
		}
		System.out.println(" "); // 한줄 띄기 위한 공백
		System.out.println("========================"); // 보기 좋게 구분하기 위한 선
		System.out.print("나는 짝수: "); // 짝수 안내하기 위한 문자열 (for문 밖에다 만듬)
		for(int i=0; i<10; i++) // 전체 배열을 다시 확인한다 (반복문으로)
		{
			if(arr[i] % 2 == 0) // 짝수의 조건: 2로 나누었을때 나머지가 0
			{
				System.out.print(arr[i] + " "); // 연속되어 입력하기 위해 print로 사용 후 스페이스바
			}
		}
		System.out.println(" "); // 한줄 띄기 위한 공백
		System.out.println("========================"); // 보기 좋게 구분하기 위한 선
	}
}
