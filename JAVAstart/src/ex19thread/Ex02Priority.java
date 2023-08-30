package ex19thread;

/*
 쓰레드의 우선순위
 setPriority (우선순위) : 쓰레드의 우선순위를 지정
 getPriority() : 우선순위를 반환
 */
class MessageSendingThread extends Thread
{
	//멤버변수와 생성자 1(이름만 지정)
	String message;
	public MessageSendingThread(String str)
	{
		message = str;
	}
	// 생성자 2 : 이름과 우선 순위까지 지정
	public MessageSendingThread(String str, int pri)
	{
		message = str;
		setPriority(pri);
	}
	
	public void run() 
	{
		for (int i=1; i<=1000; i++)
		{
			System.out.println(message + i +"("+ getPriority() + ")");
			try {
				/*
				sleep 메소드를 사용하면 실행중 잠깐씩 블럭상태로 전환하여 
				우선순위가 낮은 쓰레드도 실행될 수 있는 기회가 생긴다.
				 */
				sleep(1);
			}
			catch (InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
public class Ex02Priority
{

	public static void main(String[] args)
	{
		/*
		1단계실행
		: 우선순위가 부여되지 않은 상태로 쓰레드 객체 생성하면 동일한 우선순위가 부여된다
		 */
//		MessageSendingThread tr1 = new MessageSendingThread("첫번째");
//		MessageSendingThread tr2 = new MessageSendingThread("두번째");
//		MessageSendingThread tr3 = new MessageSendingThread("세번째");

		/*
		2단계실행
		: Thread 클래스의 정적 상수를 이용해서 우선순위를 부여한다
		순서대로 10, 5, 1의 우선순위를 부여하게 된다
		상수대신 정수로 부여해도 된다
		 */
		// 첫번째를 가장 높은 우선순위 > 두번째를 보통 > 세번째를 낮은 우선순위
		MessageSendingThread tr1 = new MessageSendingThread("첫번째", Thread.MAX_PRIORITY);
		MessageSendingThread tr2 = new MessageSendingThread("두번째", Thread.NORM_PRIORITY);
		MessageSendingThread tr3 = new MessageSendingThread("세번째", Thread.MIN_PRIORITY);
		
		tr1.start();
		tr2.start();
		tr3.start();
	}

}
