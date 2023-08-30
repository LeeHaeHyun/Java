package ex19thread;

/*
쓰레드로 구현하지 않은 일반적인 클래스
: 하나의 클래스가 작업을 완료해야 다음 클래스의 작업을 진행할 수 있습니다.
즉 동시에 작업을 진행할 수 없다 <= 쓰레드는 가능하다.
 */
class NormalClass
{
	String title;
	public NormalClass(String title)
	{
		this.title = title;
	}
	// 단순 10번 반복
	void classMethod()
	{
		for (int i=1; i<=10; i++)
		{
			System.out.printf("%s]i=%d%n", title, i);
		}
	}
}
/*
독립쓰레드
: main쓰레드가 종료되어도 계속 실행, Dead 상태가 되어야 실행이 종료
 */
class NormalThread extends Thread
{
	//기본 생성자를 통해 객체를 생성하면 쓰레드명이 jvm에 의해 자동부여
	public NormalThread() {}
	
	/*
	쓰레드 클래스의 생성자가 호출할 때 전달되는 인자를 get()으로 출력할 수 있다
	 */
	public NormalThread(String title)
	{
		super(title);
	}
	void threadMethod() throws InterruptedException
	{
		for(int i=1; i<=10; i++)
		{
			System.out.printf("%s]i=%d%n", getName(), i);
			sleep(2000);
		}
	}
	@Override
	public void run()
	{
		try
		{
			threadMethod();
		}
		catch(InterruptedException e) {}
	}
}

/*
 종속 쓰레드(데드 쓰레드)
 : 모든 독립쓰레드가 종료되면 자동으로 종료되는 쓰레드
 ㄴ배경음악재생, 로그자동저장 등의 업무에 많이 쓰인다
 */
class DaemonThread extends Thread
{
	@Override
	public void run()
	{
		// 무한 루프로 구성되어있고 별도의 탈출조건을 만들지 않는다
		// getName()으로 반환
		while(true)
		{
			System.out.printf("[쓰레드명:%s]Jazz가 흘러요~%n", getName());
			try
			{
				sleep(3000);
				System.out.println("3초마다 자동저장!!");
			}
			catch(InterruptedException e)
			{
				System.out.println("자동저장시 오류발생ㅜㅜ");
			}
		}
	}
}
public class Ex03DaemonThread
{

	public static void main(String[] args)
	{
		/*
		쓰레드가 구현되지 않은 일반적인 클래스의 작업으로
		순차적으로 진행되어 1번객체가 작업을 마쳐야만 2번 객체가 실행된다
		 */
		NormalClass nt1 = new NormalClass("첫번째 클래스");
		nt1.classMethod();
		new NormalClass("두번째 클래스").classMethod();
		
		// 첫번째 독립 쓰레드 생성 및 시작(우선 순위가 없어서 5로 지정)
		//쓰레드명 부여1: 생성자를 이용한다
		NormalThread yt1 = new NormalThread("1st 쓰레드");
		// 쓰레드명 부여2 : setName() 메소드를 이용한다
		//yt1.setName("First 쓰레드");
		yt1.start();
		
		// 두번째 독립 쓰레드 생성 및 시작
		// 쓰레드명을 부여하지 않아서 jvm이 자동으로 이름을 부여
		NormalThread yt2 = new NormalThread();
		// 우선 순위를 10으로 지정
		yt2.setPriority(Thread.MAX_PRIORITY);
		yt2.start();
		
		// 먼저 독립쓰레드를 생성한 후 setDaemon() 메서드로 데몬쓰레드를 만들어준다
		DaemonThread dt = new DaemonThread();
		//쓰레드명을 지정한다
		dt.setName("데몬쓰레드");
		// 여기서 데몬쓰레드가 된다
		dt.setDaemon(true);
		dt.start();
		
		//쓰레드 4개, 정적메소드를 통해 쓰레드의 여러상태를 확인 가능
		System.out.println("현재 활성화 된 상태의 쓰레드수"+ Thread.activeCount());
		System.out.println("현재 실행중인 쓰레드명:" + Thread.currentThread().getName());
		System.out.println("메인함수의 우선순위:" + Thread.currentThread().getPriority());
		System.out.println("메인함수(Main Thread) 종료");
	}
}
