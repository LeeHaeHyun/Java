package ex18lambda;

/*
함수형 인터페이스
: 람다식을 사용하기 위해서 먼저 인터페이스를 만들고 
람다식으로 구현할 추상메소드를 선언합니다.
이를 람다식을 만들기 위한 함수형 인터페이스라고 한다
※ 함수형 인터페이스에는 오직 하나의 추상메소드로만 선언할 수 있다
 */

@FunctionalInterface
//	: 함수형 인터페이스의 조건을 갖추었는지 대한 검사를 컴파일러에게 요청하는 역할

interface ISchool4
{
	// 함수형 인터페이스에는 하나의 추상메소드만 생성할 수 있다
	void studyLambda(String str);
	
	//void studeyLambda2(String str); ※ 함수형 인터페이스는 하나밖에 선언이 안됩니다 
}

public class Ex04FunctionalInterface
{
	static void execute(ISchool4 school4, String s)
	{
		/*
		main에서 선언한 람다식의 참조값을 받은 매개변수 : school4
		ISchool4 인터페이스에 정의된 추상메소드 : studyLambda(String str)
		 */
		school4.studyLambda(s);
	}
	public static void main(String[] args)
	{
		/*
		ISchool4 인터페이스를 구현하여 람다식 생성
		추상메소드를 통해 매개변수 타입을 유추할 수 있어서 (String)을 생략할 수 있다
		 */
		ISchool4 sch = (str) -> System.out.println("ISchool4를 구현받아 정의한 람다입니다."+str);
		
		//sch 참조값을 통해 우리는 람다식의 기능을 사용할 수 있다
		execute(sch, "\n람다를 매개변수로 전달합니다.");
	}
}
