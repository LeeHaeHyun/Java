interface Unit4
{
	void move(); // 오버라이딩을 위해 태어난 생성자
}

/*
 익명클래스
 - 이름이 없는 클래스
 - 내부클래스처럼 이벤트 기반의 프로그래밍에서 많이 사용
 - 부모클래스의 메소드를 오버라이딩 하는 것이 목적이다
 - 마지막에 세미콜론을 반드시 기술해야 한다.
 - 형식: 부모클래스명 참조변수 = new 부모클래스명() {
 	익명 클래스의 실행부;
 	부모클래스의 메소드 오버라이딩();
 */
class HumanCamp4
{
	private int speed = 10;
	
	public Unit4 getMarine()
	{
//		class Marine4 implements Unit4
//		{
//			@Override
//			public void move()
//			{
//				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
//			}
//		}
//		
//		// 내부 클래스 사용
//		return new Marine4();
		
		// 이름이 없으므로 부모 클래스나 인터페이스의 이름을 사용
		return new Unit4() // 익명 클래스 위에 클래스가 생략됨. 부모 이름으로 new
		{
			@Override
			public void move()
			{
				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
			}
		}; // 하나의 실행문이므로 세미콜론으로 끝납니다. ( 이벤트에 많이 쓰임 )
	}
}

public class Ex04_AnonymousInner2
{
	public static void main(String[] args)
	{
		HumanCamp4 hc = new HumanCamp4(); //객체생성
		
		/*
		인터페이스를 구현(상속)하여 생성한 익명클래스
		추상메소드는 기능이 없지만, 오버라이딩의 목적으로 생성
		아래처럼 구현하는게 일반적이다.
		 */
		Unit4 unit = hc.getMarine();
		unit.move();
	}
	/*
	결론] 상속의 목적은 '확장'
	익명 클래스의 목적은 "오버라이딩"이다.
	따라서 익명클래스는 주로 interface를 통해 구현한다.
	 */
}
