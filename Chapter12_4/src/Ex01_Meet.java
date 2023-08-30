/*
인터페이스: 클래스가 객체의 설계도라면 인터페이스는 클래스의 설계도
자바는 단일 상속을 원칙으로 하지만 인터페이스를 통해 다중상속 구현 
인터페이스는 생성자를 사용할 수 없다

1. 다중상속 가능
2. 객체를 생성할 수 없다
 */
interface Greet
{
	void greet();
}

interface Talk
{
	void talk();
}

//인터페이스는 콤마를 이용해서 여러개를 동시에 구현할 수 있다
class Morning implements Greet, Talk
{
	public void greet()
	{
		System.out.println("안녕하세요!");
	}
	
	public void talk()
	{
		System.out.println("날씨 좋네요.");
	}
}
public class Ex01_Meet
{
	public static void main(String[] args)
	{
		Morning morning = new Morning();
		morning.greet();
		morning.talk();
	}
}
