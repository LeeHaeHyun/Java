package ex18lambda;

/*
인터페이스와 클래스를 활용한 일반적인 오버라이딩
 */

// 이와 같은 추상클래스를 아래에 있는 인터페이스로 변경할 수 있다.
//abstract class ISchool1
//{
//	abstract void studyLambda(String str);
//}

// 인터페이스 정의
// 인터페이스에는 추상메서드만 정의할 수 있다
// 자동으로 public abstract이 붙게 된다( 생략할 수 있다 )
// 오버라이딩을 통해 부모 인터페이스의 추상메소드를 재정의해야 된다 (★★★ 가려지게 된다)

interface ISchool1
{
	void studyLambda(String str);
}

class Student1 implements ISchool1
{
	@Override
	public void studyLambda(String str)
	{
		System.out.println(str + "을(를) 공부합니다");
	}
}
public class Ex01NormalClass
{
	public static void main(String[] args)
	{
		/*
		단지 메소드 하나를 정의해서 사용하고 싶은데 너무 복잡하다 
		: 이러한 이유에 람다식 등장
		여기에서는 부모타입의 참조변수를 통해 객체를 생성한 후 
		오버라이딩된 자식쪽의 메소드를 호출 
		 */
		ISchool1 sch = new Student1();
		sch.studyLambda("람다식");
	}

}
