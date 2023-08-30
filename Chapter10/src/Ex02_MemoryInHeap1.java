
public class Ex02_MemoryInHeap1
{
	public static void main(String[] args)
	{
		Book book1 = new Book(); //앞의 book은 스택, new Book은 힙 영역
		Book book2 = new Book();
		
		book1.num = 10;
		book2.num = 20;
		
		System.out.println(book1.num);
		System.out.println(book2.num);
		
		book1 = null; // heap 영역 메모리 null 만들기
		book2 = null; // heap 영역 메모리 null 만들기
	}
}
