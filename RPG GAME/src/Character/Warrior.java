package Character;

import java.util.Scanner;
//Hero 부모 클래스에 상속된 Warrior
public class Warrior extends Hero {
		
	public int attack() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 쓰러스트");
		System.out.println("2. 삼단 베기");
		System.out.printf("공격 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		if(num == 1) {
			
			sum += level * 10;
			sum += power * 30;
			System.out.println("데미지는 " + sum + " 입니다.");
			return sum;
		}else if(num == 2) {
			
			sum += level * 20;
			sum += power * 15;
			sum += defense * 15;
			System.out.println("데미지는 " + sum + " 입니다.");
			return sum;
		}
		System.out.println("데미지는 " + sum + " 입니다.");
		return sum;
	}
	
	public void attacked(int sum) {
		
		if(defense >= sum) {
			hp = hp - 0;
		}else {
			hp = hp + defense - sum;
		}
	}
}
	