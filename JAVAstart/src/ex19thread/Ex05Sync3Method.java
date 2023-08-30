package ex19thread;

class SumMulti2
{
	// 멤버 변수와 생성자 정의
	int num;
	public SumMulti2()
	{
		num=0;
	}
	
//	//동기화 방법1 : 동기화 메서드
//	synchronized public void addNum(int n)
//	{
//		num += n;
//	}

	// 동기화방법2: 동기화 블럭
	public void addNum(int n)
	{
		synchronized (this)
		{
			num += n;
		}
		
	}
	
	//멤버변수를 반환하는 getter 메서드
	public int getNum()
	{
		return num;
	}
}

//쓰레드로 정의한 클래스
class MultiAdderThread2 extends Thread
{
	// 앞에서 정의한 공유객체를 멤버변수로 선언
	SumMulti2 sumInst;
	int start, end;
	
	// 생성자에서는 멤버변수 초기화
	public MultiAdderThread2(SumMulti2 sum, int s, int e)
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
public class Ex05Sync3Method
{

	public static void main(String[] args)
	{
		SumMulti2 s = new SumMulti2();
		MultiAdderThread2 mat1 = new MultiAdderThread2(s, 1, 5000);
		MultiAdderThread2 mat2 = new MultiAdderThread2(s, 5001, 10000);
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
		System.out.println("1~10000까지의 합:"+s.getNum());  // 동기화 성공
	}

}
