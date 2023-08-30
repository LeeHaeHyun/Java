package ex01;

/*
상속관계에 놓여있는 클래스의 생성자 정의 및 호출방식을 기본으로 
남은 고기량(돼지고기 180g, 소고기 600g, 양고기 540g)을 출력하는 메인 메소드를 정의하시오.
*/

class Meat // 부모 클래스 Meat
{		
	int pig; // int형 pig 변수
	public Meat(int pig) // 생성자 오버라이딩(매개변수 pig)
	{
		this.pig=pig; // 자신의 객체 접근
	}	
}
class Cow extends Meat // Meat에 상속된 Cow 자식 클래스
{
	int cow; // int형 cow 변수
	public Cow(int pig, int cow)
	{
		super(pig); // 부모 클래스로 pig를 보냄
		this.cow = cow; // 자신의 객체 접근
	}
}

class Sheep extends Cow
{
	int sheep;
	public Sheep(int pig, int cow, int sheep)
	{
		super(pig, cow);
		this.sheep = sheep;
	}

	public void show()
	{
		System.out.println("남은 돼지고기: "+ pig + "g");
		System.out.println("남은 소고기: "+ cow + "g");
		System.out.println("남은 양고기: "+ sheep + "g");
	}

	
}
public class Put01
{
	public static void main(String[] args)
	{
		Sheep first = new Sheep(180,600,540);
		first.show();


	}
}

