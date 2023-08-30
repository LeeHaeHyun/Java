import java.util.HashMap;
import java.util.Set;

/*
HashMap<key, value>
- Key값은 중복될 수 없다. 만약 중복되면 기존의 데이터를 덮어쓰기한다.
- key값은 검색하므로 다른 컬렉션에 비해 속도가 빠르다
- 저장 순서는 유지되지 않는다
 */
public class Ex14_HashMap // 일반 자료형으로 사용 못함
{
	
	public static void main(String[] args)
	{
		// Map컬렉션 생성. key와 value를 모두 String 객체로 선언한다
		HashMap<String, String> map = new HashMap<>();
		
		/*
		객체 저장: 객체 저장시 기존에 저장된 동일한 key값이 존재하면 이전에 저장된 객체가 반환
		만약 처음 입력이라면 null값을 반환한다
		 */
		
		//key-Value 기반 데이터 저장 <= 키값에 벨류값을 저장
		map.put("홍길동", "010-1234-1443"); // put으로 입력
		map.put("전우치", "010-4321-1446");
		map.put("손오공", "010-9876-1443");
		
		String str1 = map.get("홍길동"); // 특정위치에 값을 가져올 수 있음
		
		/*
		출력하기 : 키값을 알고 있을 때 : get(key)값으로 출력한다.
		 */
		//데이터 탐색
		System.out.println("홍길동: " + map.get("홍길동"));
		System.out.println("전우치: " + map.get("전우치"));
		System.out.println("손오공: " + map.get("손오공"));
		System.out.println();
		
		//현재까지 3개의 데이터가 저장됨.
		System.out.println("저장된 객체수:"+ map.size());
		System.out.println();
		
		//데이터 삭제
		map.remove("손오공");
		
		Set<String> ks = map.keySet(); // key 값을 가지고 오려 할 때
		for ( String s : ks)
		{
			String str2 = map.get(s);
			System.out.println(str2);
		}
		//데이터 삭제 확인
		System.out.println("손오공: " + map.get("손오공"));
		
		//데이터 재입력
		map.put("손오공", "010-9876-1443");
		System.out.println("손오공; " + map.get("손오공"));
	}
}
