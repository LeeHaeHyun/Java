package Map;
//Map 부모 클래스에 상속된 WeaponStore
public class WeaponStore extends Map 
{
	// 직접 초기화한 멤버변수
	int commonWeapon = 50;
	int commonShield = 50;
	
	// 멤버 메소드
	public int show(int money, int num) {
		
		name = "무기 상점";
		System.out.println(name + "에서 물건을 구매 시도하는 중입니다.");
		// 공통 무기를 살 경우
		if(num == 1) {
			// 돈이 있을 경우 -> 가격을 뺀 값을 반환
			if(commonWeapon <= money) {
				return money - commonWeapon;
			}
		}
		
		if(num == 2) {
			if(commonShield <= money) {
				return money - commonShield;
			}
		}
		
		return money;
	}
}

