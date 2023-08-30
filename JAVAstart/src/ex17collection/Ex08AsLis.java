package ex17collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Ex08AsLis
{
	// List 컬렉션을 매개변수로 받은 후 전체를 출력
	public static void listPrint(String title, List<String> list)
	{
		System.out.println("# "+ title);
		/*
		출력할 내용이 string 이므로 별도의 오버라이딩 없이도 내용 출력이 가능하다.
		만약 우리가 직접 정의한 클래스라면 tostring()메서드를 오버라이딩해야 한다
		 */
		for(Object ob : list)
		{
			System.out.println(ob + " ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		/*
		String 객체 배열 생성 및 초기화
		 */
		String[] strArr = new String[] {"마린", "파이어뱃", "메딕", "마린"};
		
		/*
		Array.asList() : 일반적인 배열을 list<E>로 변경해서 반환한다
		단, 값을 참조만 할 수 있고 변경(입력, 삭제)는 할 수 없다.
		 */
		List<String> list = Arrays.asList(strArr); // Arrays 배열
		listPrint("출력1", list);
		
//		list.add("탱크"); //에러 발생: 현재 상태에서는 데이터를 추가할 수 없다.
		
		//ArrayList<E> 생성자를 통해 객체를 복사하면 데이터를 변경할 수 있다
		list = new ArrayList<String>(list);
		
		//복사한 이후에는 데이터를 추가할 수 있다
		boolean isAdd = list.add("탱크");
		System.out.println("add결과:"+ isAdd);
		listPrint("출력2", list);
		
		/*
		이터레이터를 for문을 이용해서 출력한다
		for(초기값(이터레이터 객체 생성) ; 조건식(hasNext()) ; 증감식(next())
		{
			sysou(itr.next() + "");
		}
		 */
		System.out.println("# 출력3");
		for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		/*
		Set<E> 컬렉션은 중복을 허용하지 않으므로 List에 저장된 중복값을
		아래와 같이 제거할 수 있따.
		 */
		//Set으로 복사할 때 중복값이 제거
		HashSet<String> set = new HashSet<String>(list);
		//다시 List로 만들어서 출력
		list = new ArrayList<String>(set);
		listPrint("출력4", list);
	}
}
