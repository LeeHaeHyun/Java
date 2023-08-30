import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex12_SyncArrayList1
{
	// 스태틱 영역에 리스트 객체 생성 : 언제든지 불러올 수 있게 하기 위해
	public static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) throws InterruptedException
	{
		// 정수 10개를 추가
		for (int i = 0; i < 10; i++)
			list.add(i);
		System.out.println(list); // 리스트 출력

		//스레드 생성
		Runnable task = () -> {
			// 리스트 반복자
			ListIterator<Integer> itr = list.listIterator();
			
			while (itr.hasNext())
				// 리스트값에 1씩 더하기
				itr.set(itr.next() + 1);
		};
		
		// 5개 처리할 수 있는 스레드 풀 생성
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
