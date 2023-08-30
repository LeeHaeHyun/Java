// 람다식의 규칙1
interface Unit8
{
	void move(String s); // 매개변수 하나, 반환형 void 
}
public class Ex08_LambdaRule1
{

	public static void main(String[] args)
	{
		/*
		앞의 예제 람다식을 한번 더 줄이면 다음과 같이 표현 가능
		 */
		Unit8 unit;
		
		unit = (String s) -> { System.out.println(s); }; // 기본적으로 이것을 사용
		unit.move("Lambda : 줄임 없는 표현 : 앞 예제 동일");

		unit = (String s) -> System.out.println(s); // 한 문장일때 생략 가능 (for문 or if문도 한줄일때 생략 가능)
		unit.move("Lambda : 중괄호 생략");
		
		unit = (s) -> System.out.println(s); // 매개변수가 하나일때 생략 가능
		unit.move("Lambda : 매개변수 형 생략");
	
		unit = s -> System.out.println(s);
		unit.move("Lambda : 매개변수 소괄호 생략");
	}
}

// 메소드 몸체가 둘 이상의 문장으로 이뤄져있거나,
// 매개변수의 수가 둘 이상인 경우에는
// 각각 중괄호와 소괄호의 생략이 불가능
