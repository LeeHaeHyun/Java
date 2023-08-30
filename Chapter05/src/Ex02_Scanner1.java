// Scanner 클래스 임포트, 컨트롤+쉬프트+o
import java.util.Scanner;

public class Ex02_Scanner1
{

	public static void main(String[] args)
	{
//		Scanner 클래스
//		: nextLine() : 문자열 입력받는 매서드
//		: nextInt() : 정수를 입력받는 매서드
		Scanner sc = new Scanner(System.in); 
		// 입력을 받는 곳, 주소값이 sc에 저장된다
		
		System.out.println("숫자를 1 2 3 이렇게 입력하고 엔터를 입력하세요.");
		//입력대기
		//숫자 입력하고 공백(스페이스)이나 탭으로도 구분됨
		
		int num1 = sc.nextInt(); //저장할 곳
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.print("숫자를 1 입력하고 엔터를 입력해주세요 :");
		int num4 = sc.nextInt();
		System.out.print("숫자를 2 입력하고 엔터를 입력해주세요 :");
		int num5 = sc.nextInt();
		System.out.print("숫자를 3 입력하고 엔터를 입력해주세요 :");
		int num6 = sc.nextInt();
		
		System.out.printf("%d %d %d %d %d %d", num1, num2, num3, num4, num5, num6);
//		sc.close(); 반복문에서 잘못쓰면 1번밖에 실행이 안될 수도 있다.
	}
}
