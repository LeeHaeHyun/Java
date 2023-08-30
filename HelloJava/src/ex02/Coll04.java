package ex02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

/*Q. "그만"이 입력될 때까지 입력키, 아이디, 비밀번호 정보를 가진 ID 클래스를 작성하고
입력키를 '키'로 하는 HashMap<String, ID> 컬렉션을 만들어서 사용자로부터 입력받아
입력키: 네이버, 다음, 쿠팡, 티몬, 애플로 계정을 저장하시오.
그리고 입력키로 아이디, 비밀번호를 출력하는 프로그램을 만드시오*/
class ID
{
	// private 개인정보 은닉화
	private String key; 
	private String ida, pass; // 아이디, 비번

	//생성자(매개변수)
	public ID(String key, String ida, String pass)
	{
		this.key = key;
		this.ida = ida;
		this.pass = pass;
	}
	// private을 간접적으로 얻어오기 위한 getter
	public String getkey()
	{
		return key;
	}
	// private을 간접적으로 얻어오기 위한 getter
	public String getida()
	{
		return ida;
	}
	// private을 간접적으로 얻어오기 위한 getter
	public String getpass()
	{
		return pass;
	}
}

public class Coll04
{
	public static void main(String[] args)
	{
		// 입력값을 받고 HashMap 컬렉션 생성
		Scanner sc = new Scanner(System.in);
		HashMap<String, ID> info = new HashMap<String, ID>();

		System.out.println("▶ 등록할 키값, 아이디, 비밀번호 입력: ");

		//값을 저장하기 위한 반복문 생성
		for (int i = 0; i < 5; i++)
		{
			System.out.print(">> ");
			String text = sc.nextLine();
			// ,(쉼표를 기준으로) 문자열을 쪼갬
			StringTokenizer st = new StringTokenizer(text, ","); 
			// 앞뒤 공백을 제거(trim), 입력한 값을 변수에 저장한다.
			String key = st.nextToken().trim(); 
			String ida = st.nextToken().trim();
			String pass = st.nextToken().trim();

			// 생성자 id로 매개변수를 호출
			ID ID = new ID(key, ida, pass);
			// key와 ID는 HASHMAP 컬렉션에 넣는다.
			info.put(key, ID);
		}
		
		Set<String> key01 = info.keySet(); // 해시맵 info에 있는 모든 키 Set 컬렉션으로 변환
		Iterator<String> it = key01.iterator(); // Set을 순차검색하는 이터레이터 생성
		System.out.println("---------------------------");
		while (it.hasNext())
		{
			String key1 = it.next();
			ID ID = info.get(key1); // ID를 키로 하여 객체를 얻는다.
			System.out.println("정상적으로 저장했습니다.");
			System.out.print(ID.getkey() + " ");
			System.out.print(ID.getida() + " ");
			System.out.println(ID.getpass() + " ");
		}
		System.out.println("---------------------------");

		while (true)
		{
			System.out.print("★ 조회할 키값 입력 >> ");
			String key1 = sc.nextLine();
			if (key1.equals("그만"))
				break;

			ID ID = info.get(key1); // 해시맵에서 이름을 키로 검색
			if (ID == null)
			{ // 이름이 해시맵에 없다면
				System.out.println(key1 + "라는 데이터는 존재하지 않습니다.");
			} else
			{ // 해시맵에서 검색된 목록 출력
				System.out.println("====================");
				System.out.println("키값(key): "+ID.getkey());
				System.out.println("아이디(id): "+ID.getida());
				System.out.println("비밀번호(pw): "+ID.getpass());
				System.out.println("====================");
			}
		}
		sc.close();
	}
}
