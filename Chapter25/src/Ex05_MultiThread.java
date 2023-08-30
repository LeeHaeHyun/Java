// 둘 이상의 스레드 생성
public class Ex05_MultiThread
{
	public static void main(String[] args)
	{
		Runnable task1 = () -> { // 람다식으로 내부에 만드는 것을 많이 씀
			try
			{
				for (int i=0; i<20; i=i+2) // 20 미만 짝수 출력
				{
					System.out.print(i + " ");
					/*
					기본적으로 우선순위가 높은 스레드가 먼저 실행되지만
					sleep()메소드를 사용하면 실행중 잠깐씩 블럭상태로 전환되어
					우선순위가 낮은 스레드도 실행될 수 있는 기회가 생기게 된다.
					 */
					Thread.sleep(1000); // 1초 쉰다.
				}
			}
			catch(InterruptedException e) { }
		};
	
		Runnable task2 = () -> { // 람다식으로 내부에 만드는 것을 많이 씀
			try
			{
				for (int i=9; i>0; i--) // 10 미만 수 출력
				{
					System.out.print("(" + i + ") ");
					Thread.sleep(500); // 0.5초 쉼
				}
			}
			catch(InterruptedException e) { }
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start(); // 각각 실행이라 출력순서가 컴환경에 따라 같지 않음
	}
}