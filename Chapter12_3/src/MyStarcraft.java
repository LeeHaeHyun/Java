/*
추상클래스
- 상속을 목적으로 제작되므로 객체 생성을 허용하지 않음
- 추상 클래스는 반드시 오버라이딩해야한다.
- 클래스의 상속관계에서 설계도와 같은 역할은 한다
- 객체생성은 할 수 없으나 변수는 사용할 수 있다.
 */

abstract class Unit // 추상클래스
{
//	추상메소드는 실행부가 없어서 {}를 기술하지 않고 ;로 끝남, 오버라이딩을 목적으로 생성
	abstract void doMove();
}

class Marine extends Unit
{
//	상속하면 부모가 가진 추상메소드를 그대로 상속받아서 해당 클래스도 abstract 선언
//	객체생성할 수 없다. 만약 객체를 생성해야 한다면 추상메소드를 자식쪽에서 오버라이딩해야 한다
	void doMove()
	{
		System.out.println("마린은 두 발로 이동합니다.");
	}
}

class Zergling extends Unit
{
	void doMove()
	{
		System.out.println("저글링은 네 발로 이동합니다.");
	}
}
public class MyStarcraft
{
	public static void main(String[] args)
	{
		// 추상 클래스는 객체를 생성할 수 없다
//		unit unit = new Unit();
	
//		추상 클래스를 상속한 하위 클래스는 객체생성을 할 수 있다
		Marine unit1 = new Marine(); 
		unit1.doMove();
		
		Zergling unit2 = new Zergling();
		unit2.doMove();
	}
}
