import java.util.LinkedList;
import java.util.Queue;

/*
queue: 줄을 서서 기다린다는 것처럼 먼저 들어오면 데이터가 먼저 나가는 형식
 */
public class Ex12_Queue
{
	public static void main(String[] args)
	{
		Queue<String> que = new LinkedList<>(); //LinkedList<>로 구현됨
		
		// 데이터 저장
		que.offer("A");
		que.offer("B");
		que.offer("C");
		System.out.println(que.size()); // 남은 데이터 확인
		
		// 리스트 확인
		for(String s : que)
			System.out.println(s.toString() + '\t');
		System.out.println();
		System.out.println("================================");
		
		// 무엇이 다음에 나올지 확인
		System.out.println("next: " + que.peek());
		// 첫번째 객체 꺼내기
		System.out.println(que.poll()); // 꺼내면 다시 사용 못함 없어짐
		System.out.println(que.size()); // 남은 데이터 확인 하기
		System.out.println("================================");
		
		// 무엇이 다음에 나올지 확인
		System.out.println("next: " + que.peek());
		// 두번째 객체 꺼내기
		System.out.println(que.poll()); // 꺼내면 다시 사용 못함 없어짐
		System.out.println(que.size()); // 남은 데이터 확인 하기
		System.out.println("================================");
		
		// 무엇이 다음에 나올지 확인
		System.out.println("next: " + que.peek());
		// 세번째 객체 꺼내기
		System.out.println(que.poll()); // 꺼내면 다시 사용 못함 없어짐
		System.out.println(que.size()); // 남은 데이터 확인 하기
	}
}
