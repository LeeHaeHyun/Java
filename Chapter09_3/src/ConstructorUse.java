/*
 생성자 : 객체 생성을 할 때만 호출하는 특수한 메소드
 - 클래스를 객체화 할 때 자동으로 호출하는 메소드
 - 자동으로 호출되며 반환값이 없다
 - ★★★ 오버로딩이 있는 생성자가 있을 때는 반드시 디폴드 생성자를 만들어야 한다
 */
class Book
{
	String title;
	int price;
	int num = 0;
	
	// 디폴트 생성자는 보통 생략하나, 오버로딩을 한다면 반드시 만들어줘야 한다
	Book() // 디폴드 생성자에 기능 부여 // 클래스 book을 만들면 생략된 생성자
	{
		title = "자바 프로그래밍";
		price = 30000;
	}
	
	Book(String t, int p) // 다른 책들을 추가하고 싶을때 (오버로딩)
	{
		title = t;
		price = p;
	}
	
	void print()
	{
		System.out.println("제    목 :" + title); 
		System.out.println("가    격 :" + price); 
		System.out.println("주문수량 :" + num); 
		System.out.println("합계수량 :" + price * num); 
		System.out.println("=============================="); 
		
	}
}
public class ConstructorUse
{

	public static void main(String[] args)
	{
		Book book1 = new Book(); //디폴트 생성자 사용
		book1.print();
		
		//오버로딩된 생성자 사용
		Book book2 = new Book("자바 디자인패턴", 35000);
		book2.num = 10;
		book2.print();
	}
}
