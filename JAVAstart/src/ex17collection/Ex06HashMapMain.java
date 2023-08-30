package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
HashMap<K,V>
: Map<T> 인터페이스를 구현한 컬렉션
- key, value를 한쌍으로 객체를 저장한다
- Key값은 중복될 수 없다. 중복되면 기존의 데이터를 덮어쓰기
- Key값으로 검색하므로 다른 컬렉션에 비해 속도가 빠르다
- 저장순서는 유지되지 않는다
 */
public class Ex06HashMapMain
{
	public static void main(String[] args)
	{
		//map컬렉션 생성, key와 value 모두 string 객체러 선언
		HashMap<String, String> map = new HashMap<String, String>();
		
		//객체 저장
		//객체 저장시 기존에 저장된 동일한 key값이 존재하면 이전에 저장된 객체가 반환
		//처음 입력이라면 null로 반환
		System.out.println("name이라는 키값으로 저장된 이전의 값:"+ map.put("name", "홍길동"));

		int number = 20;
		//int형은 string형으로 형변환할 수 없어서 타입에러 발생
//		map.put("age", number);
		
		//숫자를 문자열로 변경한 후 저장
		map.put("age", String.valueOf(number));
		map.put("gender", "남자");
		map.put("address", "가산디지털단지");
		System.out.println("저장된 객체수:"+ map.size());
		System.out.println(map);
		System.out.println();
		
		//중복 저장
		//기존에 입력된 key값 name이 이미 있으므로 '홍길동' 반환
		//기존의 값은 '최길동'으로 덮어쓰기합니다.
		System.out.println("name이라는 키값으로 저장된 이전의 값:"+ map.put("name", "최길동"));
		System.out.println("키값으로 중복 저장후 객체수:"+ map.size());
		System.out.println();
		
		//출력하기
		//1. 키값을 알고 있을 때 : get(key값)으로 출력
		System.out.println("키값을 알때:" + map.get("name"));
		System.out.println();
		
		//2. 키값을 모를 때( 혹은 너무 많아서 하나씩 명시하기 힘들 때)
//		: keySet()을 호출해서 key값을 set컬렉션으로 얻어온다
//		해당 반환값을 확장 for문으로 추출하고, 이를 통해 추출
		
		Set<String> keys = map.keySet();
		System.out.println("[확장for문 적용]");
		for(String key : keys)
		{
			//get(key값)을 통해 value를 출력한다
			String value = map.get(key);
			System.out.println(String.format("%s:%s", key, value));
		}
		
		//3. 이터레이터를 통한 출력
		//keyset()을 통해 key값을 먼저 얻어온 후 반복 출력
		System.out.println("[이터레이터 사용하기]");
		// map의 전체 key값을 얻어온 후
		Set<String> keys2 = map.keySet();
		
		//key를 통해 이터레이터 객체를 생성
		Iterator<String> it = keys2.iterator();
		
		//key가 있는지 확인한후
		while(it.hasNext())
		{
			String key = it.next(); // 존재하면 키값 얻기
			String value = map.get(key); //key를 통해 벨류값 얻기
			System.out.println(String.format("%s:%s", key, value));
		}
		
		//Value만 얻어와야 할 때 value 메소드를 통해 추출 그리고 확장된 for문으로 출력
		System.out.println("[value값들만 출력하기]");
		Collection<String> values = map.values();
		for(String value : values)
		{
			System.out.println(value);
		}
		
		//존재유무확인(containKey)
//		: map 컬렉션은 key와 value가 있으므로 해당 메소드로 2개로 나눠져있다
		System.out.println(map.containsKey("name") ? "name키값있다" : "name키값없다");
		System.out.println(map.containsKey("account") ? "account키값있다" : "account키값없다");
		System.out.println(map.containsKey("남자") ? "남자 있다" : "남자 없다");
		System.out.println(map.containsKey("여자") ? "여자 있다" : "여자 없다");
		
		//객체삭제
//		: key를 통해 삭제하고 삭제에 성공하면 해당 value가 반환된다
		System.out.println("삭제된 객체:" + map.remove("age"));
		System.out.println("[age키값을 삭제후 출력]");
		for(String key : keys)
		{
			System.out.println(String.format("%s:%s", key, map.get(key)));
		}
		
		//전체 삭제
//		: removeAll()은 없고, clear()만 사용할 수 있다.
		map.clear();
		System.out.println("전체삭제후 객체수:" + map.size());
	}

}
