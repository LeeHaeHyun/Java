import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex04_Convert
{

	public static void main(String[] args)
	{
		// 매개변수로 전달된 객체들을 저장한
//		컬렉션 객체의 생성 및 반환
		// 이렇게 생성된 리스트 인스턴스는 Immutable(불변) 객체 = 생성 후 그 상태를 바꿀 수 없는 객체

		List<String> list = Arrays.asList("홍길동", "전우치", "손오공", "전우치");
//		List.add("멀린"); 실행하면 에러, 배열은 추가 불가
		
		list = new ArrayList<>(list); //mutable 객체로 변환 ( ArrayList로 )
		list.add("해리포터"); //에러 안남, 추가 가능 특성
		
		// ArrayList<E> 객체의 순환 
		for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
			System.out.print(itr.next() + '\t');
		System.out.println();
		
//		Iterator<String> itr = list.iterator();
//		//반복자를 이용한 순차적 참조
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next() + '\t');
//		}
//		System.out.println();
//		
		//ArrayList<E>를 LinkedList<E>로 변환. 자식을 부모에게 대입 가능
		list = new LinkedList<>(list);
		
		// LinkedList<E> 객체의 순환
		for(String s : list)
			System.out.print(s + '\t');
		System.out.println();
	}

}
