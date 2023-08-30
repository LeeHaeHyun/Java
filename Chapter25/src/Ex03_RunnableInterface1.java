/*
스레드를 생성하는 두번째 방법
: 자바는 다중상속을 지원하지 않아서 다른 클래스를 상속해야 한다면
Runnable 인터페이스를 구현해서 스레드 클래스를 정의해야 한다
 */
class MyThread3 implements Runnable // Runnable을 받아서 실행 외부에 만듬
{
	public void run()
	{
		int sum = 0;
		for (int i=0; i<10; i++)
			sum = sum + i;
		// 스레드 이름이 없으면 숫자로 줌
		String name = Thread.currentThread().getName();
		// 나중에 실행
		System.out.println(name + ":" + sum);
	}
}

public class Ex03_RunnableInterface1
{
	public static void main(String[] args)
	{
		/*
		Runnalble 인터페이스를 구현한 클래스의 객체(인스턴스)를 대상으로 스레드를 생성
		 */
		Thread t = new Thread(new MyThread3());
		t.start(); // run()을 불러옴
		
		System.out.println("main: " + Thread.currentThread().getName()); // 먼저 실행
	}
}
