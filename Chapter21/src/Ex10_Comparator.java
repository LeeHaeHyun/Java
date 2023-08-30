import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
Comparator<T>:
	기본 정렬 조건이 있다고 하더라도 새로운 정렬 조건을 주고 싶을 때 사용
 */
class MyStringComparator implements Comparator<String>
{
	@Override
	public int compare(String s1, String s2)
	{
		//길이가 동일한 데이터는 추가되지 않는다. <= 이 조건을 적용
		//길이가 같으면 0으로 출력되어 빠진다
		return s1.length() - s2.length();
	}
}
public class Ex10_Comparator
{

	public static void main(String[] args)
	{
//		Set<String> tree = new TreeSet<>();
		Set<String> tree = new TreeSet<>(new MyStringComparator());
		tree.add("홍길동");
		tree.add("전우치");
		tree.add("전우치");
		tree.add("멀린");
		tree.add("해리포터");
		
		for(String s : tree)
			System.out.println(s.toString() + '\t');
		
		System.out.println();
	}

}
