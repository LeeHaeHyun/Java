package ex01;

import java.util.Scanner;

public class StringID
{
	public static void main(String[] args)
	{
		// 문제1] 파일명 : QuValidateId.java
		// 사용자로 부터 아이디를 입력받은 후 다음 조건에 만족하는지 확인할 수 있는 프로그램을 작성하시오.
		// 아이디는 8~12자 사이로만 사용할 수 있다. (length() 메서드 활용)
		// 영문과 숫자로만 입력할 수 있다. (charAt() 메서드 활용)
		// 특수기호, 공백, 그 외 모든 문자는 입력할 수 없다.
		// 위 조건에 만족하면 true, 만족하지 않으면 false를 반환한다.S

		// 1. 사용자로부터 아이디 입력받고 저장하기
		System.out.print("아이디를 입력하세요:");
		Scanner scan = new Scanner(System.in);
		String id = scan.nextLine();

		// 2. 아이디어: 
		// 3개 이상의 다양한 조건이 있다. 조건을 모두 담아서 
		// 일치하면 스위치 켜짐(true)로 보내고
		// 불일치하면 스위치 꺼짐(false)로 보낸다.
		boolean isOk = idView(id); // 메소드명(매개변수)로 생성한다,
		if (isOk == true)
		{
			System.out.println("사용할 수 있는 아이디입니다.");
		} else
		{
			System.out.println("사용할 수 없습니다.");
		}
	}

	// 3. 메소드 생성후 헤깔릴 수 있으니 매개변수(스트링 형태) 변경
	static boolean idView(String inputId)
	{
		// 4. 아래 조건들에 걸리지 않으면 그대로 true로 반환된다.
		boolean isOk = true;

		// 5. 조건1] 아이디 길이 탐색(8~12)
		if (inputId.length() >= 8 && inputId.length() <= 12)
		{
			// 6. 조건 통과시 다음 조건을 확인하기 위해 반복문
			for (int i = 0; i < inputId.length(); i++) // 반복해서 확인한다
			{
				// 7. 각 문자가 영문 또는 숫자인지 확인한다.
				char idchr = inputId.charAt(i);
//						System.out.printf("인덱스%d:%c\n", i, idchr); // 디버깅 확인용

				// 8. 아이디가 영문 또는 숫자가 아니라면 false로 반환(아스키코드)
				if (!((idchr >= '0' && idchr <= '9') || (idchr >= 'a' && idchr <= 'z')
						|| (idchr >= 'A' && idchr <= 'Z')))
				{
					System.out.println(idchr + "=> 사용불가!");
					isOk = false;
					// 문자열에서 허용되지 않은 문자를 찾으면 뒷 부분은 검사할 필요가 없다
					// 즉시 반복문 for를 탈출한다
					break;
				}
			}
		} 
		else
		{
			// 길이가 잘못되었다면 사용불가 false로 반환
			isOk = false;
		}
		return isOk; 
	}
}
