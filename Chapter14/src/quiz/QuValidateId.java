//문제1] 파일명 : QuValidateId.java
//사용자로 부터 아이디를 입력받은 후 다음 조건에 만족하는지 확인할 수 있는 프로그램을 작성하시오.
//아이디는 8~12자 사이로만 사용할 수 있다. (length() 메서드 활용)
//영문과 숫자로만 입력할 수 있다. (charAt() 메서드 활용)
//특수기호, 공백, 그 외 모든 문자는 입력할 수 없다. 
//위 조건에 만족하면 true, 만족하지 않으면 false를 반환한다. 
//메서드명 : boolean idValidate(String inputId)
//힌트 : (idChar>='a' && idChar<='z') 이와 같은 조건을 사용하면 된당^^*

package quiz;

import java.util.Scanner;

public class QuValidateId
{

	public static void main(String[] args)
	{
		// 사용자로부터 아이디 입력받기
		System.out.print("아이디를 입력하세요:");
		Scanner scan = new Scanner(System.in);
		String id = scan.nextLine();
		
		// 위 조건은 3개 이상의 다양한 조건이 있다. 조건을 모아 true false로 간단하게 담아서 반환
		// 아이디를 인수로 전달한 후 사용여부에 따라 boolean값을 반환
		boolean isOk = idValidate(id); // 메소드명(매개변수)로 생성한다, 
		if (isOk == true)
		{
			System.out.println("사용할 수 있는 아이디입니다.");
		}
		else
		{
			System.out.println("사용할 수 없습니다.");
		}
	}
	
	 // 메소드 생성후 헤깔릴 수 있으니 매개변수 변경
	static boolean idValidate(String inputId)
	{
		// 아이디 유효성 검증 확인용 변수
		boolean isOk = true;
		
		// 아이디 길이 탐색(8~12)
		if ( inputId.length() >= 8 && inputId.length() <= 12)
		{
			//조건에 해당한다면 그 길이를 반복 탐색
			for (int i=0; i<inputId.length(); i++) // 반복해서 확인한다
			{
				// 각 문자가 영문 또는 숫자인지 확인한다.
				char idchr = inputId.charAt(i); 
//				System.out.printf("인덱스%d:%c\n", i, idchr); // 디버깅 확인용
				
				//아이디가 영문 또는 숫자가 아니라면 false로 반환(아스키코드)
				if( !((idchr >= '0' && idchr <= '9') || (idchr >= 'a' && idchr <= 'z')
						|| (idchr >= 'A' && idchr <= 'Z')) )
				{
					System.out.println(idchr + "=> 허용안됨");
					isOk = false;
					//문자열에서 허용되지 않은 문자를 찾으면 뒷 부분은 검사할 필요가 없다
					//즉시 반복문 for를 탈출한다
					break;
				}
			}
		}
		else
		{
			// 길이가 잘못되었다면 false로 반환
			isOk = false;
		}
		return isOk;
	}
}
