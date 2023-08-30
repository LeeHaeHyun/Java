import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex19_CollectionsSearch
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("전우치");
		list.add("손오공");
		list.add("멀린");
		
		// 검색하기전에 정렬
		Collections.sort(list);
		System.out.println(list);
		
		// 탐색 <= 정렬하고 해야 함s
		// 검색되면 해당 인덱스가 반환됨.
		int idx1 = Collections.binarySearch(list, "홍길동"); // 0번째부터 3번째라서 3이 출력됨
		System.out.println(idx1);
		
		int idx2 = Collections.binarySearch(list, "강감찬"); // ㄱ,ㄴ,ㄷ 순으로 순서에 맞게 마이너스가 출력된다
		// 해리포터 -4 , 강감찬 -1 번째
		// 없으면 마이너스 값 출력 
		System.out.println(idx2);	
	}
}
