package ex01;

class gusle 
{
	// 멤버변수 : 어린이가 보유한 구슬의 개수
	int bead;

	// 멤버 변수를 초기화 할 목적으로 정의한다.
	public gusle(int bead) // 생성자, 매개변수 1개 있는 생성자 ( 이름 같으면 )
	{
		// this는 멤버변수와 매개변수
		this.bead = bead; // 멤버변수 안에 매개변수를 넣는다
		/*
		 this의 활용법
		 1. 해당 클래스의 멤버를 가리킬때 사용한다
		 2. 오버로딩으로 정의된 또 다른 생성자를 호출할 때 사용한다
		 이 때는 this(인수1, 인수2)와 같이 기술한다
		 */
	}
	
	// 어린이가 보유한 구슬의 개수를 출력한다
	public void showProperty()
	{
		System.out.println("보유한 구슬의 개수 : " + bead);
	}

	/*
	구슬게임을 위한 멤버 메소드
	▶ 구슬의 총 개수는 한정적이므로 한 사람이 잃으면 한 사람은 얻게 되어 있다. 
	 */
	public void obtainBead(gusle child, int beadCount)
	{
		// this는 객체 자신이 되므로, 호출의 주체는 구슬이 증가한다.
		this.bead += beadCount; // 한 아이가 구슬을 얻으면 
		
		// 매개변수로 전달된 어린이의 구슬은 잃게 되므로 .(닷)으로 접근
		//하여 잃게 하면 된다
		child.bead -= beadCount; // 다른 아이는 구슬을 잃는다		
	}
	
}

public class ClassTwo
{

	public static void main(String[] args)
	{
//		2. 구슬치기 하는 아이들을 추상화하여 클래스로 정의해보자.
//		*어린아이가 보유하고 있는 구슬의 개수 정보를 담는다
//		*놀이를 통해 구슬을 획득 또는 상실하는 것을 표현한다.
//		*어린이의 현재 보유하고 있는 구슬의 개수를 표현한다.
//		초기화는 다음과 같이 진행한다.
//		◆어린이1의 보유갯수 : 구슬 20개
//		◆어린이2의 보유갯수 : 구슬 15개
//		게임은 다음과 같이 진행한다.
//		◆1차게임 : 어린이1은 어린이2의 구슬 5개를 획득한다.
//		◆2차게임 : 어린이2는 어린이1의 구슬 9개를 획득한다.
//		ㄴ어린이 객체를 생성시 구슬의 보유갯수는 생성자를 통해 초기화 되어야 한다.
		
		gusle child1 = new gusle(20); // 구슬 20개를 가진 어린이1 객체 생성
		gusle child2 = new gusle(15); // 구슬 15개를 가진 어린이2 객체 생성

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); //어린이1에 해당하는 호출하는 멤버 메소드를 부른다.
		System.out.print("어린이2 : ");
		child2.showProperty(); //어린이2에 해당하는 호출하는 멤버 메소드를 부른다.	
		
		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5); // 전달된 어린이1은 +5, 어린이2는 -5

		System.out.println("\n1차 게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();
		
		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9); // 전달된 어린이2는 +9, 어린이1는 -9

		System.out.println("\n2차 게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();
	}
}
