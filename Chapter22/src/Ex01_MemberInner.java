import Outer1.MemberInner1;

/*
내부클래스
	: 클래스 안에 정의된 클래스로 static이 없는 클래스를 말한다
	- 외부 클래스의 모든 멤버를 사용할 수 있다
	- 정적 멤버를 가질 수 없다. 단 상수는 가질 수 있다
	- 이벤트 기반의 프로그래밍에서 사용된다.
	- 컴파일시 외부클래스 이름 $내부클래스 이름.class 형식으로 파일이 만들어진다
 */

//외부 클래스 정의
class Outer1
{
	//멤버 변수
	private int speed = 10;
	
	// 멤버 내부 클래스
	// Outer1$MemberInner1.class 이렇게 파일이 생성됨, bin에서 확인 가능
	class MemberInner1
	{
		/*
		내부클래스에서는 외부 클래스의 모든 멤버에 접근 가능
		외부클래스가 더 넓은 지역이기 때문에
		 */
		// 외부 클래스의 자원(speed) 사용 가능
		public void move()
		{
			System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
		}
	}
	
	public void getMarine()
	{
		MemberInner1 inner = new MemberInner1();
		inner.move();
	}
}

public class Ex01_MemberInner
{
	public static void main(String[] args)
	{
		// 외부클래스의 객체를 먼저 생성한다
		Outer1 out = new Outer1();
		
		//out 기반으로 생성된 객체의 메소드 호출
		out.getMarine();
		
		/* 추가
		 외부 클래스가 아닌 다른 클래스에서는 내부 멤버 클래스가 
		 보이지 않아서 직접 인스턴스를 생성할 수 없다
		 */
		// MemberInner1 inner = new MemberInner1(); // 에러 발생
		
		/*
		 외부 클래스의 인스턴스를 먼저 생성하고 내부클래스의 인스턴스를 생성해야 한다
		 */
		
		//out 기반으로 내부 클래스 객체 생성
		Outer1.MemberInner1 inner = out.new MemberInner1();

		//inner 기반으로 생성된 객체의 메소드 호출
		inner.move(); // 가능하나 잘 사용하지 않음
	}
}
