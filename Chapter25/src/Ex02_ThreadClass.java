/*
Thread (스레드)
- Thread 클래스를 상속하는 것부터 시작
- java.lang패키지에 포함되어 있어서 따로 import할 필요가 없다
 */

class MyThread2 extends Thread
{
	/*
	run() 메소드는 쓰레드의 main() 메소드에 해당한다
	run() 메소드는 오버라이딩 한 것으로 해당 메소드는 직접 호출하면 안됨
	start() 메소드를 통해 간접적으로 호출해야 한다
	 */
	@Override
	public void run() // java.lang에 포함된 Thread 상속, 반드시 run()을 사용할 것. 이것이 스레드
	{
		int sum = 0;
		for (int i=0; i<10; i++)
			sum = sum + i;
		// 스레드 이름이 없으면 숫자로 줌
		String name = Thread.currentThread().getName();
		// 나중에 출력. 연산 결과 출력
		System.out.println(name + ":" + sum);
	}
}

public class Ex02_ThreadClass
{
	public static void main(String[] args)
	{
		//스레드 객체 생성
		MyThread2 t = new MyThread2();
		// 스레드 객체를 통한 스레드 생성 및 실행
		t.start(); // run()을 불러옴, 
		// ★★★ 스레드가 실행되는 시간이 조금 필요하기 때문에 대부분 밑에 것이 먼저 실행된다
		
		// 현재 스레드 명
		System.out.println("main: " + Thread.currentThread().getName()); // 먼저 실행
	}
}
