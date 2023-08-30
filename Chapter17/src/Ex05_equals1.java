class Book5
{
	String author;
}

/*
equals() 메소드

 */
public class Ex05_equals1
{
	public static void main(String[] args)
	{
		Book5 myBook1 = new Book5(); // new를 생성할때마다 주소값 다름
		myBook1.author = "홍길동"; 
		
		Book5 myBook2 = new Book5(); // new를 생성할때마다 주소값 다름
		myBook2.author = "홍길동"; 
		
		if ( myBook1.equals(myBook2)) // equals : 참조값을 비교 // myBook1과 myBook2는 객체라서 id를 비교한다
			//myBook1.author로 해야 안에 있는 내용을 비교한다
			System.out.println("두 객체의 참조 id는 같습니다.");
		else
			System.out.println("두 객체의 참조 id는 다릅니다.");
		
		if ( myBook1.author.equals(myBook2.author))
			System.out.println("두 객체의 값은 같습니다. ");
		else
		{
			System.out.println("두 객체의 값은 다릅니다.");
		}
	}
}