package Character;

import java.util.Scanner;
//hero 부모 클래스에 상속된 Magician
public class Magician extends Hero {
	// 멤버 메소드
	public int attack() {
		// 능력치를 초기화
		int sum = 0;
		
		// 마력이 10보다 크거나 같을때만 사용 가능
		if(mp >= 10) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 파이어볼");
			System.out.println("2. 워터볼");
			System.out.printf("공격 번호를 입력하세요 : ");
			int num = sc.nextInt();
		
		// 파이어볼 : 레벨의 10배+공격력의 15배+방어력의 5배가 데미지로
		if(num == 1) {
			
			sum += level * 10;
			sum += power * 15;
			sum += defense * 5;
			System.out.println("데미지는 " + sum + " 입니다.");
			//마력이 5 깎인다
			mp = mp - 5;
			return sum;
			
		// 워터볼 : 레벨의 8배+공격력의 13배+방어력의 10배가 데미지로	
		}else if(num == 2) {
			
			sum += level * 8;
			sum += power * 13;
			sum += defense * 10;
			System.out.println("데미지는 " + sum + " 입니다.");
			//마력이 5 깎인다
			mp = mp - 5;
			return sum;
		}
		
		System.out.println("데미지는 " + sum + " 입니다.");
		return sum;
		
		// 마력이 10보다 작을 경우
		}else 
		{
			System.out.println("MP가 남아있지 않습니다.");
			return sum;
		}
	}
	//Magician.attacked을 불렀을 경우
	public void attacked(int sum) {
		// 방어력이 데미지보다 크면 데미지 없음
		if(defense >= sum) {
			hp = hp - 0;
		}else 
		{
			// 그 외는 체력과 방어력을 더한 값에 데미지를 뺀 값이 체력으로 남아 반환
			hp = hp + defense - sum;
		}
	}
}
	
	
	
	
	
	