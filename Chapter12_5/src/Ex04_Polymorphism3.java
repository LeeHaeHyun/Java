abstract class Animal // 추상 클래스
{
	abstract void doMove(); // 추상 메소드 : 반드시 오버라이팅 필요
}

class Tiger extends Animal
{
	void doMove() // 추상 메소드 오버라이딩
	{
		System.out.println("호랑이는 산을 달립니다.");
	}
}

class Lion extends Animal
{
	void doMove() // 추상 메소드 오버라이딩
	{
		System.out.println("사자는 평원을 달립니다.");
	}
}
public class Ex04_Polymorphism3
{
	public static void animalChoose(Animal obj) //: animalChoose 메소드 생성 Animal obj = new Tiger();
	{
		if (obj instanceof Tiger) { // 부모 클래스와 자식(Tiger) 클래스가 같습니까? 
			// 주소값이 부모클래스와 자식 클래스가 같다 
			Tiger tiger = (Tiger)obj; 
			tiger.doMove();
		} else {
			Lion lion = (Lion)obj;
			lion.doMove();
		}
	}
	public static void main(String[] args)
	{
		Tiger tiger = new Tiger();
		animalChoose(tiger);
		
		Lion lion = new Lion();
		animalChoose(lion);
	}
}
