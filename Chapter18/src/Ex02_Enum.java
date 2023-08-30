/*
열거형 - 클래스처럼 보이게 하는 상수
- enum 클래스 형을 기반으로 한 클래스형 선언
- enum 열거형 이름 { 상수명1, 상수명2 ... }
- 클래스의 static 변수를 참조하는 것과 동일
 */
enum Human2 { MAN, WOMAN }

enum Machine2 { TANK, AIRPLANE }

public class Ex02_Enum
{
	public static void main(String[] args)
	{
		createUnit(Machine2.TANK);
		
		//createUnit(Human2.MAN); // 잘못된 상수 사용 : 에러

		// 참고: C처럼 숫자로 비교하면 에러가 난다
//		if (Human2.MAN == 0) {} ==> 객체이므로 맞지 않음
	}

	public static void createUnit(Machine2 kind) // machine2로 잡아놨음
	{
		switch(kind)
		{
		//case Machine2.Tank:
		//enum을 사용해 Machine2 생략 가능
		case TANK: 
			System.out.println("탱크를 만듭니다.");
			break;
		case AIRPLANE: 
			System.out.println("비행기를 만듭니다.");
			break;
		}
	}
}
