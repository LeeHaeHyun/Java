package Main;

import java.util.Scanner;

import Character.*;

import Map.*;

public class GameMain {

	public static void main(String[] args) {
		// 사용자로부터 입력을 받는다.
		Scanner sc = new Scanner(System.in);
		// hero 객체를 생성
		Hero hero = new Hero();
		// 메뉴
		System.out.println("*******RPG GAME*******");
		System.out.println("1. 전사");
		System.out.println("2. 마법사");
		System.out.println("3. 궁사");
		System.out.printf("직업의 번호를 입력하세요. : ");
		int num = sc.nextInt();
		
		// 1번, 전사를 선택시 초기화 셋팅
		if(num == 1) {
			
			System.out.println("전사가 선택되었습니다.");
			hero = new Warrior(); // 캐릭터는 전사
			hero.defense = 25; // 방어력
			hero.power = 15; // 공격력
			hero.level = 1; // 레벨
			hero.hp = 80; // 체력
			hero.mp = 0; // 마력
			
		}
		// 2번, 마법사를 선택시 초기화 셋팅
		else if(num == 2) {
			
			System.out.println("마법사가 선택되었습니다.");
			hero = new Magician();// 캐릭터는 마법사
			hero.defense = 10; // 방어력
			hero.power = 18; // 공격력
			hero.level = 1; // 레벨
			hero.hp = 60; // 체력
			hero.mp = 60; // 마력
		
		}
		// 3번, 궁사를 선택시 초기화 셋팅
		else if(num == 3) {
			
			System.out.println("궁사가 선택되었습니다.");
			hero = new Archer();// 캐릭터는 궁사
			hero.defense = 5; // 방어력
			hero.power = 20; // 공격력
			hero.level = 1; // 레벨
			hero.hp = 50; // 체력
			hero.mp = 0; //마력
		
		}
		
		// 이름을 선택할 값을 받는다.
		System.out.printf("영웅의 이름을 입력하세요. : ");
		hero.name = sc.next();
		System.out.println("이름이 정상적으로 입력되었습니다.");
		System.out.println("게임에 입장하였습니다.");
		
		// 게임 틀에서 나가지 못하도록 무한루프
		while(true) {
			
			System.out.println("*********************");
			System.out.println("현재 "+ hero.name + "의 이름 : " + hero.name);
			System.out.println("현재 "+ hero.name + "의 레벨 : " + hero.level);
			System.out.println("현재 "+ hero.name + "의 힘 : " + hero.power);
			System.out.println("현재 "+ hero.name + "의 방어력 : " + hero.defense);
			System.out.println("현재 "+ hero.name + "의 HP : " + hero.hp);
			System.out.println("현재 "+ hero.name + "의 MP : "  + hero.mp);
			System.out.println("현재 "+ hero.name + "의 경험치 : "  + hero.experience);
			System.out.println("현재 "+ hero.name + "의 돈 : "  + hero.money + "원");
			System.out.println("*********************");
			
			System.out.println("1. 사냥터");
			System.out.println("2. 무기 상점");
			System.out.println("3. 포션 상점");
			System.out.printf("입장할 장소를 입력하세요. : ");
			num = sc.nextInt();
			
			// 사냥터 입장
			if(num == 1) {
				// 몬스터 객체 생성
				Monster monster = new Monster();
				System.out.println("사냥터에 입장하였습니다.");
				System.out.println("1. 너구리");
				System.out.println("2. 살쾡이");
				System.out.println("3. 들개");
				System.out.println("4. 멧돼지");
				System.out.printf("사냥한 몬스터를 입력하세요. : ");
				num = sc.nextInt();
				
				// 너구리 몬스터 초기화
				if(num == 1) {
					
					monster = new Racoon();
					monster.name = "너구리";
					monster.hp = 100;
					monster.mp = 0;
					monster.level = 1;
					monster.power = 20;
					monster.defense = 5;
					monster.money = 10;
					monster.experience = 10;
					System.out.println(monster.name + "과 전투를 시작합니다.");
				}
				
				// 살쾡이 몬스터 초기화
				if(num == 2) {
					
					monster = new WildCat();
					monster.name = "살쾡이";
					monster.hp = 2000;
					monster.mp = 0;
					monster.level = 5;
					monster.power = 100;
					monster.defense = 20;
					monster.money = 30;
					monster.experience = 50;
					System.out.println(monster.name + "과 전투를 시작합니다.");
				}
				
				// 들개 몬스터 초기화
				if(num == 3) {
					
					monster = new WildDog();
					monster.name = "들개";
					monster.hp = 3000;
					monster.mp = 0;
					monster.level = 15;
					monster.power = 300;
					monster.defense = 30;
					monster.money = 50;
					monster.experience = 100;
					System.out.println(monster.name + "과 전투를 시작합니다.");
				}
				
				// 멧돼지 몬스터 초기화
				if(num == 4) {
					
					monster = new WildPig();
					monster.name = "멧돼지";
					monster.hp = 10000;
					monster.mp = 0;
					monster.level = 30;
					monster.power = 1000;
					monster.defense = 80;
					monster.money = 200;
					monster.experience = 300;
					System.out.println(monster.name + "과 전투를 시작합니다.");
				}
				// 공격의 틀을 벗어나지 못하도록 무한루프
				while(true) {
					
					System.out.println(hero.name + "의 공격입니다.");
					// 여기서 처리하기 위해서 호출한다.
					monster.attacked(hero.attack()); 
					
					// 몬스터의 체력이 0이면
					if(monster.hp <= 0) {
						
						System.out.println(monster.name + "가 죽었습니다.");
						// 경험치와 돈이 증가
						hero.experience += monster.experience;
						hero.money += monster.money;
						break;
					}
					
					System.out.println(monster.name + "의 공격입니다.");
					// 여기서 처리하기 위해서 호출한다.
					hero.attacked(monster.attack());
					
					// 죽으면 게임을 이어나가기 위해 체력 1로 부활한다
					if(hero.hp <= 0) {
						
						System.out.println(hero.name + "이 죽었습니다.");
						hero.hp = 1;
						System.out.println(hero.name + "이 체력" + hero.hp + "으로 부활했습니다.");
						break;
					}
				}
				// 무기 상점
			}else if(num == 2) {
				// 무기상점 객체 생성
				WeaponStore weaponstore = new WeaponStore();
				System.out.println("무기 상점에 입장하였습니다.");
				System.out.println("1. 공동 무기 (50원)");
				System.out.println("2. 공동 방패 (50원)");
				System.out.println("현재 돈이 " + hero.money  + "있습니다.");
				System.out.printf("원하시는 물건을 입력하세요. : ");
				
				num = sc.nextInt();
				// 상점 거래를 위해 플레이어의 돈을 temp 변수에 넣는다.
				int temp = hero.money;
				
				// 플레이어의 돈이 음수가 아닐 경우 구매가 가능
				if((hero.money = weaponstore.show(hero.money,num)) != -1) 
				{
					
					System.out.println("구입이 완료되었습니다.");
					// 무기를 구매할 경우
					if(num == 1) {
						// 공격력 5가 증가
						hero.power += 5;
					}
					// 방패를 구매할 경우
					if(num == 2) {
						// 방어력 5가 증가
						hero.defense += 5;
						
					}
					
					System.out.println(temp + "원 남았습니다.");
					
				}else {
					System.out.println("돈이 부족합니다.");
					System.out.println(temp + "원 남았습니다.");
				}
				// 포션 상점 입장
			}else if(num == 3) {
				
				// 포션 상점 객체 생성
				PotionStore potionstore = new PotionStore();
				System.out.println("포션 상점에 입장하였습니다.");
				System.out.println("1. 공격력 증가 포션 (30원)");
				System.out.println("2. 방어력 증가 포션 (30원)");
				System.out.println("3. 경험치 증가 포션 (100원)");
				System.out.println("4. HP 증가 포션 (10원)");
				System.out.println("5. MP 증가 포션 (10원)");
				System.out.printf("원하시는 물건을 입력하세요. : ");
				
				// 입력값을 int 정수 num 변수에 저장한다.
				num = sc.nextInt();
				// 돈을 temp 에 역시 넣는다.
				int temp = hero.money;
				// 플레이어의 돈이 음수가 아닐 경우 구매가 가능
				if((hero.money = potionstore.show(hero.money,num)) != -1) {
					
					System.out.println("구입이 완료되었습니다.");
					
					
					if(num == 1) {
						// 공격력 증가 +3 
						hero.power += 3;
					}
					
					if(num == 2) {
						// 방어력 증가 +3 
						hero.defense += 3;	
					}
					if(num == 3) {
						// 경험치 증가 +50 
						hero.experience += 50;	
					}
					if(num == 4) {
						// 체력 증가 +50 
						hero.hp += 50;
					}
					if(num == 5) {
						// 마력 증가 +50 
						hero.mp += 50;
					}
					
					System.out.println(temp + "원 남았습니다.");
					
				}else {
					System.out.println("돈이 부족합니다.");
					System.out.println(temp + "원 남았습니다.");
				}
			}
			// 레벨에 x80한만큼 경험치를 가지고 있을 경우를 레벨업 기준
			if(hero.experience  >= hero.level * 80) 
			{
				// 레벨이 1 오른다.
				hero.level += 1;
				System.out.println(hero.name + "의 레벨이" + hero.level + "이 되었습니다.");
				// 돈은 레벨의 x50한 만큼 준다
				hero.money += hero.level * 50;
				System.out.println("레밸업 기념으로 돈이 " + hero.level * 50 + "원 증가하여 ");
				System.out.println(hero.money + "원이 되었습니다.");
				hero.experience = 0; // 경험치 초기화
			}
			
		}
	}
}
				
				
				
				
				
				