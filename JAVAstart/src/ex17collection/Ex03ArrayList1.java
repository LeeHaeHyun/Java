package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
ArrayList<E> : list계열의 컬렉션
- 데이터 접근시 get() 혹은 iterator()을 이용한다
- 중복저장이 허용되고 순서를 가진다
 */
public class Ex03ArrayList1
{
	/*
	스트링 객체를 저장할 수 있는 list컬렉션 생성
	ArrayList와 데이터를 저장하는 내부적인 자료 구조만 다를 뿐 사용법은 100% 동일
	 */
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		//LinkedList<String> list = new LinkedList<String>();
		//Vector<String> list = new Vector<String>();

	
		/* 객체 저장 : add()
		 add(객체) : 순차적으로 저장하면서 인덱스는 0부터 자동으로 부여
		 add(인덱스, 객체) : 데이터 저장시 인덱스를 직접 부여한다. 
		 단, 인덱스를 건너뛰면 에러가 발생하므로 주의해야 한다
		 해당 인덱스에 이미 객체가 저장되어 있다면 삽입(끼워넣기)된다*/
		list.add("소녀시대");
		list.add("빅뱅");
		list.add("트와이스");
		list.add(3,"워너원");
//		list.add(5,"소방차ㅋㅋ"); 인덱스를 건너띌 수가 없다, 4번이 나와야 한다
		
		/*
		저장된 객체수 (리스트의 크기) : size()
		참조변수.size() : 컬렉션에 저장된 객체의 갯수 즉 크기가 반환된다
		배열의 length와 동일하다.
		 */
		list.add(list.size(),"오마이걸");
		list.add(list.size(),"방탄소년단");
		System.out.println("중복 저장전 객체수:"+ list.size());
		
		/* 중복 저장: 뒤부터 끼어넣기가 된다
		 : list는 배열의 특성을 가지므로 데이터의 중복저장이 허용된다
		 동일한 데이터라 할지라도 index로 구분할 수 있기 때문이다
		 add() 메소드는 추가에 성공한 경우 true로 반환*/
		System.out.println(list.add("트와이스") ? "중복저장됨":"중복저장 안됨");
		System.out.println("중복 저장후 객체수:" + list.size());
	
		/* 컬렉션 출력하기
		 * 방법1 : 일반 for문을 사용. 이 때는 인덱스를 통해 접근해야 하므로
		 get() 메소드를 사용한다.*/
		System.out.println("\n[일반for문 사용]");
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i) + " "); //get 메소드 사용
		}
		
		/*
		방법2: 확장for문의 경우 인덱스가 없이 전체 원소를 반복
		좀 더 간결한 표현이 가능하다. 따라서 가장 많이 사용한다
		 */
		System.out.println("\n[확장for문 사용]");
		for(String obj : list) // 전체(obj) 스트링을 불러온다(변수이지만 의미가 없다) = 전체이므로
		{
			System.out.print(obj + " "); // 오브젝트 불러서 하나씩 차례대로 출력
		}
		
		/* Iterator 사용법
		 * 방법3
		 1. 컬렉션에 저장된 내용을 Iterator 객체에게 알려주기 위해 객체를 생성
		 2. hasNext()로 반환도니 객체가 있는지 검사하고, next()로 객체를 반환
		 3. 모든 객체가 반환되었다면 false를 반환하여 반복문을 탈출*/
		System.out.println("\n[반복자(Itarator) 사용]");
//		Iterator<String> itr = list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.print(itr.next()+ " ");
//		}
//		System.out.println("\n=================\n");
		
		// Iterator을 for문으로 그대로 바꾼 것(위와 같음)
		for(Iterator itr = list.iterator(); itr.hasNext();)
		{
			System.out.println(itr.next() + " ");
		}
		/*
		수정하기(덮어쓰기)
			: 기존의 내용을 변경한다. 즉 기존의 내용은 삭제된 후 새로운 내용으로 갱신
			set(인덱스, 객체); - 이걸로 쓴다
		 */
		list.set(4, "오마이걸>덮어쓰기");
		for(Object obj : list)
		{
			System.out.print(obj + " ");
		}
		System.out.println("\n==================\n");
		
		/*삽입하기(끼워넣기)
		 	: add(삽입할 인덱스, 객체) - 이렇게 쓴다
		 	해당 인덱스에 객체를 삽입하고, 기존 객체는 자동으로 뒤로 밀려난다
		 	즉, 자동으로 인덱싱된다.*/
		list.add(4, "블랙핑크>삽입하기");
		for(Object obj : list)
		{
			System.out.print(obj + " ");
		}
		System.out.println("\n=================\n");
		
		/*포함여부확인
		 contains(객체) : 찾고자 하는 객체가 있는 경우 true 반환
		 단지 존재 여부만 확인할 수 있다 true, false*/
		System.out.println(list.contains("빅뱅") ? "빅뱅 있음" : "빅뱅 없음");
		System.out.println(list.contains("블랙핑크") ? "블랙핑크 있음" : "블랙핑크 없음");

		/*삭제방법1
		방법1 : 인덱스로 삭제( 순서가 중요 )
		 remove(인덱스) : 인덱스를 통해 삭제를 진행한 후 삭제가 완료되면 해당 객체를 반환
		 삭제 후에는 인덱스가 자동으로 재부여, 삭제 성공시 해당 객체를 반환하므로 
		 어떤 객체가 삭제되었는지 확인할 수 있다.*/
		
		Object obj = list.remove(2); // 2번 인덱스 삭제 : 트와이스,
		System.out.println("삭제된 객체:" + obj);
		
		/*방법2*/
		int index = list.indexOf("빅뱅"); // indexOf를 통해 해당 객체의 인덱스를 찾은 후 삭제
		System.out.println("빅뱅의 index="+ index); // 빅뱅 인덱스가 어딨는지 알고 싶을 때
		list.remove(index);
		
		/*방법3
		인덱스를 모를 때 객체의 참조값을 통해 삭제가 가능하다
		즉, boolean 타입을 가진다.
		단, 중복을 조심해야 한다.*/
		System.out.println(list.remove("방탄소년단") ? "삭제성공(방탄)" : "삭제실패(방탄)");
		
		// 객체가 없으므로 삭제에 실패한다
		System.out.println(list.remove("오마이걸") ? "삭제성공(마이걸)" : "삭제실패(마이걸)");
		System.out.println("삭제후 출력");
		for(Object ob : list)
		{
			System.out.print(ob + " ");
		}
		System.out.println();
		
		/*전체삭제
		 : 아래 2개의 메소드를 통해 데이터 전체를 삭제할 수 있다.*/
		list.removeAll(list); // 둘 중 아무거나 사용이 가능
		list.clear();
		System.out.println("전체삭제후 객체수:"+ list.size());
	}
}
