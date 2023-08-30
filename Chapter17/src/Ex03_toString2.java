class Book3
{
	String author; // 객체를 만들기 위해
}

public class Ex03_toString2
{
	public static void main(String[] args)
	{
		Book3 myBook = new Book3(); // 객체 생성
		myBook.author = "홍길동"; // 스택 영역은 변수를 생성해도 참조값(주소) 밖에 없다
		System.out.println(myBook.author); // 참조 변수의 멤버변수 값 출력
		
		// 상속 받은 그대로의 원형. '클래스명@해시코드'
		System.out.println(myBook); // 객체 자체 주소 출력
	
		// mbook의 변수 자체에 홍길동이 있으므로 홍길동이 출력
		String mbook = "홍길동";
		System.out.println(mbook);		
	}
}
