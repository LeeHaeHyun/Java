class Book4
{
	String author;
	
	// tostring() 메서드 오버라이딩
	public String toString()
	{
		return author; // 멤버 변수 리턴하는 것으로 바꿨다
	}
}
public class Ex04_toString3
{
	public static void main(String[] args)
	{
		Book4 myBook = new Book4();
		myBook.author = "홍길동";
		System.out.println(myBook.author);
		
		//toString()을 오버라이딩 하여 이름이 출력
		System.out.println(myBook);
	}
}