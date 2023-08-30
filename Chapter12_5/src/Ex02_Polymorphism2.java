// 클래스도 자동형변환이 된다. ( 상속 개념에서 )

abstract class Human // 추상 클래스를 만들고 
{
	abstract void print(); // 오버라이딩이 목적
}

class Man extends Human
{
	void print()
	{
		System.out.println("남자 생성");
	}
}

class Woman extends Human
{
	void print()
	{
		System.out.println("여자 생성");
	}
}

public class Ex02_Polymorphism2
{
	public static Human humanCreate(int kind) // humanCreate 메소드
	{
		if (kind == 1) {
			Human m = new Man();
			return m;
//			return new Man(); // 자동 형변환
		} else {
			//Human m = new Woman();
			//return w;
			return new Woman(); // 자동 형변환
		}
	}
	public static void main(String[] args)
	{
		// 생성된 객체가 남자인지 여자인지 중요하지 않다
		// 남자이면 남자애, 여자이면 여자애
		Human h1 = humanCreate(1);
		h1.print();
		Human h2 = humanCreate(2);
		h2.print();
	}
}
