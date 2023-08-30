
public class Ex07_SyncMethod
{
	public static int money = 0;
	
	/*
	스레드의 동기화
	: synchronized 선언으로 인해 정확한 결과가 나오지만 시간이 기존에 비해 길어지는 단점
	 */
	
	// 스레드의 문제점을 해결하기 위해 메소드로 호출. 메소드 전체를 동기화
	public synchronized static void deposit()
	{
		money++;
	}
	
	public synchronized static void withdraw()
	{
		money--;
	}

	public static void main(String[] args) throws InterruptedException
	{
		Runnable task1 = () -> {
			for(int i = 0; i<10000; i++) // 0~9999까지 무조건 더한다
				deposit(); // 호출하는 동안 기다리게 되어 시간은 길어지나 정확한 값을 반환한다
		};

		Runnable task2 = () -> {
			for(int i = 0; i<10000; i++) //0~9999까지 무조건 뺀다
				withdraw();
		};
		
		// 스레드 객체 생성
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		// 동시 실행
		t1.start();
		t2.start();
		
		t1.join(); // t1이 참조하는 스레드의 종료를 기다림. t1 스레드 멈춤
		t2.join(); // t2이 참조하는 스레드의 종료를 기다림. t2 스레드 멈춤
		
		// 스레드가 종료되면 출력을 진행함. 위 join의 영향
		System.out.println(money);
	}
}
