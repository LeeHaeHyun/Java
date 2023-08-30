import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/*
TreeMap은 이진트리를 기반으로 한 Map 컬렉션입니다.
	: TreeMap은 키와 값이 저장된 Map, Etnry를 저장한다는 점입니다.
	TreeMap은 일반적으로 성능이 HashMap보다 떨어집니다.
	추가나 삭제도 HashMap보다 오래 걸립니다. (TreeMap은 데이터를 저장할 때 즉시 저장함)
 */
public class Ex16_TreeMapKeySet
{
	public static void main(String[] args)
	{
		TreeMap<String, Integer> map = new TreeMap<>();
		
		//key-Value 기반 데이터 저장 <= 키값에 벨류값을 저장
		map.put("홍길동", 20); 
		map.put("전우치", 25);
		map.put("손오공", 27);
			
		//Key만 담고 있는 컬렉션 인스턴스 생성
		Set<String> ks = map.keySet();
		
		//전체 Key 출력 (향상된 for문 기반)
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
	}
}
