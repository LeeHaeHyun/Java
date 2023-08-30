package Character;

//Character 부모 클래스에 상속된 Monster
public class Monster extends Character{
	// 멤버변수 은닉화
	public int power;
	public int defense;
	public int money;
	public int experience;
	
	// 어택 멤버 메소드를 불렀을때 공격력을 반환한다
	public int attack() {
		return power;
	}
	
	public void attacked(int sum) {
		
		if(defense >= sum) 
		{
			hp = hp - 0;
		}
		else {
			hp = hp + defense - sum;
		}
	}
}
