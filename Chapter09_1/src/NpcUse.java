//클래스의 정의 : 객체를 추상화해 놓은 것
//추상화 : 현실세계의 사물을 클래스로 형상화 하는 것
//클래스 선언시 class 키워드를 사용하며 클래스의 첫글자는 반드시 대문자
//또한 public이라는 접근 지정자는 하나의 java파일에 한번만 사용가능

class Npc
{
	// 필드를 정의 : 클래스에서 데이터로 사용
	// 멤버변수 : 클래스에서 주로 속성(데이터)로 표현한다
	// 사람을 표현한 클래스이므로 나이, 이름 등이 정의되어있다.
	String name; // 멤버 변수
	int hp;
	void say() // 멤버 메소드
	{
		System.out.println("안녕하세요.");
	}
}

public class NpcUse
{
	// 클래스를 이용해 객체 생성
	// npc 객체 만들기
	// 클래스 타입의 변수는 new를 통해 객체를 생성
	// 클래스 타입의 참조 변수는 스택, 생성된 객체는 힙에 적재
	// 자료형이 npc 클래스형이 saram1 변수를 만듬
	
	public static void main(String[] args)
	{
		Npc saram1 = new Npc(); //객체 생성 및 참조변수 선언
		//필드 접근
		saram1.name = "경비"; // 멤버 변수에 직접 접근, 초기화
		saram1.hp = 100; // 멤버 변수에 직접 접근, 초기화
		System.out.println(saram1.name + ":" + saram1.hp); // 출력
		System.out.println(saram1);
		saram1.say(); // 메소드를 호출
	}
}

//객체 만들기
//현실 >> 만들어진 자동차가 실제로 눈 앞에 보임
//컴퓨터 >> 객체를 메모리에 적제