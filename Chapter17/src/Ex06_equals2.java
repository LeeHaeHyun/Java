class Book6
{
	String author;
	
	/*
	MyClass객체간의 비교를 위해 equals()를 오버라이딩하여 재정의
	 */
	public boolean equals(Object obj)
	{
		if(this.author == ((Book6)obj).author) // 변수값 비교 재정의 .author의 멤버변수의 값을 비교 = 문자열 
			return true;
		else
			return false;
	}
}

public class Ex06_equals2
{
	public static void main(String[] args)
	{
		Book6 myBook1 = new Book6(); 
		myBook1.author = "홍길동"; 
		
		Book6 myBook2 = new Book6();
		myBook2.author = "홍길동"; 
		
		if ( myBook1.equals(myBook2)) // String 변수 값을 비교
			System.out.println("두 객체의 author 변수의 값은 같습니다.");
		else
			System.out.println("두 객체의 author 변수의 값은 다릅니다.");
	}
}