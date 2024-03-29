import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex15_HashMapKeySet
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> map = new HashMap<>();

		//key-Value 기반 데이터 저장 <= 키값에 벨류값을 저장
		map.put("홍길동", 20); 
		map.put("전우치", 25);
		map.put("손오공", 27);
		
		/*
		출력하기
			키값을 모를때 ( 키값이 너무 많아서 하나씩 명시하기 힘들때)
			: keySet()을 호출하여 Key값을 Set컬렉션으로 얻어온다.
			해당 반환값을 확장 for문으로 추출하고, 이를 통해 저장된 값을 추출할 수 있다.
			Map 계열의 컬렉션은 처음부터 확장 for문을 사용하는 것은 불가능하다.
		 */
		//Key만 담고 있는 컬렉션 인스턴스 생성
		Set<String> ks = map.keySet();
		
		for (String s : ks)
			System.out.print(s + '\t');
		System.out.println();
		
		//전체 Value 출력 (향상된 for문 기반)
		for (String s : ks)
			System.out.print(map.get(s).toString() + '\t');
		System.out.println();		
		
		//전체 Value 출력 (반복자 기반) <= 수정할 수 있음
		for(Iterator<String> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next()).toString() + '\t');
		System.out.println();
		
		//추가
		/*
		출력하기
			이터레이터 사용
			: 이터레이터를 통해 출력할 때도 keyset()을 통해 key값을 먼저
			얻어온 후에 반복 출력한다.
		 */
		System.out.println("[이터레이터 사용하기]");
		// key를 통해 이터레이터 객체를 생성한다.
		Iterator<String> itr = ks.iterator();
		// key가 있는지 확인한 후...
		while(itr.hasNext())
		{
			// 존재하면 Key를 얻어온다.
			String key = itr.next();
			// key를 통해 Value를 추출한다.
			Integer value = map.get(key);
			System.out.println(String.format("%s:%S", key, value));
		}
		
		/*
		 객체의 존재유무 확인
		 	: MAP컬렉션은 key와 Value가 있으므로 해당 메소드도 2개로
		 	나눠져있다. 
		 */
		System.out.println(map.containsKey("홍길동") 
				? "홍길동 키값 있다" : "홍길동 키값 없다");
		System.out.println(map.containsKey("멀린") 
				? "멀린 키값 있다" : "멀린 키값 없다");
		System.out.println(map.containsValue(20) 
				? "20 있다" : "20 없다");
		System.out.println(map.containsValue(29) 
				? "29 있다" : "29 없다");
		
		/*
		 객체 삭제
		 	: Key를 통해 삭제하고 삭제에 성공하면 해당 Value반환된다.
		 */
		System.out.println("삭제된 객체:" + map.remove("전우치"));
		System.out.println("[전우치 키값을 삭제후 출력]");
		for (String s : ks)
			System.out.print(String.format("%s:%S ", s, map.get(s)));
		System.out.println();	
		
		/*
		 전체 삭제
		 	: removeAll()은 없고, clear()만 사용할 수 있다.
		 */
		map.clear();
		System.out.println("전체 삭제 후 객체수 : " + map.size());
	}
}
