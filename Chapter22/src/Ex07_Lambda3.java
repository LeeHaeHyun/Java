/*
람다식으로 구현하기
: 객체 지향 프로그래밍에서는 메소드를 선언하기 위해 반드시 클래스를 정의
이러한 불편함 때문에 함수형 프로그래밍의 장점이 대두되었고
자바 문법의 단점을 보완하기 위해 람다식을 지원하게 되었다.
 */

//람다식 정의를 위한 인터페이스 정의
interface Unit7
{
	void move(String s);
}

public class Ex07_Lambda3
{
	public static void main(String[] args)
	{

		/*
		익명클래스로 표현
		1. 함수명을 제거한다
		2. 람다식임을 표현하기 위해 소괄호와 중괄호 사이에 화살표를 삽입
		좌측이 부모참조변수가 우측의 자식영역을 참조한다는 개념
		 */
//		Unit7 unit = new Unit7() { // 익명 클래스. 부모 이름으로 new하면 됨
//
//			@Override
//			public void move(String s) // 오버라이딩
//			{
//				System.out.println(s);
//			}
//		};
		
		// (String s)의 값을 함수 {}을 이용해서 unit에 넣어라
		// (String s)에서부터 }; 여기까지를 람다식
		Unit7 unit = (String s) -> // 람다식으로 변경
			{ 
				System.out.println(s); // 오버라이딩
			}; 
		
		// 추상메소드의 이름을 통해 람다식을 호출한다.
		unit.move("Lambda : Unit 7"); 
	}
}
