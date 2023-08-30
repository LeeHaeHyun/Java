import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex13_SyncArrayList2
{
	public static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) throws InterruptedException
	{
		for (int i = 0; i < 10; i++)
			list.add(i);
		System.out.println(list);

		Runnable task = () -> {
			// synchronized로 동기화 처리
			// list 객체를 사용할 때 객체에 동기화 Lock을 설정 그러면 제대로 나옴
			synchronized(list)
			{
				ListIterator<Integer> itr = list.listIterator();
				
				while (itr.hasNext())
					itr.set(itr.next() + 1);
				
//				for문으로 변경
//				for (ListIterator<Integer> itr = list.listIterator(); itr.hasNext();)
//					itr.set(itr.next() +1);
			}
		};
		
		ExecutorService pool = Executors.newFixedThreadPool(5);
		
		// 뒤죽박죽 섞인다. 동기화를 하지 않아서 
		pool.submit(task); // +1
		pool.submit(task); // +1
		pool.submit(task); // +1
		pool.submit(task); // +1
		pool.submit(task); // +1
		
		pool.shutdown(); // 스레드 풀 종료
		// 안전하게 종료되기까지 기다림
		pool.awaitTermination(100, TimeUnit.SECONDS);
		
		// 값 출력
		System.out.println(list); // 똑같이 나오지는 않음
	}
}