//인터페이스 정의 (일반 클래스 사용)
/*
 인터페이스에는 추상메서드만 정의할 수 있다. 자동으로 public abstract가 붙게 된다
 추상메소드는 구현부가 없으므로 기능이 없다. 즉 오버라이딩의 목적으로 생성된다.
 */
interface Unit5
{
	void move(String s);
}

/*
추상메서드를 포함한 인터페이스를 구현하면 하위 클래스에서는 반드시 오버라이딩 해야 한다
오버라이딩을 통해 부모 인터페이스의 추상메서드를 재정의해야 한다. (가려지게 된다)
 */
class Human5 implements Unit5
{
	@Override
	public void move(String s)
	{
		System.out.println(s);
	}
}

public class Ex05_Lambda1
{
	public static void main(String[] args)
	{
		/*
		단지 메소드 하나를 정의해서 사용하고 싶은데 인터페이스, 상속, 오버라이딩, 객체생성까지
		과정을 거쳐야 하므로 너무 복잡하다. => 람다식이 등장한다
		 */
		Unit5 unit = new Human5();
		unit.move("Lambda : Unit 5"); // 한 줄을 출력하기 위해 과정이 복잡하다
	}
}
