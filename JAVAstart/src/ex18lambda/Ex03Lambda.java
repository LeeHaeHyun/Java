package ex18lambda;

/*
 람다식으로 구현하기
 : 객체지향 프로그램에서는 메소드를 선언하기 위해 반드시 클래스를 정의해야 한다
 이런 불편함으로 함수형 프로그래밍의 장점이 대두 그래서 람다식을 지원
 */

// 람다식 정의를 위한 인터페이스 정의
interface ISchool3
{
	void studyLambda(String str);
}

public class Ex03Lambda
{
	public static void main(String[] args)
	{
		/*
		이전 예제의 익명클래스를 다음과 같은 람다식으로 표현
		부모 인터페이스로부터 오버라이딩 했으므로 동일한 이름인것을 알고 있다
		 */
		ISchool3 sch1 = (String str) -> {      // ISchool3가 오버라이딩 된 형태
			System.out.println(str + "을 드디어 써보네요...!!");
		};
		// 추상메소드의 이름을 통해 람다식을 호출 
		// ( ISchool3가 오버라이딩이 되었기에 ISchool3 sch1 액션이 실행된다[가려진다] )
		sch1.studyLambda("람다식");
		
		/*
		앞의 람다식을 한번 더 줄이면 다음과 같이 표현
		실행문 1개면 중괄호도 생략할 수 있다.
		 */
		ISchool3 sch2 = str -> System.out.println(str+ " 완전 간단..!!");
		sch2.studyLambda("람다식");
	}
}