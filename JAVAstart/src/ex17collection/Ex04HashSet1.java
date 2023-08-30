package ex17collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;

/*
HashSet<E> : Set계열의 컬렉션
	- 객체가 순서없이 저장
	- 객체의 중복저장 비허용
	- list가 배열의 특성, set은 집합
 */
public class Ex04HashSet1
{
	public static void main(String[] args)
	{
		// Object를 기반으로 set 컬렉션을 생성했으므로 모든 객체를 저장할 수 있다
		HashSet<Object> set = new HashSet<Object>();
		
		// 다양한 기본클래스와 우리가 정의한 Teacher 클래스의 객체 생성
		String varString1 = "JAVA";
		String varString2 = new String("개발자");
		Date varDate = new Date();
		int varInt = 100; // new Integer(varInt)와 같이 Boxing되어 추가된다.
		Teacher varTeacher = new Teacher("김봉두", 55, "체육");
		
		/*객체 저장
		 	: add()메소드를 통해 저장되고, 성공하면 true 반환*/
		System.out.println("add결과:"+ set.add(varString1));
		set.add(varString2);
		set.add(varDate);
		set.add(varInt);
		set.add(varTeacher);
		
		System.out.println("[중복 저장전 객체수]:"+ set.size()); //5개
		
		/*기본 클래스의 객체 중복 저장
		 : 기본 클래스인 경우 별도의 오버라이딩 없이도 중복이 제거된다
		 따라서 아래의 add() 메소드는 false를 반환*/
		System.out.println(set.add(varString2) ? "저장성공" : "저장실패");
		// 저장 실패했으므로 5개 출력
		System.out.println("[중복 저장후 객체수]:"+ set.size());
		
		/* 이터레이터를 통한 객체 출력
		  : 순서없이 저장되므로 출력의 순서도 정할 수 없다*/
		// 1. set참조변수를 통해 iterator 객체를 생성
		Iterator itr = set.iterator();
		// 2. 추출할 데이터가 있는지 확인
		while(itr.hasNext())
		{
			// 3. 데이터가 있어 true면 next()를 통해 추출한다
			Object object = itr.next();
			/*
			 HashSet<E>에 저장시 모두 Object형으로 자동형변환 되어 저장
			 instanceof를 통해 타입을 확인 후 다운캐스팅하여 출력
			 */
			if(object instanceof Teacher)
			{
				System.out.println("Teacher객체=>"+ ((Teacher)object).getName());
			}
			else
			{
				System.out.println("저장된객체:"+ object);
			}
		} //end of while
		System.out.println();
		
		/*포함 여부 확인
		 : set 컬렉션 내에 해당 객체가 있는지만 확인*/
		System.out.println(set.contains(varString1) ? "varString1 있음" : "varString1 없음");
	
		/*객체 삭제
		  : set 컬렉션은 인덱스가 없으므로 객체의 참조값을 통해서만 삭제할 수 있다*/
		System.out.println(set.remove(varString2) ? "varString2 삭제 성공" : "varString2 삭제 실패");
		/*전체 삭제
		  : list 컬렉션과 동일하다*/
		set.clear();
		System.out.println("전체삭제:"+ set.removeAll(set));
		System.out.println("[전체 삭제 후 객체 수]:"+ set.size());
		
	}
}
