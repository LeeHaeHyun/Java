import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringDesc implements Comparator<String>
{
	@Override //오름차순 정렬을 바꾸면서 내림차순으로 바꿈
	public int compare(String s1, String s2)
	{
		return s2.compareTo(s1); // 뒤의 것과 앞의 것을 바꿈, 내림차순
	}
}
public class Ex18_CollectionsSort2
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("전우치");
		list.add("손오공");
		list.add("해리포터");
		
		// 정렬 : 오름차순, String은 기본적으로 오름차순으로 정렬
		Collections.sort(list);
		System.out.println(list);
		
		// 우리가 만든 비교조건이 있는 클래스 객체 생성
		StringDesc cmp = new StringDesc();
		
		// 정렬 : 내림차순
		Collections.sort(list, cmp); // compare 메소드로 비교조건이 내림차순 변경
		System.out.println(list);
	}
}