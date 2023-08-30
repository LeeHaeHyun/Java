package ex18lambda;

/*
익명클래스 정의를 통한 오버라이딩
인터페이스 정의(부모객체로 사용)
 */
interface ISchool2
{
	void studyLambda(String str);
}

//익명클래스를 통해 구현하므로 implements는 필요하지 않다
//즉, 상속을 위한 클래스를 생성할 필요가 없다
public class Ex02AnonymousClass
{
	public static void main(String[] args)
	{
		/*
		ISchool2 인터페이스를 구현한 익명클래스를 정의
		extends 혹은 implements 키워드는 없지만 중괄호 부분은 자식의 영역이 된다
		 */
		ISchool2 sch = new ISchool2() {
			/*
			 상속의 절차를 익명클래스로 대체하므로 코드가 좀 더 간결하다
			 */
			@Override //메인에서 익명클래스로 만들어서 왔다갔다 할 필요가 없다
			public void studyLambda(String str)
			{
				System.out.println(str+ "을 공부하기위해 익명 클래스를 만들어요");
			}
		};
		sch.studyLambda("람다식");
	}
}
