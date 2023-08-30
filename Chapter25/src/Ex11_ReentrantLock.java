import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/*
ReentrantLock(명시적 동기화) : 눈으로 볼 수 있는 동기화
	synchronized와 같이 동기화를 제공하지만
	동기화의 시작과 끝을 지정할 수 있는 객체
	사용법은 간단하다. lock, unlock 메소드를 통해 시작과
	종료를 명시적으로 작성해줄 수 있다.
 */
//스레드에서 사용할 클래스 정의
class BankAccount
{
	// 동기화에 사용할 ReentrantLock 클래스
	ReentrantLock myLock = new ReentrantLock();
	int money = 0;
	
	public void deposit()
	{
		myLock.lock(); // 락 언락으로 동기화, 명시적 동기화 시작점
		money++;
		myLock.unlock(); // 명시적 동기화
	}
	
	public void withdraw()
	{
		myLock.lock(); // 락 언락으로 동기화
		money--;
		myLock.unlock(); // 명시적 동기화
	}
	
	public int balance()
	{
		return money;
	}
}

public class Ex11_ReentrantLock
{
	// 스태틱 영역에 객체 생성 : 언제든지 불러올 수 있기 때문에
	public static BankAccount account = new BankAccount(); 

	public static void main(String[] args) throws InterruptedException
	{
		Runnable task1 = () -> {
			for (int i=0; i<10000; i++)
				account.deposit();
		};
		
		Runnable task2 = () -> {
			for (int i=0; i<10000; i++)
				account.withdraw();
		};
		
		// 2개의 스레드풀 생성
		ExecutorService pool = Executors.newFixedThreadPool(2);
		pool.submit(task1);
		pool.submit(task2);
		
		pool.shutdown(); // 스레드풀 종료
		// 안전하게 종료되기까지 기다림(0.1초 기다림)
		pool.awaitTermination(100, TimeUnit.SECONDS);
		
		//값 출력
		System.out.println(account.balance());
	}
}
