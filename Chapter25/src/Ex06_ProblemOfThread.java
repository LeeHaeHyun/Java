// 스레드는 스태틱 영역을 공유하므로 스태틱(money) 영향을 받는 부분을 확인하는 예제

public class Ex06_ProblemOfThread // 스레드의 문제점
{
	public static int money = 0; // 스레드1와 스레드2는 힙과 스택영역은 별개의 공간을 사용하지만
	// 스태틱 영역은 공동으로 사용한다(값을 공유)

	public static void main(String[] args) throws InterruptedException // 예외처리
	// 원래는 try.. catch를 사용해야 한다
	{
		Runnable task1 = () -> {
			for(int i = 0; i<10000; i++) // 0~9999까지 무조건 더한다
				money++;
		};

		Runnable task2 = () -> {
			for(int i = 0; i<10000; i++) //0~9999까지 무조건 뺀다
				money--;
		};
		
		// 스레드 객체 생성
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		// 실행
		t1.start();
		t2.start();
		
		// 0이 나오지 않는다. 동시에 실행되어 언제 멈출지 모르기 때문에 0이 나오지 않는다
		
		/*
		생성된 스레드가 하나의 작업을 완료하기를 기다리는 기능을 수행한다
		즉, 해당 스레드가 하나의 작업이 종료되기를 기다렸다가 
		다음 스레드를 실행한다. 스레드의 동시접근을 제한하는 기능을 가지고 있다
		 */
		t1.join(); // t1이 참조하는 스레드의 종료를 기다림. t1 스레드 멈춤
		t2.join(); // t2이 참조하는 스레드의 종료를 기다림. t2 스레드 멈춤
		
		// 스레드가 종료되면 출력을 진행함. 위 join의 영향
		System.out.println(money);
	}

}
