package ex19thread;

//2개의 쓰레드가 공유객체로 사용할 클래스
class SumMulti
{
	// 멤버 변수와 생성자 정의
	 num;
	public SumMulti()
	{
		num=0;
	}
	
	/*
	쓰레드의 run()메서드에서 호출하는 메서드로 매개변수로 전달되는 n을
	멤버변수에 누적해서 더한다. 여기서는 2개의 쓰레드가 5천번씩 각각 호출하고 있다.
	 */
	public void addNum(int n)
	{
		num += n;
	}
	//멤버변수를 반환하는 getter 메서드
	public int getNum()
	{
		return num;
	}
}

// 쓰레드로 정의한 클래스
class MultiAdderThread extends Thread
{
	// 앞에서 정의한 공유객체를 멤버변수로 선언
	SumMulti sumInst;
	int start, end;
	
	// 생성자에서는 멤버변수 초기화
	public MultiAdderThread(SumMulti sum, int s, int e)
	{
		sumInst = sum;
		start = s;
		end = e;
	}
	public void run()
	{
		for(int i=start; i<=end; i++)
		{
			sumInst.addNum(i);
		}
	}
}
public class Ex05Sync1Error
{

	public static void main(String[] args)
	{
		SumMulti s = new SumMulti();
		MultiAdderThread mat1 = new MultiAdderThread(s, 1, 5000);
		MultiAdderThread mat2 = new MultiAdderThread(s, 5001, 10000);
		mat1.start();
		mat2.start();
		try
		{
			mat1.join();
			mat2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		// 멤버변수 num을 출력한다.
		System.out.println("1~10000까지의 합:"+s.getNum());  // 동기화를 하지 않은 에러
	}

}
