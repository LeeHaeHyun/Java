package ex17collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

public class Ex03ArrayList2
{

	public static void main(String[] args)
	{
		/*
		아래 2개의 컬렉션은 내부적인 자료의 구조만 다룰뿐 방법은 차이가 없다 
		 */
		LinkedList<Student> list2 = new LinkedList<Student>();
		//ArrayList<Student> list2 = new ArrayList<Student>();
		
		// 저장할 객체 생성, 외부 패키지에 정의되었으므로 반드시 import 필요
		Student st1 = new Student("정우성", 10, "2018");
		Student st2 = new Student("원빈", 20, "2017");
		Student st3 = new Student("장동건", 30, "2016");
		Student st4 = new Student("공유", 40, "2015");

		//컬렉션에 객체 추가
		list2.add(st1); // 인덱스 0
		list2.add(st2); 
		list2.add(st3); 
		list2.add(st4); // 인덱스 3

		//list컬렉션이므로 중복 저장이 가능하다. 인덳스를 구분할 수 있다.
		list2.add(st2); // 리스트이므로 중복저장 가능
		
		/*
		일반 for문 사용을 위해 size()메소드로 추가된 객체의 갯수를 반환 한다
		또한 index객체에 접근해야 하므로 get()메소드를 사용
		 */
		System.out.println("[출력1-일반for문]");
		for(int i=0; i<list2.size(); i++)
		{
			System.out.println(list2.get(i));
		}
		
		/*
		 객체의 참조값을 통해 삭제하는 경우 boolean값이 반환 
		 또한 동일한 객체가 존재한다면 앞에 있는 객체가 먼저 삭제 
		 즉, 동시에 삭제되지 않는다
		 */
		boolean removeOk = list2.remove(st2); // 원빈 삭제
		System.out.println("인스턴스를 통한 삭제:"+ removeOk);
		
		/*
		컬렉션에 저장된 내용을 이터레이터에게 알려준 후 
		출력할 원소가 있는지 확인하여 true 반환되면 종료
		 */
		System.out.println("[출력2-이터레이터]");
		Iterator<Student> it2 = list2.iterator();
		while(it2.hasNext())
		{
			// 참조값을 출력하면 tostring() 오버라이딩한 내용이 출력
			System.out.println(it2.next());
			// 이름만 출력하고 싶다면 getName 메소드 사용
			System.out.println(it2.next().getName());
		}
		
		/*
		시나리오 ] 컬렉션에 저장된 객체를 이름으로 검색하여 삭제할 수 있는 코드
	
		 */
		int idx = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요:");
		
		// 리스트에 저장도니 객체의 갯수만큼 반복
		String removeName = scanner.nextLine();
		
		for(Student st : list2)
		{
			/*
			 이름으로 검색시 멤버변수 name은 private로 getter을 통해 접근해야 한다
			 */
			if(removeName.equals(st.getName()))
			{
				// 정보가 일치하는 객체를 찾았다면 참조값을 통해 삭제한다
				list2.remove(st);
				// 객체를 삭제하면 즉시 반복문 탈출
				break;
			}
		}
		System.out.println("현재 객체수:" + list2.size());
		
		System.out.println("삭제된 객체의 이름:"+ list2.remove(2).getName());
		System.out.println("[출력3-확장for문]");
		for(Student st : list2)
		{
			System.out.println(st);
		}
	
	}

}
