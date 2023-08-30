// 건물의 기본 설계도
abstract class Building
{
	int health;
	abstract void doBuild(); // 오버라이딩 위한 목적: 건물을 짓는다만 만들어놓음
}

// 건물이 날 수 있는 기능 구현, 건물의 일반적인 기능 아님
interface Fly
{
	void flyBuilding(); // 나는 건물: 오버라이딩을 목적
}

/*
 인터페이스는 상속과 구현을 동시에 할 수 있다
 클래스가 클래스를 상속 extends
 클래스가 인터페이스를 상속 implements
 인터페이스가 인터페이스를 상속 extends
 */
// 인간형 유닛을 생산하는 건물, 여차하면 날아서 이동 가능

class Barracks extends Building implements Fly
{
	void doBuild() //오버라이딩
	{
		System.out.println("인간형 유닛 생산 건물을 짓습니다.");
	}
	
	void doMakeMarine() // 기능 추가
	{
		System.out.println("총쏘는 유닛을 생산합니다.");
	}
	
	// 모든 건물이 날면 안되므로 인터페이스로 나는 기능 제공
	public void flyBuilding() // 인터페이스 기능 구현
	{
		System.out.println("건물이 날아서 이동하게 합니다.");
	}
}

//기갑형 유닛을 생산하는 건물. 여차하면 날아서 이동 가능
class Factory extends Building implements Fly
{
	void doBuild() // 오버라이딩
	{
		System.out.println("기갑형 유닛 생산 건물을 짓습니다.");
	}
	
	void doMakeTank() //기능 추가
	{
		System.out.println("탱크 유닛을 생산합니다.");
	}
	// 모든 건물이 날면 안되므로 인터페이스로 나는 기능 제공
	public void flyBuilding() // 인터페이스 구현(오버라이딩)
	{
		System.out.println("건물이 날아서 이동하게 합니다.");
	}
}

// 인간형 유닛을 숨겨서 보호하는 건물. 날면 안됨
class Bunker extends Building
{
	void doBuild() // 오버라이딩
	{
		System.out.println("인간형 유닛이 숨을 건물을 짓습니다.");
	
	}
	
	void doDefense() // 기능 추가
	{
		System.out.println("숨은 유닛을 적의 공격으로부터 보호합니다.");
	}
}

public class Ex02_Starcraft
{
	public static void main(String[] args)
	{
		Barracks barracks = new Barracks(); // 배럭 객체 생성
		barracks.doBuild();
		barracks.doMakeMarine();
		barracks.flyBuilding();
		
		Factory factory = new Factory(); // 팩토리 객체 생성 
		factory.doBuild();
		factory.doMakeTank();
		factory.flyBuilding();
		
		Bunker bunker = new Bunker(); // 벙커 객체 생성
		bunker.doBuild();
		bunker.doDefense();
	}
}
