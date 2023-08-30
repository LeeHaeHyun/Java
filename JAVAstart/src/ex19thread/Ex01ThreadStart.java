package ex19thread;

/*
Thread(쓰레드)
- 쓰레드의 생성은 thread클래스를 상속하는 것부터 시작
 */
class ShowThread extends Thread
{
	//멤버변수와 생성자 정의
	String threadName;
	
	public ShowThread(String name)
	{
		threadName = name;
	}
	/*
	 run() 메소드는 쓰레드의 main() 메서드에 해당한다
	 Thread 클래스의 run 메소드는 오버라이딩 한 것으로 해당 메서드는 직접 호출하면 안되고
	 ★★★ start() 메서드를 통해 간접적으로 호출해야 한다.
	 만약, 직접 호출하면 단순한 실행만 될뿐 쓰레드가 생성되지 않는다.
	 */
	@Override
	public void run() // 쓰레드 호출 메소드
	{
		//100번 반복한다
		for(int i=1; i<=100; i++)
		{
			System.out.println("안녕하세요.["+threadName+"]입니다.");
			try {
				sleep(10);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class Ex01ThreadStart
{
	public static void main(String[] args)
	{
		//쓰레드 객체 생성
		ShowThread st1 = new ShowThread("쓰레드1st");
		ShowThread st2 = new ShowThread("Thread2nd");
		
		//쓰레드 객체를 통해 실행
		st1.start(); //start 메소드를 통해 쓰레드 생성
		st2.start();

//		st1.run();
//		st2.run();
	}

}
