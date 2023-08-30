package Character;
//Character 부모 클래스에 상속된 Hero
public class Hero extends Character {
	// 직접적으로 멤버변수 선언과 초기화
	public int power;
	public int defense;
	public int money = 0;
	public int experience = 0;
	// 멤버 메소드를 불렀을때 공격력을 반환
	public int attack() {
		return power;
	}
	//Hero.attacked을 불렀을 경우
	public void attacked(int sum) {
		// 값보다 방어력이 더 크면
		if(defense >= sum) {
			// 피해를 입지 않는다
			hp = hp - 0;
		}else 
		{
			// 그 외는 체력과 방어력을 더한 값에서 데미지만큼 빼서 체력으로 남음
			hp = hp + defense - sum;
		}
	}
}
