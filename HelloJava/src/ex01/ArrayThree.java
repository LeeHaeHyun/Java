package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayThree
{
	public static void main(String[] args)
	{
		/*
		3. 과목 이름을 입력받아 해당 과목 점수를 출력해주는 프로그램을 작성해보자.
		없는 과목을 입력하면 "입력한 과목"은 없는 과목입니다.를 출력하면서
		무한반복을 하다가 "그만"을 입력받으면, 프로그램이 종료된다.*/
		
		System.out.println("점수를 조회할 과목명을 입력하세요: ");
		//문자열 형태 subject 배열 목록
		String[] subject = {"국어", "영어", "수학", "사회", "과학", "도덕"}; 
		//int 정수 형태 score 배열 목록
		int[] score = {80, 81, 94, 56, 14, 25};
		Scanner scan = new Scanner(System.in); // 입력값 받기
		
		while(true) // 무한반복하면 while을 떠올려라!
		{		
			String input = scan.next(); // 입력한 값을 input이란 문자열 형태로 저장
			for(int i=0; i<subject.length; i++) // subject 배열 길이만큼 반복 탐색
			{				
				if (subject[i].equals(input)) // subject 안의 문자열이 입력한 문자열과 일치할 경우
				{
					//그 배열의 i번째과 score배열의 i번쨰 내용을 출력
					System.out.println(subject[i]+"의 점수는? " + score[i]+"점!");

				}						
			}  
			// 반복 출력되지 않도록 for문 밖에다가 적는다
			// subject의 배열 내용인 input 그리고 그만이 아닐경우(!) 
			if (!(Arrays.asList(subject).contains(input)) && (!(input.equals("그만"))))
			{
				// 출력!
				System.out.println(input + "은(는) 없는 과목입니다.");	
			}
	        if (input.equals("그만")) // 그만이면
	        {
	        	System.out.println("프로그램이 종료됩니다.");	
	        	scan.close(); // 사용자 입력값 그만 받기(프로그램 끄기!!)
	            break;
	        }
	       
		}	
	}
}