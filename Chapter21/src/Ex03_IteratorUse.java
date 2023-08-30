import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex03_IteratorUse
{

	public static void main(String[] args)
	{
		List<String> list = new LinkedList<>(); // 자식 개체를 부모 개체에 대입
		
		// 객체 저장 : 순서 있음. 중복 허용
		list.add("orange");
		list.add("apple");
		list.add("apple");
		list.add("banana");
	
		/*
		향상된 for문의 경우 인덱스 없이 전체 원소를 반복해주므로 좀 더 간절한 표현이 가능
		따라서 가장 많이 사용
		 */
		// 향상된 for문으로 객체 참조 ( 데이터를 통째로 복사하여 데이터 수정이 안됨 )
		for (String s : list) // 이렇게 해도 차례대로 불러옴
			System.out.print(s + '\t');
		System.out.println();
		
		/*
		Iterator 사용
		1. 컬렉션에 저장된 내용을 Iterator 객체에게 알려주기 위해 객체를 생성
		2. hasNext()로 반환한 객체가 있는지 검사하고 next()로 해당 객체를 반환
		3. 모든 객체가 반환되었다면 false를 반환하여 반복문 탈출
		 */
		
		// 반복자 획득
		Iterator<String> itr = list.iterator();
		
		// 반복자를 이용한 순차적 참조 ( 데이터 수정이 가능 )
		String str;
		while(itr.hasNext())
		{
			str = itr.next();
			System.out.print(str + '\t');
			
			if(str.equals("orange")) // 오렌지와 같으면 제거
				itr.remove();
			
		}
		System.out.println();
		
		// 반복자 다시 획득
		itr = list.iterator();
		
		// 삭제 후 결과 확인
		while(itr.hasNext())
			System.out.print(itr.next() + '\t');
		
		System.out.println();
		
		// 추가
		/*
		수정하기 ( 덮어쓰기 )
		: 기종의 내용을 변경한다. 즉 기존의 내용은 삭제된 후 새로운 내용으로 갱신된다
		set(인덱스, 객체)
		 */
		list.set(2, "mango>덮어쓰기");
		//향상된 for문으로 객체 참조
		for (String s : list) // 이렇게 해도 차례대로 불러옴
			System.out.print(s + '\t');
		System.out.println();
		System.out.println("===========================");
		
		/*
		포함 여부 확인
			contains(객체) : 찾고자 하는 객체가 있는 경우 true를 반환한다.
				단지 존재 여부만 확인할 수 있다.
		 */
		System.out.println(list.contains("apple") ? "apple 있음" : "apple 없음"); // 있음
		System.out.println(list.contains("mango") ? "mango 있음" : "mango 없음"); // 있음
		
		/*
		삭제하기
		방법1 : 인덱스로 삭제
			remove(인덱스) : 인덱스를 통해 삭제를 진행한 후 삭제가 
				완료되면 해당 객체를 반환한다. 삭제후에는 인덱스가 
				자동으로 재부여된다. 삭제 성공시 해당 객체를 반환하므로
				어떤 객체가 삭제되었는지 확인할 수 있다.
		 */
//		indexOf를 통해 해당 객체의 인덱스를 찾은 후 삭제한다.
		int index = list.indexOf("mango>덮어쓰기"); //인덱스를 찾은 후
		System.out.println("mango>덮어쓰기의 index = " + index);
		list.remove(index);
		
		//향상된 for문으로 객체 참조
		for (String s : list) // 이렇게 해도 차례대로 불러옴
			System.out.print(s + '\t');
		System.out.println();
		System.out.println("===========================");
		
		/*
		방법2 : 인스턴스의 참조값을 통해 삭제
			이 경우에는 삭제에 성공한 경우 true가 반환된다
			즉, boolean 타입의 반환값을 가진다.
		 */
		System.out.println(list.remove("banana") ? "삭제 성공" : "삭제 실패");
		// 객체가 없으므로 삭제 실패한다.
		list.remove("apple");
		System.out.println("삭제 후 출력");
		//향상된 for문으로 객체 참조
		for (String s : list) // 이렇게 해도 차례대로 불러옴
			System.out.print(s + '\t');
		System.out.println();
		System.out.println("===========================");		
		
		/*
		전체 삭제 
			: 아래 2개의 메소드를 통해 데이터 전체를 삭제할 수 있다
		*/
		list.removeAll(list);
		list.clear();
		System.out.println("전체 삭제 후 객체수:" + list.size());
	}
}
