package ex01;

import java.util.Scanner;

public class ArrayOne
{
	public static void main(String[] args)
	{
		/*
		1. 길이가 5인 int형 배열을 선언해서 사용자로부터 5개의 정수를 입력받는다.
		그리고 최대값, 최소값, 모든 수의 합을 구하라. 함수(최대,최소,합)를 정의하여 구현하시오.
		*/
		System.out.println("5개의 정수를 입력해주세요: "); // 안내 메세지
		Scanner scan = new Scanner(System.in); // 사용자로부터 입력값을 받음
		int[] arr = new int[5]; // int형 배열 5칸 생성
		
		for (int i=0; i<5; i++) // 배열의 내용을 확인하기 위한 반복문
		{
			arr[i] = scan.nextInt(); // 전체 베열 scan에 저장함
		}
		System.out.println("======================"); // for문이 끝나면 출력되게 함
		System.out.println("최대값은 : " + maxN(arr));
		System.out.println("최소값은 : " + minN(arr));
		System.out.println("모든수의 합 : " + sum(arr));
		System.out.println("======================");
	}

	public static int sum(int[] arr) // 합계를 출력하는 메소드
	{
		int num = arr[0]; // 지역변수를 사용하기 위해 num을 초기화 시킨다.
		for(int i=0; i<5; i++)
		{
			num += arr[i]; // 누적해서 더해간 것을 반환
		}
		return num;
	}

	public static int minN(int[] arr)
	{
		int num = arr[0]; // 지역변수를 사용하기 위해 num을 초기화 시킨다.
		for (int i=0; i<5; i++)
		{
			if(num > arr[i]) // 배열을 비교해서 작은 것을 minN 메소드에 num에 넣어 반환 
			{
				num = arr[i];
			}
		}		
		return num;
	}

	public static int maxN(int[] arr)
	{
		int num = arr[0]; // 지역변수를 사용하기 위해 num을 초기화 시킨다.
		for (int i=0; i<5; i++)
		{
			if(num < arr[i]) // 배열을 비교해서 큰 것을 maxN 메소드에 num에 넣어 반환 
			{
				num = arr[i];
			}
		}
		return num;
	}
}

