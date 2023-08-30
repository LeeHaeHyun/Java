interface Unit4
{
	public void move(String str);
}
/*
어노테이션의 용도
- 컴파일러에게 코드 작성 문법 에러를 체크하도록 정보를 제공
- 소프트웨어 개발들이 발드나 배치시 코드를 자동으로 생성할 수 있또록 정보 제공
- 실행시(런타임시) 특정 기능을 실행하도록 정보를 제공
 */
class Human4 implements Unit4
{
	/*
	@Override
	- 선언한 메서드가 오버라이딩 되었다는 것을 나타냄
	- 만약 상위(부모) 클래스( 또는 인터페이스)에서 해당 메서드를 찾을 수 없다면
	컴파일 에러를 발생시킵니다.
	 */
	@Override // 오타방지를 위해서 사용
//	public void move(sting str) <- Sting 오타 찾음
	public void move(String str)
	{
		System.out.println(str);
	}
}
public class Ex04_Override
{

	public static void main(String[] args)
	{
		Unit4 unit = new Human4();
		unit.move("인간형 유닛이 이동합니다."); // 오버라이딩
	}
}
