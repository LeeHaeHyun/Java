/*
 instanceof 연산자
 - 어떤 타입의 변수인지 판단하는 연산자
 */

interface Cry // 인터페이스 구현 
{
	void cry(); // 추상메소드 abstract 생략(인터페이스)
}

class Cat implements Cry
{
	public void cry()
	{
		System.out.println("야옹~"); // 인터페이스 오버라이딩
	}
}

class Dog implements Cry
{
	public void cry()
	{
		System.out.println("멍멍!"); // 인터페이스 오버라이딩
	}
}
public class Ex03_instanceof
{

	public static void main(String[] args)
	{
		// 부모 참조변수로 자식객체를 참조한 변수 생성
		// 다형성을 이용한 코드 작성
		Cry test1 = new Cat();
//		Cry test1 = new Dog();
		
//		참조값이 어떤 객체를 가리키는지 조사
//		instanceof는 결국 다형성을 잘 사용하려고 사용하는 연산자
		if (test1 instanceof Cat)
		{
			test1.cry();
		}
		else if (test1 instanceof Dog)
		{
			System.out.println("고양이가 아닙니다.");
		}

	}

}
