import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex17_CollectionsSort
{
	public static void main(String[] args)
	{
		// 변경이 불가능한 리스트
		List<String> list = Arrays.asList("홍길동", "전우치" , "손오공", "멀린", "오즈");
		
		// ArrayList로 변경
		list = new ArrayList<>(list);
		
		// 정렬 이전 출력
		System.out.println(list);
		
		// 정렬 메소드로 리스트를 정렬. 원본 데이터가 변경가능함(ArrayList이기 때문에)
		Collections.sort(list);
		
		// 정렬 이후 출력
		System.out.println(list);
	}
}
