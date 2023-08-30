package Character;

import java.util.Scanner;

// hero 부모 클래스에 상속된 Archer
public class Archer extends Hero {
	// 멤버 메소드
	public int attack() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 화살 공격");
		System.out.println("2. 연속 화살 공격");
		System.out.printf("공격 번호를 입력하세요 : ");
		int num = sc.nextInt();
		// 능력치를 0으로 초기화 해 놓는다.
		int sum = 0;
		// 화살공격
		if(num == 1) {
			// 레벨의 15배+공격력 15배+방어력 15배의 데미지로 들어간다.
			sum += level * 15;
			sum += power * 15;
			sum += defense * 15;
			System.out.println("데미지는 " + sum + " 입니다.");
			return sum;
			// 연속 화살 공격
		}else if(num == 2) {
			// 레벨의 10배+공격력 20배+방어력 10배의 데미지로 들어간다.
			sum += level * 10;
			sum += power * 20;
			sum += defense * 10;
			System.out.println("데미지는 " + sum + " 입니다.");
			return sum;
			
		}
		System.out.println("데미지는 " + sum + " 입니다.");
		return sum;
	}
	
	//Archer.attacked을 불렀을 경우
	public void attacked(int sum) {
		// 방어력이 더 크면 피해를 입지 않는다.
		if(defense >= sum) {
			hp = hp - 0;
		}else 
		{
			//체력+방어력에서 데미지를 뺀 값이 체력으로 남는다.
			hp = hp + defense - sum;
		}
	}
}
