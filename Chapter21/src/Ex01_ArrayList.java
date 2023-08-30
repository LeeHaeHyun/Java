import java.util.ArrayList;
import java.util.List;

/*
ArrayList<E> : list계열의 컬렉션
- 데이터 중복 저장이 허용
- 데이터의 저장 순서를 보장
- 데이터 접근시 get() 혹은 iterator()를 이용한다
- Array라는 이름처럼 '배열'의 특성을 가지고 있어서 인덱스를 통한 저장 및 접근이 가능
- 탐색 또는 정렬을 자주 사용하는 경우에 많이 사용
- 추가가 가능하나 시간이 오래걸린다. 이사하여 처음부터 다 쓰여지기 때문
 */
public class Ex01_ArrayList
{

	public static void main(String[] args)
	{
		//List가 더 상위, 그 아래에 arraylist가 있음 ( 컨트롤 + T )
		List<String> list = new ArrayList<>(); // 자식을 부모에 대입
		
		/*
		add(객체) : 순서대로 저장하면서 인덱스는 0부터 자동으로 부여
		add(객체, 인덱스) : 데이터 저장시 인덱스를 직접 부여 
		단, 인덱스를 건너뛰면 에러가 발생함. 해당 인덱스에 이미 객체가 저장되어 있다면
		삽입이 가능하다
		 */
		//객체 저장 : 순서 있음. 중복 허용
		list.add("orange"); // 추가할 때 add() 사용
		list.add("apple");
		list.add("apple");
		list.add("banana");
		
		// 추가
		list.add(4, "banana"); //- 5번째에 바나나 추가
//		list.add(6, "banana"); // - 6번째를 건너띄고 7번째를 추가하면 에러 발생
		list.add(list.size(), "mango"); // list.size 크기 끝에 추가해라! 
		System.out.println("중복 저장전 객체수 : " + list.size());
		
		/*
		중복 저장 가능
			: List는 배열의 특성을 가지므로 데이터의 중복저장이 허용된다.
			동일한 데이터라 할지라도 index로 구분할 수 있기 때문이다.
		 */
		System.out.println(list.add("mango") ? "중복저장됨" : "중복 저장 안됨");
		System.out.println("중복 저장 후 객체수 : " + list.size());
		
		/*
		컬렉션 출력시 일반 for문 사용. 이때는 인덱스를 통해 접근하므로 get()메소드를 사용
		 */
		
		//객체 참조, 일반 for문 사용
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t'); // data를 부를 때 get() 사용
		System.out.println();
		
		//첫번째 객체 삭제
		list.remove(0); // 첫번째 데이터(0번째) 삭제되면 나머지 순서가 앞으로 당겨짐
		
		//삭제 후 객체 참조
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
	}
}
