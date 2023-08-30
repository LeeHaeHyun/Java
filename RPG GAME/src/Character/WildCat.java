package Character;
//WildCat 클래스는 Monster가 부모 클래스 상속
public class WildCat extends Monster {
	// 멤버 메소드
	public int attack() {
		
		System.out.println("데미지는 " + power + " 입니다.");
		return power;
		
	}
	//WildCat.attacked을 불렀을 경우
	public void attacked(int sum) {
		// 데미지가 방어력보다 작으면 피해 없음
		if(defense >= sum) {
			hp = hp - 0;
		}else {
			// 그 이외는 체력+방어력-데미지 = 체력으로 남는다.
			hp = hp + defense - sum;
		}
	}
}
