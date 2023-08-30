/*
 오버라이딩: 클래스가 상속관계에 있을 때 하위클래스에서 상위클래스의 멤버메소드와 완전히 동일한 모양으로 재정의
 ex) doMove를 말을 타고 다니거나 날아다니거나 변신해서 움직이거나 부모 클래스의 doMove 움직이는 것을 재정의 
 */

class Unit
{
	String name;
	int hp;
	
	// 상속관계에서 오버라이딩을 목적으로 정의한 메소드
	void doMove()
	{
		System.out.println("이동속도 10으로 이동"); 
	}
}

class Marine extends Unit
{
	int attack;
	/*
	 @Override : 어노테이션이라고 부르고, 오버라이딩 메소드를 추가하여 컴파일러에게 알려주는 역할
	 필수사항이 아니라서 생략할 수 있다. ( 오버라이딩을 찾기 편하게 표시하기 위해 )
	 */

	void doMove()
	{
		super.doMove(); // 부모 클래스(super)의 doMove
		System.out.println(attack + " 공격"); //움직이면서 공격하는 기능추가
	}
}
class Medic extends Unit
{
	int heal;
	
	void doMove()
	{
		System.out.println("이동속도 8으로 이동"); //이동속도가 10인데 재정의
		System.out.println(heal + " 치유"); //기능추가
	}
}
public class MyTerran
{
	public static void main(String[] args)
	{
		Marine unit1 = new Marine(); //객체 생성
		unit1.name = "마린";
		unit1.hp = 100;
		unit1.attack = 20;

		Medic unit2 = new Medic(); //객체 생성
		unit2.name = "메딕";
		unit2.hp = 120;
		unit2.heal = 10;
		
		unit1.doMove();
		System.out.println();
		unit2.doMove();
	}
}
