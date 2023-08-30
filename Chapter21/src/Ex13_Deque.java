import java.util.ArrayDeque;
import java.util.Deque;

// deque :
//덱(Deque)은 어떤 쪽으로 입력하고 어떤 쪽으로 출력하느냐에 따라
//스택(Stack)으로 사용할 수도 있고 큐(queue)로 사용할 수 있다
//한쪽으로만 입력 가능하도록 설정한 것을 스크롤(scroll)
//한쪽으로만 출력 가능하도록 설정한 덱은 셀프(shelf)
public class Ex13_Deque
{

	public static void main(String[] args)
	{
		// 둘 다 사용 가능
		Deque<String> deq = new ArrayDeque<>();
//		Deque<String> deq = new LinkedList<>();
		
		// 앞으로 넣고 : 
		deq.offerFirst("A");
		deq.offerFirst("B");
		deq.offerFirst("C");
		
		// 리스트 확인
		for(String s : deq)
			System.out.print(s.toString() + '\t');
		System.out.println();
		
		// 앞으로 꺼내기
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		
		System.out.println("---------------------"); // 이것이 스택
		
		// 뒤로 넣고
		deq.offerLast("A");
		deq.offerLast("B");
		deq.offerLast("C");
		
		// 리스트 확인
		for(String s : deq)
			System.out.print(s.toString() + '\t');
		System.out.println(); // A먼저 넣고 B C 순서대로 넣음
		
		// 뒤에서 꺼내기
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		
		System.out.println("---------------------"); // 이것이 스택
		
		// 뒤로 넣고
		deq.offerLast("A");
		deq.offerLast("B");
		deq.offerLast("C");
		
		// 리스트 확인
		for(String s : deq)
			System.out.println(s.toString() + '\t');
		System.out.println();
		
		// 앞으로 꺼내기
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		
		System.out.println("---------------------"); // 이것이 큐
	}
}
