package Map;
//Map 부모 클래스에 상속된 PotionStore
public class PotionStore extends Map
{
	// 멤버 변수와 초기화를 직접한다
	int powerPotion = 30;
	int defensePotion = 30;
	int experiencePotion = 100;
	int hpPotion = 10;
	int mpPotion = 10;
	
	// 멤버 메소드
	public int show(int money, int num) 
	{
		
		name = "포션 상점";
		System.out.println(name + "에서 물건을 구매 시도하는 중입니다.");
		// 힘포션을 샀을때
		if(num == 1) 
		{
			// 돈이 있어야 하며
			if(powerPotion <= money) 
			{
				// 가진 돈에서 값을 뺀다
				return money - powerPotion;
			}
		}
		
		if(num == 2) {
			if(defensePotion <= money) {
				return money - defensePotion;
			}
		}
		
		if(num == 3) 
		{
			if(experiencePotion <= money) 
			{
				return money - experiencePotion;
			}
		}
		
		if(num == 4) 
		{
			if(hpPotion <= money) 
			{
				return money - hpPotion;
			}
		}
		
		if(num == 5) 
		{
			if(mpPotion <= money) 
			{
				return money - mpPotion;
			}
		}
		return money;
	}
}
