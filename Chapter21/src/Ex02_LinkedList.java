import java.util.LinkedList;
import java.util.List;

/*
LinkedList<E> : list계열의 컬렉션
- 데이터의 중복 저장이 허용된다.
- 데이터의 저장 순서를 보장한다
- 데이터 접근시 get() 혹은 iterator()를 이용한다
- linked라는 연결기반 자료 구조, 앞의 자료 구조에서 본 리스트를 구성하여 객체를 저장
- arraylist()보다 데이터 추가 및 삭제가 용이하다
 */
public class Ex02_LinkedList
{
	public static void main(String[] args)
	{
		List<String> list = new LinkedList<>();
		
		// 객체 저장 : 순서 있음. 중복 허용
		list.add("orange"); 
		list.add("apple");
		list.add("apple");
		list.add("banana");
		
		list.add(2, "mango"); //중간에 삽입이 편함, 3번째에 망고를 넣는다
		
		//객체 참조, 일반 for문 사용
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t'); // data를 부를 때 get() 사용
		System.out.println();
		
		//첫번째 객체 삭제
		list.remove(2); // 세번째 데이터가 삭제되면 나머지 순서가 앞으로 당겨짐
		
		//삭제 후 객체 참조
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
	}
}
