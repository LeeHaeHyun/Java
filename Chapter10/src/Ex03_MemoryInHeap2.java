/*
 디버깅하며 배우는 힙 영역 객체 참조
 */
public class Ex03_MemoryInHeap2
{

	public static void main(String[] args)
	{
		Book book1 = new Book(); // 객체 생성
		book1.num = 10;
		
		Book book2 = book1; // 객체에 객체 대입
		System.out.println(book1);
		System.out.println(book2);
		
		System.out.println("book1.num : " + book1.num);
		System.out.println("book2.num : " + book2.num);
		System.out.println("-------------------------------");

		book2.num = 20;
		
		// 같은 주소에 있는 힙영역에 저장된 수를 바꾸었으니 book1도 같이 바뀐다
		System.out.println("book1.num : " + book1.num); 
		System.out.println("book2.num : " + book2.num);
	}

}
