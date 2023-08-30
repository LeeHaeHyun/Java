
public class Ex01_CurrentThread
{
	public static void main(String[] args) // main이 스레드
	{
		// 현재 스레드의 이름을 가지고 와라
		String name = Thread.currentThread().getName();
		
		// 출력
		System.out.println("현재 스레드 이름 : " + name);
	}
}
