package ex01;

import java.util.Scanner;

public class ArrayFive
{

	public static void main(String[] args)
	{
		/*
		5.주민등록번호 번호를 입력 받아 char 배열에 저장한 후 출력하세요.
		단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 * 로 출력하세요.*/
		
		// 1. 사용자로부터 입력값 받기
		Scanner scan = new Scanner(System.in);
		
		// 2. -를 포함한 주민등록번호 입력받기
		System.out.println("주민등록번호 입력해주세요(-포함): ");
		// 3. 문자열 형태의 jumin 변수에 입력값을 저장
		String jumin = scan.nextLine();
		// 4. char 배열인 변수 bunho에 입력값만큼 하나하나 배열에 담기
		char[] bunho = new char[jumin.length()];
		
		// 5. 반복문 밖에서 출력된 결과 첫 안내
		System.out.print("변환된 주민번호: ");
		// 6. 출력하기 위한 char 배열 탐색
		for (int i=0; i<bunho.length; i++)
		{
			// 7. 성별 다음번째부터 *로 바꿔준다.
			if(i >= 8)
			{
				//8. 성별 번쨰부터 *을 반복해서 바꿔준다.
				bunho[i] = '*';
			}
			// 8. 그 외는 char[] 변수에 담긴 문자를 출력한다.
			else
				bunho[i] = jumin.charAt(i);
			// 9. 총 결과는?
			System.out.print(bunho[i]);
		}
		scan.close(); // 입력을 그만 받는다.

	}

}
