/*
함수형 인터페이스
: 람다식을 사용하기 위해 먼저 인터페이스를 만들고 추상메소드 선언
* 함수형 인터페이스에는 오직 하나의 추상메소드만 선언 가능

@FunctionalInterface : 함수형 인터페이스의 
조건을 갖추었는지 컴파일러에게 요청하는 역할
 */

@FunctionalInterface // 람다식
interface Unit11
{
	String move(); //매개변수 없음, 반환형 String
	// 위처럼 하나만 선언할 수 있다.
//	void attack(); //@FunctionalInterface에서 에러라고 알려줌(2개 사용 불가)
}

public class Ex11_Functiona
{

	public static void main(String[] args)
	{
		/*
		 Unit11 인터페이스를 구현하여 람다식 생성
		 */
		Unit11 unit = () -> {
			return "인간형 유닛 이동";
		};

		System.out.println(unit.move());
	}

}
