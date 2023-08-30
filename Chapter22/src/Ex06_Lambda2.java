/*
익명클래스 정의를 통한 오버라이딩
 */

// 인터페이스 정의(부모객체로 사용)
interface Unit6
{
	void move(String s);
}

// 익명 클래스를 통해 구현하므로 implements는 필요하지 않다
// 즉, 상속을 위한 클래스를 생성할 필요가 없다
public class Ex06_Lambda2
{
	public static void main(String[] args)
	{
		/*
		익명클래스는 눈에 보이지 않는 상속 혹은 구현이 되어있어 오버라이딩이 가능하다
		상속을 받으면 무조건 오버라이딩이 가능하다
		 */
		Unit6 unit = new Unit6() { // 객체 생성하듯이 만듬, 익명 클래스 생성방법: 부모 이름으로 new하면 됨
			/*
			 상속의 절차를 익명클래스로 대체하므로 코드가 좀 더 간결해진다.
			 */
			@Override
			public void move(String s) // 오버라이딩
			{
				System.out.println(s);
			}
		};
		unit.move("Lambda : Unit 6"); // 익명 클래스를 만들어서 바로 부를 수 있음
	}
}
