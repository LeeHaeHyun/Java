package ex19thread;

class Sum
{
	int num;
	public Sum()
	{
		num = 0;
	}
	
	// 메소드 호출시 전달되는 인수의 값을 누적해서 멤버변수에 더한다
	public void addNum(int n)
	{
		num += n; // 복합연산: 계속 더함
	}
	public int getNum()
	{
		return num;
	}
}

/*
쓰레드를 생성하는 두번째 방법
: 자바는 다중상속을 지원하지 않아서 Runnable 인터페이스를 구현해서 쓰레드 클래스를 정의
 */
class AdderThread extends Sum implements Runnable
{
	int start, end;
	public AdderThread(int s, int e)
	{
		start = s;
		end = e;
	}
	@Override
	public void run()
	{
		for(int i=start; i<=end; i++)
		{
			System.out.println("i="+ i);
			addNum(i);
		}
	}
}

public class Ex04Runnable
{
	public static void main(String[] args)
	{
		/*
		Runnable
		 */
		AdderThread at1 = new AdderThread(1, 500);
		AdderThread at2 = new AdderThread(501, 1000);
		
		Thread thread1 = new Thread(at1);
		Thread thread2 = new Thread(at2);
		
		thread1.start();
		thread2.start();
		
		try
		{
			thread1.join();
			thread2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("1~1000까지의 합:"+ (at1.getNum()+at2.getNum()));
	}
}
